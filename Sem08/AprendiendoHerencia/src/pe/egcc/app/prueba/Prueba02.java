package pe.egcc.app.prueba;

import pe.egcc.app.service.AbstractMate;
import pe.egcc.app.service.MateImpl3;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    AbstractMate bean = new MateImpl3();
    System.out.println("Factorial de 5 es " + bean.factorial(5));
    System.out.println("MCD de 15 y 20: " + bean.mcd(15, 20));
  }

}
