package pe.egcc.bookstoreapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.mapper.EmpleadoMapper;
import pe.egcc.bookstoreapp.model.Empleado;

public class EmpleadoService {

  // Consultas
  private final String SQL_SELECT = "select idempleado, apellido, "
          + "nombre, direccion, email "
          + "from empleado ";

  // =============================================
  // CRUD
  // =============================================
  public Empleado read(Long idempleado) {

    return null;
  }

  public List<Empleado> read(Empleado bean) {
    List<Empleado> lista = new ArrayList<>();
    // Inicio del proceso        
    Connection cn = null;
    try {
      
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT
              +" where apellido like concat('%',?,'%') "
              + "and nombre  like concat('%',?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getApellido());
      pstm.setString(2, bean.getNombre());
      ResultSet rs = pstm.executeQuery();
      EmpleadoMapper mapper = new EmpleadoMapper();
      while(rs.next()){
        Empleado emp = mapper.mapRow(rs);
        lista.add(emp);
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
    // Fin del proceso
    return lista;
  }

  public void create(Empleado bean) {
    Connection cn = null;
    try {
      // Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      
      
      // Confirmar TX
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  public void update(Empleado bean) {
Connection cn = null;
try {
  // Inicio de Tx
  cn = AccesoDB.getConnection();
  cn.setAutoCommit(false);
  
  
  // Confirmar TX
  cn.commit();
} catch (Exception e) {
  try {
	cn.rollback();
  } catch (Exception e1) {
  }
  throw new RuntimeException(e.getMessage());
} finally{
  try {
	cn.close();
  } catch (Exception e) {
  }
}
  }

  public void delete(Long idempleado) {
Connection cn = null;
try {
  // Inicio de Tx
  cn = AccesoDB.getConnection();
  cn.setAutoCommit(false);
  
  
  // Confirmar TX
  cn.commit();
} catch (Exception e) {
  try {
	cn.rollback();
  } catch (Exception e1) {
  }
  throw new RuntimeException(e.getMessage());
} finally{
  try {
	cn.close();
  } catch (Exception e) {
  }
}
  }

}
