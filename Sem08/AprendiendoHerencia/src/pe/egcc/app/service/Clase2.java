package pe.egcc.app.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase2 extends Clase1{

  public Clase2() {
    super("Claudia");
  }
  
  
  @Override
  public int sumar(int n1, int n2) {
    System.out.println("Suma Old: " + super.sumar(n1, n2));
    int suma = (n1 + n2) * (n1 - n2);
    return suma;
  }

}
