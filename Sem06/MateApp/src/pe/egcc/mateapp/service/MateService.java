package pe.egcc.mateapp.service;

public final class MateService {

  private MateService() {
  }
  
  public static long factorial(int n){
    return 0;
  }
  
  public static int mcd(int n1, int n2){
    return 0;
  }
  
  public static int mcm(int n1, int n2){
    return 0;
  }
  
  public static int[] fibonacci(int n){
    int[] serie = null;
    switch(n){
      case 1:
        serie = new int[]{0};
        break;
      case 2:
        serie = new int[]{0,1};
        break;
      default:
        serie = new int[n];
        serie[0] = 0;
        serie[1] = 1;
        for(int i = 2; i < n; i++){
          serie[i] = serie[i-1] + serie[i-2];
        }
        break;
    }
    return serie;
  }
  
  public static boolean esPrimo(int n){
    return false;
  }
  
}
