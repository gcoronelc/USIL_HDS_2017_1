package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    Clase1 o = new Clase2();
    
    System.out.println("Compatibilidad:");
    System.out.println("con Object: " + ( (o instanceof Object)?"SI":"NO"));
    System.out.println("con Clase1: " + ( (o instanceof Clase1)?"SI":"NO"));
    System.out.println("con Clase2: " + ( (o instanceof Clase2)?"SI":"NO"));
    System.out.println("con Clase3: " + ( (o instanceof Clase3)?"SI":"NO"));
    System.out.println("con Clase4: " + ( (o instanceof Clase4)?"SI":"NO"));
    
    Object o2 = o;
    Clase2 o3 = (Clase2) o;
  }
  
  
}
