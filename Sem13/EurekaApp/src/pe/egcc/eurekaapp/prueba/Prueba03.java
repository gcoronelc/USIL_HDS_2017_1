package pe.egcc.eurekaapp.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.EurekaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

    public static void main(String[] args) {

        try {
            // Dato
            String sucursal = "002";
            // Proceso
            EurekaService service = new EurekaService();
            List<Map<String,Object>> lista = service.getClientesSucursal(sucursal);
            // Reporte
            for(Map<String,Object> rec: lista ){
                String row = "";
                for(String key: rec.keySet()){
                    row += rec.get(key).toString() + "    ";
                }
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
