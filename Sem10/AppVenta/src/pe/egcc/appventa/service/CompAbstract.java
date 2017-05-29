package pe.egcc.appventa.service;

import pe.egcc.appventa.model.ItemModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public abstract class CompAbstract {
  
  
  public abstract ItemModel[] procesarVenta(double total);

  protected void validarTotal(double total){
    if(total <= 0.0){
      throw new RuntimeException("El total debe ser positivo.");
    }
  }

}
