package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    int n=5;
    // Proceso
    int[] serie = MateService.fibonacci(n);
    // Reporte
    for (int i = 0; i < serie.length; i++) {
      int num = serie[i];
      System.out.println(num);
    }
  }

  
}
