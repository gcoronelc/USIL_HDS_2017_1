package concytec.Modelo;

public class BecaModelo {

  //input
  private String categoria;
  private String producto;
  private int meses;

  //output
  private double facInteres;
  private double importe;
  private double porcInt;
  private double valorCuota;

  public BecaModelo() {

  }

  public BecaModelo(String categoria, String producto, int meses) {
    this.categoria = categoria;
    this.producto = producto;
    this.meses = meses;
  }

  public BecaModelo(int meses, double FacInteres, double importe) {
    this.meses = meses;
    this.facInteres = FacInteres;
    this.importe = importe;

  }

  public double getFacInteres() {
    return facInteres;
  }

  public void setFacInteres(double facInteres) {
    this.facInteres = facInteres;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getPorcInt() {
    return porcInt;
  }

  public void setPorcInt(double porcInt) {
    this.porcInt = porcInt;
  }

  public double getValorCuota() {
    return valorCuota;
  }

  public void setValorCuota(double valorCuota) {
    this.valorCuota = valorCuota;
  }

  

}
