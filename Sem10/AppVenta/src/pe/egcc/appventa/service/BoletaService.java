package pe.egcc.appventa.service;

import pe.egcc.appventa.model.ItemModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class BoletaService extends CompAbstract{

  @Override
  public ItemModel[] procesarVenta(double total) {
    // Variables
    double servicio, totalGeneral;
    // Validar
    validarTotal(total);
    // Proceso
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    ItemModel[] repo = {
      new ItemModel("Total", total),
      new ItemModel("Servicio", servicio),
      new ItemModel("Total General", totalGeneral)
    };
    return repo;    
  }

}
