package pe.egcc.eurekaapp.prueba;

import java.util.Map;
import pe.egcc.eurekaapp.service.EurekaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

    public static void main(String[] args) {

        try {
            // Dato
            String codigo = "00001";
            // Proceso
            EurekaService service = new EurekaService();
            Map<String,Object> rec = service.getCliente(codigo);
            // Reporte
            for(String key: rec.keySet() ){
                System.out.println(key + " => " + rec.get(key));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
