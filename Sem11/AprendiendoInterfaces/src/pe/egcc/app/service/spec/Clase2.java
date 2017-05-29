package pe.egcc.app.service.spec;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase2 extends Clase1 implements IMate{

 @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public int restar(int n1, int n2) {
    return (n1 * n2);
  }

}
