package pe.egcc.bookstoreapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public final class Mensaje {

  private Mensaje() {
  }
  
  public static void showInfo(Component parent, String message){
    JOptionPane.showMessageDialog(parent, message, 
            "BOOKSTORE - INFO", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public static void showError(Component parent, String message){
    JOptionPane.showMessageDialog(parent, message, 
            "BOOKSTORE - ERROR", JOptionPane.ERROR_MESSAGE);
  }
    
}