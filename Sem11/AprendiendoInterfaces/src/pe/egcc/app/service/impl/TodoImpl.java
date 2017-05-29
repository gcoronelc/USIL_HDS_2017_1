package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.ITodo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class TodoImpl implements ITodo{

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public int restar(int n1, int n2) {
    return (n1 * n2);
  }

  @Override
  public double calcularImpuesto(double total) {
    return total* (1 - 1 / 1.18);
  }
  
  public int longitud(String cadena){
    return cadena.length();
  }

}
