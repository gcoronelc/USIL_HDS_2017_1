package pe.egcc.bookstoreapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public final class AccesoDB {

  private AccesoDB() {
  }

  
  public static Connection getConnection(){
    Connection cn = null;
    try {
      // Parámetros de conexión
      String driver = "com.mysql.jdbc.Driver";
      String urlDB = "jdbc:mysql://192.168.1.36:3306/bookstore";
      String user = "book";
      String pass = "admin";
      // Cargar el driver
      Class.forName(driver).newInstance();
      // Realizar la conexión
      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("No se ha encontrado el driver.");
    } catch(SQLException e){
      throw new RuntimeException(e.getMessage());
    } catch(Exception e){
      throw new RuntimeException("No se tiene acceso a la base de datos.");
    }
    return cn;
  }
    
}
