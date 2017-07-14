/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.bookstoreapp.controller;

import pe.egcc.bookstoreapp.model.Venta;
import pe.egcc.bookstoreapp.service.VentaService;

/**
 *
 * @author Gabo
 */
public class VentasController {
    
    public Venta registrarVenta(String idpublicacion){
        
        Venta bean = new Venta();
        bean.setIdpublicacion(idpublicacion);
        
        VentaService service = new VentaService();
        return service.registrarVenta(bean);
    }
    
}
