package concytec.Prueba;

import concytec.Modelo.BecaModelo;
import concytec.Service.BecaService;

public class Prueba01 {

  public static void main(String[] args) {

    // Datos
    BecaModelo model = new BecaModelo("Estudios", "Doctorado", 12);
    // Proceso
    BecaService service = new BecaService();
    model = service.ProcesarBeca(model);
    // Reporte
    System.out.println("Importe: " + model.getImporte());
    System.out.println("Meses: " + model.getMeses());
    System.out.println("Pocr. Interes: " + model.getPorcInt());
    System.out.println("Valor cuota: " + model.getValorCuota());

  }
}
