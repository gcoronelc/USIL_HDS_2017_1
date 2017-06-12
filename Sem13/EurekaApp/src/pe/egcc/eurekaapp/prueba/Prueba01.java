package pe.egcc.eurekaapp.prueba;

import java.sql.Connection;
import pe.egcc.eurekaapp.db.AccesoDB;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
      
    try {
      Connection cn;
      cn = AccesoDB.getConnection();
      System.out.println("Conexión ok.");
      cn.close();
    } catch (Exception e) {
      System.err.println("Que pasa");
      System.err.println(e.getMessage());
    }
    
  }
  
}
