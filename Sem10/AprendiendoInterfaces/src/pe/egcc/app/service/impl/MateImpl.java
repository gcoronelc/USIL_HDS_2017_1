package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.IMate;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateImpl implements IMate{

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public int restar(int n1, int n2) {
    return (n1 - n2);
  }

}
