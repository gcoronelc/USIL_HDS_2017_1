package concytec.Service;

import concytec.Modelo.BecaModelo;

public class BecaService {

  public BecaModelo ProcesarBeca(BecaModelo model) {
    // Variable
    double valorCuota;
    double porcInt;
    double factInteres;
    double importe;
    // Factor de interes
    factInteres = 0.0;
    switch(model.getMeses()){
      case 6:
        factInteres = 0.07;
        break;
      case 12:
        factInteres = 0.12;
        break;
      case 18:
        factInteres = 0.17;
        break;
    }
    // Determinar importe
    importe = 0.0;
    switch(model.getCategoria().toUpperCase()){
      case "ESTUDIOS":
        switch (model.getProducto().toUpperCase()){
          case "PREGRADO":
            importe = 10000.0;
            break;
          case "MAESTRIA":
            importe = 15000.0;
            break;
          case "DOCTORADO":
            importe = 25000.0;
            break;                    
        }
        break;
      case "TESIS":
       switch (model.getProducto().toUpperCase()){
          case "PREGRADO":
            importe = 5000.0;
            break;
          case "MAESTRIA":
            importe = 8000.0;
            break;
          case "DOCTORADO":
            importe = 12000.0;
            break;                    
        }        
        break;
    }
    // Factor de interes
    
    // Valor de la cuota
    valorCuota = ((importe * (1 + factInteres)) / model.getMeses());
    // Porcentaje de interes
    porcInt = factInteres * 100;
    //repote
    model.setValorCuota(valorCuota);
    model.setPorcInt(porcInt);
    model.setImporte(importe);
    return model;

  }

}
