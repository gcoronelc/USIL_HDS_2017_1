package pe.egcc.appventa.prueba;

import pe.egcc.appventa.model.ItemModel;
import pe.egcc.appventa.service.BoletaService;
import pe.egcc.appventa.service.CompAbstract;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 4680.0;
    // Proceso
    CompAbstract comp = new BoletaService();
    ItemModel[] repo = comp.procesarVenta(total);
    // Reporte
    for (ItemModel model : repo) {
      System.out.println(model.getConcepto() + " --> " + model.getImporte() );
    }
  }
  
  
}
