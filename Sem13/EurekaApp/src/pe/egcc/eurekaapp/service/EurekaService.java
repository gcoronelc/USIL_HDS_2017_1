package pe.egcc.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.db.AccesoDB;

public class EurekaService {

    public Map<String, Object> getCliente(String codigo) {
        Map<String, Object> bean = null;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select  "
                    + "chr_cliecodigo      codigo, "
                    + "vch_cliepaterno     paterno, "
                    + "vch_cliematerno     materno, "
                    + "vch_clienombre      nombre, "
                    + "chr_cliedni         dni, "
                    + "vch_clieciudad      ciudad, "
                    + "vch_cliedireccion   direccion, "
                    + "vch_clietelefono    telefono  , "
                    + "vch_clieemail       email  "
                    + "from cliente "
                    + "where chr_cliecodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                bean = new HashMap<>();
                bean.put("codigo", rs.getString("codigo"));
                bean.put("paterno", rs.getString("paterno"));
                bean.put("materno", rs.getString("materno"));
                bean.put("nombre", rs.getString("nombre"));
                bean.put("dni", rs.getString("dni"));
                bean.put("ciudad", rs.getString("ciudad"));
                bean.put("direccion", rs.getString("direccion"));
                bean.put("telefono", rs.getString("telefono"));
                bean.put("email", rs.getString("email"));
            }
            rs.close();
            pstm.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("No se puede ejecutar la consulta");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return bean;
    }

    public List<Map<String, Object>> getClientesSucursal(String sucursal) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "SELECT "
                    + "CU.chr_cuencodigo cuenta, "
                    + "MO.vch_monedescripcion moneda, "
                    + "CU.dec_cuensaldo saldo, "
                    + "CU.vch_cuenestado estado, "
                    + "concat(CL.vch_cliepaterno, "
                    + "', ', CL.vch_clienombre) cliente "
                    + "FROM MONEDA MO "
                    + "JOIN CUENTA CU "
                    + "ON MO.chr_monecodigo = CU.chr_monecodigo "
                    + "JOIN CLIENTE CL "
                    + "ON CU.chr_cliecodigo = CL.chr_cliecodigo "
                    + "WHERE CU.chr_sucucodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sucursal);
            ResultSet rs = pstm.executeQuery();
            while( rs.next() ) {
                Map<String,Object> bean = new HashMap<>();
                bean.put("cuenta", rs.getString("cuenta"));
                bean.put("moneda", rs.getString("moneda"));
                bean.put("saldo", rs.getString("saldo"));
                bean.put("estado", rs.getString("estado"));
                bean.put("cliente", rs.getString("cliente"));
                lista.add(bean);
            }
            rs.close();
            pstm.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("No se puede ejecutar la consulta");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

}
