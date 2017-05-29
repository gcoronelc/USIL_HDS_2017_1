package pe.egcc.appventa.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class CompFactory {

  private CompFactory() {
  }
 
  
  public final static String COMP_FACTURA = "Factura";
  public final static String COMP_BOLETA = "Boleta";
  
  public static String[] getTipos(){
    String[] tipos = {COMP_FACTURA, COMP_BOLETA};
    return tipos;
  }
  
  
  public final static CompAbstract get( String tipo ){
    CompAbstract comp = null;
    switch(tipo){
      case COMP_BOLETA:
        comp = new BoletaService();
        break;
      case COMP_FACTURA:
        comp = new FacturaService();
        break;
    }
    return comp;
  } 
  
  
}
