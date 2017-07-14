package pe.egcc.bookstoreapp.controller;

import pe.egcc.bookstoreapp.model.Empleado;
import pe.egcc.bookstoreapp.service.UsuarioService;
import pe.egcc.bookstoreapp.util.Session;

public class LogonController {

  public void validar(String usuario, String clave) {
    
    UsuarioService service = new UsuarioService();
    Empleado bean = service.validarUsuario(usuario, clave);
    
    if( bean == null){
      throw  new RuntimeException("Datos incorrectos");
    }
    
    Session.put("emp", bean);
    
  }
    
}
