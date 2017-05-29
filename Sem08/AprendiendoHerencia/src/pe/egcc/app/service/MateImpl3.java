package pe.egcc.app.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateImpl3 extends AbstractMate {

  @Override
  public long factorial(int n) {
    long f;
    switch (n) {
      case 0:
      case 1:
        f = 1;
        break;
      default:
        f = n * factorial(n - 1);
    }
    return f;
  }

}
