/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02app.Prueba;

import tarea02app.Model.TareaModel;
import tarea02app.Service.TareaService;

/**
 *
 * @author Gabo
 */
public class Prueba01 {
    public static void main(String[] args) {
        //Datos
        TareaModel model = new TareaModel("CUZCO", "TURISMO CULTURAL", 0, 10);
        
        //Proceso
        TareaService service = new TareaService();
        model = service.procesar(model);
        
        //Reporte
        System.out.println("Ciudad: "+model.getCiudad());
        System.out.println("Producto: "+model.getProducto());
        System.out.println("Precio por Persona: "+model.getPrecio());
        System.out.println("Cantidad de Personas: "+model.getCantPer());
        System.out.println("Subtotal: "+model.getSubTotal());
        System.out.println("I.G.V. : "+model.getIgv());
        System.out.println("Total: "+model.getTotal());
        
   }
    
}
