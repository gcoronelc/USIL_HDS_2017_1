package pe.egcc.bookstoreapp.controller;

import java.util.List;
import pe.egcc.bookstoreapp.model.Empleado;
import pe.egcc.bookstoreapp.service.EmpleadoService;

public class CrudEmpleadoController {

  public List<Empleado> read(String apellido, String nombre) {
    
    // Preparando data
    Empleado bean = new Empleado();
    bean.setApellido(apellido);
    bean.setNombre(nombre);
    
    // Proceso
    EmpleadoService service = new EmpleadoService();
    return service.read(bean);
    
  }
  
}
