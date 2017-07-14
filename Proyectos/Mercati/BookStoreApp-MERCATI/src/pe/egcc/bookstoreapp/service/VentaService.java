package pe.egcc.bookstoreapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.model.Venta;

public class VentaService {

  public Venta registrarVenta(Venta venta) {
    Connection cn = null;
    try {

      // Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);

      // Paso 1: Leer datos del producto
      String sql = "select precio, stock from publicacion "
              + "where idpublicacion = ? for update";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, venta.getIdpublicacion());
      ResultSet rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new SQLException("Publicación no existe.");
      }
      double precio = rs.getDouble("precio");
      int stock = rs.getInt("stock");
      rs.close();
      pstm.close();

      // Paso 2: Verificar stock
      if (stock < venta.getCantidad()) {
        throw new SQLException("No existe stock suficiente.");
      }

      // Paso 3: Actualizar stock
      stock -= venta.getCantidad();
      sql = "update publicacion set stock = ? where idpublicacion = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, stock);
      pstm.setString(2, venta.getIdpublicacion());
      int filas = pstm.executeUpdate();
      pstm.close();
      if (filas == 0) {
        throw new SQLException("Algo paso con la publicación, ya no existe.");
      }

      // Paso 4: Calcular descuento
      double dcto = 0.0;

      sql = "select porcentaje from promocion "
              + "where ? >= cantmin and ? <= cantmax for update";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, venta.getCantidad());
      pstm.setInt(2, venta.getCantidad());
      rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new SQLException("Algo malo ocurrio");
      }
      double porcentaje = rs.getDouble("porcentaje");
      rs.close();
      pstm.close();
      
      
      dcto = precio*porcentaje;

      // Paso 5: Otros calculos: total, subtotal, impuesto
      double total = (precio - dcto) * venta.getCantidad();
      double subtotal = total / 1.18;
      double impuesto = total - subtotal;

      // Paso 6: generar idventa
      sql = "select valor from control where parametro = 'venta' for update";
      pstm = cn.prepareStatement(sql);
      rs = pstm.executeQuery();
      if ( ! rs.next() ) {
        throw new SQLException("No se tiene acceso al contador.");
      }
      int idventa = Integer.parseInt(rs.getString("valor"));
      idventa++;
      sql = "update control set valor = ? where parametro = 'venta'";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, String.valueOf(idventa));
      pstm.executeUpdate();
              
      // Paso 7: Registrar venta
      Date fecha = new Date(Calendar.getInstance().getTime().getTime());
      sql = "insert into venta(idventa,cliente,fecha,idempleado,idpublicacion,"
              + "cantidad,precio,dcto,subtotal,impuesto,total) "
              + "values(?,?,?,?,?,?,?,?,?,?,?)";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, idventa);
      pstm.setString(2, venta.getCliente());
      pstm.setDate(3, fecha);
      pstm.setInt(4, venta.getIdempleado());
      pstm.setString(5, venta.getIdpublicacion());
      pstm.setInt(6, venta.getCantidad());
      pstm.setDouble(7, precio);
      pstm.setDouble(8, dcto);
      pstm.setDouble(9, subtotal);
      pstm.setDouble(10, impuesto);
      pstm.setDouble(11, total);
      pstm.executeUpdate();
      pstm.close();
            
      // Confirmar TX
      cn.commit();
      
      // Reporte
      venta.setIdventa(idventa);
      venta.setFecha(fecha);
      venta.setPrecio(precio);
      venta.setDcto(dcto);
      venta.setSubtotal(subtotal);
      venta.setImpuesto(impuesto);
      venta.setTotal(total);
      
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return venta;
  }

}
