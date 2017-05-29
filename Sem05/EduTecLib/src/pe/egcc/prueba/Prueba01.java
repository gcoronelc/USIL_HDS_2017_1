package pe.egcc.prueba;

import pe.egcc.util.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    // Service
    MateService service = new MateService();
    
    // Proceso
    System.out.println("6 y 5 = " + service.promediar(6, 5) );
    System.out.println("6, 9 y 12 = " + service.promediar(6, 9, 12 ) );
    System.out.println("6, 9, 7 y 12 = " + service.promediar(6, 9, 7, 12 ) );
    System.out.println("6, 9,  13, 15 y 12 = " + service.promediar(6, 9, 13, 15, 12 ) );
  }
  
}
