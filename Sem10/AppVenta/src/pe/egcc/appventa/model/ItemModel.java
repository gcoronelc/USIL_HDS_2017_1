package pe.egcc.appventa.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class ItemModel {
  
  private String concepto;
  private double importe;

  public ItemModel() {
  }

  public ItemModel(String concepto, double importe) {
    this.concepto = concepto;
    this.importe = importe;
  }

  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
  

}
