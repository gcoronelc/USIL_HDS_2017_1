package tarea02app.controller;

import tarea02app.Model.TareaModel;
import tarea02app.Service.TareaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class TareaController {

  private TareaService service;

  public TareaController() {
    service = new TareaService();
  }
  
  public double getPrecio(String ciudad, String producto){
    return service.getPrecio(ciudad, producto);
  }
  
  
  public TareaModel procesar(TareaModel model){
    return service.procesar(model);
  }
  
}
