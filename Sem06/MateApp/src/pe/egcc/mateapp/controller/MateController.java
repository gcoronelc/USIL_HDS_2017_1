package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateController {

  public int[] fibonacci(int n) {
    return MateService.fibonacci(n);
  }
  
}
