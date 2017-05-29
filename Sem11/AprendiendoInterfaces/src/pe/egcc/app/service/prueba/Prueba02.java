package pe.egcc.app.service.prueba;

import pe.egcc.app.service.impl.TodoImpl;
import pe.egcc.app.service.spec.IMate;
import pe.egcc.app.service.spec.ITodo;
import pe.egcc.app.service.spec.IVenta;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    TodoImpl bean = new TodoImpl();
    
    System.out.println("6 + 7 = " + bean.sumar(6, 7));
    System.out.println("10 - 5 = " + bean.restar(10, 5));
    System.out.println("Impuesto de 1000.0 = " + bean.calcularImpuesto(1000.0));
    System.out.println("Longitud de \"Gustavo\" = " + bean.longitud("Gustavo"));
    
  }
  
}
