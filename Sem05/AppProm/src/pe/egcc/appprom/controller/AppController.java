package pe.egcc.appprom.controller;

import pe.egcc.util.MateService;

public class AppController {

  private MateService mateService;

  public AppController() {
    mateService = new MateService();
  }

  public int promediar(int n1, int n2) {
    return mateService.promediar(n1, n2);
  }

}
