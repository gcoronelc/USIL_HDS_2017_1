package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

public class Prueba01 {

  public static void main(String[] args) {
    
    //Producto p = new Producto();
    
    //Producto p = new Producto("Agua San Mateo", 3.0, 100, true);
    
    Producto p = new Producto("Computadora i9");
    
    mostrar(p);
    
    p.setNombre("Auto año 2017");
    p.setPrecio(60000.00);
    p.setStock(10);
    p.setActivo(true);
    
    mostrar(p);
    
  }

  private static void mostrar(Producto p) {
    System.out.println("-----------------------");
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    System.out.println("Activo: " + p.isActivo());
  }
  
  
  
}
