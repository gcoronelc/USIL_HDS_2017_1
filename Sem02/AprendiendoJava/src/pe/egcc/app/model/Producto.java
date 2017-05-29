package pe.egcc.app.model;

public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    this.nombre = "Entrada para el partido Peru - Colombia";
    this.precio = 500.0;
    this.stock = 40000;
    this.activo = true;
    System.out.println("Producto creado.");
  }

  /**
   * Constructor adicional.
   * 
   * @param nombre Nombre del producto.
   * @param precio Precio de venta.
   * @param stock Stock en almacen.
   * @param activo Estado del producto.
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }
  
  /**
   * Constructor adicional.
   * 
   * @param nombre Nombre del producto.
   */
  public Producto(String nombre) {
    this.nombre = nombre;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
