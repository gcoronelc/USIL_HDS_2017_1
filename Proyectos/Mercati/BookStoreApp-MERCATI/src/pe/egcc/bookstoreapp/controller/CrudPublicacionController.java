/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.bookstoreapp.controller;

import java.util.List;
import pe.egcc.bookstoreapp.model.Publicacion;
import pe.egcc.bookstoreapp.service.PublicacionService;

/**
 *
 * @author Gabo
 */
public class CrudPublicacionController {
    
    public List<Publicacion> read(String idpublicacion) {
    
    // Preparando data
    Publicacion bean = new Publicacion();
    bean.setIdpublicacion(idpublicacion);
    
    // Proceso
    PublicacionService service = new PublicacionService();
    return service.read(bean);
    
  }
    
}
