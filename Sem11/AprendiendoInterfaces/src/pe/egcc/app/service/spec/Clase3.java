package pe.egcc.app.service.spec;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase3 extends Clase2 implements IVenta{

  @Override
  public double calcularImpuesto(double total) {
    return total* (1 - 1 / 1.18);
  }
  
}
