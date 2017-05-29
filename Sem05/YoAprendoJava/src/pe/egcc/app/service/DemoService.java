package pe.egcc.app.service;

import java.util.Arrays;

public class DemoService {

  public static int promediar(int n1, int n2, int n3, int n4){
    int[] notas = {n1,n2,n3,n4};
    Arrays.sort(notas);
    int pr = (n1 + n2 + n3 + n4 - notas[0]) / 3;
    return pr;
  }

}
