package pe.egcc.app.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateImpl2 extends AbstractMate{

  @Override
  public long factorial(int n) {
    long f = 1;
    while(n > 1){
      f *= n--;
    }
    return f;
  }

}
