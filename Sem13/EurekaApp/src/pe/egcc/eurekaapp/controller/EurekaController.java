package pe.egcc.eurekaapp.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.EurekaService;

public class EurekaController {

     private EurekaService eurekaService;

    public EurekaController() {
        eurekaService = new EurekaService();
    }
     
     
    
    
    public List<Map<String, Object>> cuentasPorSucursal(String sucursal) {
        return eurekaService.getClientesSucursal(sucursal);
    }
    
}
