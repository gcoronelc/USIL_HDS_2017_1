package pe.egcc.bookstoreapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.bookstoreapp.model.Empleado;

public class EmpleadoMapper implements RowMapper<Empleado> {

  @Override
  public Empleado mapRow(ResultSet rs) throws SQLException {

    Empleado bean = new Empleado();
    bean.setIdempleado(rs.getLong("idempleado"));
    bean.setApellido(rs.getString("apellido"));
    bean.setNombre(rs.getString("nombre"));
    bean.setDireccion(rs.getString("direccion"));
    bean.setEmail(rs.getString("email"));
    return bean;
    
  }

}
