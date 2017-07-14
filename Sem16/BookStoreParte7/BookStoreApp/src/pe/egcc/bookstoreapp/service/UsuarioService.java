package pe.egcc.bookstoreapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.mapper.EmpleadoMapper;
import pe.egcc.bookstoreapp.model.Empleado;

public class UsuarioService {

  public Empleado validarUsuario(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idempleado, apellido, "
              + "nombre, direccion, email "
              + "from empleado "
              + "where idempleado = ("
              + "select idempleado from usuario "
              + "where usuario = ? "
              + "and clave = SHA(?) "
              + "and activo = 1 )";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        EmpleadoMapper mapper = new EmpleadoMapper();
        bean = mapper.mapRow(rs);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("No es posible realizar la validación.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

}
