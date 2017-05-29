package pe.egcc.app.prueba;

import pe.egcc.app.service.DemoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int n1 = 15, n2 = 18, n3 = 5, n4 = 17;
    // Proceso
    int pr = DemoService.promediar(n1, n2, n3, n4);
    // Reporte
    System.out.println("PR: " + pr);
  }
  
}
