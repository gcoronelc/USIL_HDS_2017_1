/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02app.Service;

import tarea02app.Model.TareaModel;

/**
 *
 * @author Gabo
 */
public class TareaService {
  
  
  public double getPrecio(String ciudad, String producto){
    return 1000;
  }

  public TareaModel procesar(TareaModel model) {
    //Variables
    double subTotal;
    double igv;
    double total;
    double precio;

    //Proceso
    precio = getPrecio(model.getCiudad(), model.getProducto());
    total = precio * model.getCantPer();
    subTotal = total / 1.18;
    igv = total - subTotal;

    //Reporte
    model.setSubTotal(subTotal);
    model.setIgv(igv);
    model.setTotal(total);
    model.setPrecio(precio);

    return model;
  }

}
