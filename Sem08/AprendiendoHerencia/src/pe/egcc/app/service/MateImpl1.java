package pe.egcc.app.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateImpl1 extends AbstractMate{

  @Override
  public long factorial(int n) {
    long f = 1;
    for(int i = 2; i <= n; f *= i, i++);
    return f;
  }

}
