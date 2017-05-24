package pe.egcc.app.service.prueba;

import pe.egcc.app.service.impl.MateImpl;
import pe.egcc.app.service.spec.IMate;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    IMate mate = new MateImpl();
    System.out.println("6 + 7 = " + mate.sumar(6, 7));
    System.out.println("8 - 3 = " + mate.restar(8, 3));
  }
  
}
