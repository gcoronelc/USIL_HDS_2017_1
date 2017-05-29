package pe.egcc.appventa.service;

import pe.egcc.appventa.model.ItemModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class FacturaService extends CompAbstract {

  @Override
  public ItemModel[] procesarVenta(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Validar
    validarTotal(total);
    // Proceso
    consumo = total / 1.18;
    impuesto = total - consumo;
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    ItemModel[] repo = {
      new ItemModel("Consumo", consumo),
      new ItemModel("Impuesto", impuesto),
      new ItemModel("Total", total),
      new ItemModel("Servicio", servicio),
      new ItemModel("Total General", totalGeneral)
    };
    return repo;
  }

}
