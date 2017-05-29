package pe.egcc.appventa.controller;

import pe.egcc.appventa.model.ItemModel;
import pe.egcc.appventa.service.CompFactory;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class AppController {

  public String[] traerTipos() {
    return CompFactory.getTipos();
  }

  public ItemModel[] procesarVenta(String tipo, double total) {
    return CompFactory.get(tipo).procesarVenta(total);
  }

  
  
  
  
}
