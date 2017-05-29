package pe.egcc.app.service.spec;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase4 extends Clase2{

  public static void main(String[] args) {
    
    Object bean = new Clase1();
    
    System.out.println("Objeto de tipo " + bean.getClass().toString());
    System.out.println("Compatible con: ");
    System.out.println("Object:" + ((bean instanceof Object)?"SI":"NO"));
    System.out.println("Clase1:" + ((bean instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2:" + ((bean instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3:" + ((bean instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4:" + ((bean instanceof Clase4)?"SI":"NO"));
    System.out.println("IMate:" + ((bean instanceof IMate)?"SI":"NO"));
    System.out.println("IVenta:" + ((bean instanceof IVenta)?"SI":"NO"));
  }
  
}
