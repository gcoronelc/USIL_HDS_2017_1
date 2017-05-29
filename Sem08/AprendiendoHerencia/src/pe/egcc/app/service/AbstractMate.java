package pe.egcc.app.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public abstract class AbstractMate {
  
  
  public abstract long factorial(int n);
  
  public int mcd(int n1, int n2){
    while(n1 != n2){
      if(n1 > n2){
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    return n1;
  }
  
}
