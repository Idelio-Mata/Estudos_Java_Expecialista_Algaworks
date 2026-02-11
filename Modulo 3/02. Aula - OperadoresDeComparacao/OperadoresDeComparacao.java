public class OperadoresDeComparacao {

  public static void main (String [] a) {
    int pesoProduto = 9000;
    int limitePesoCaminhao = 1000;
    int limitePesoCaminhao2 = 200;
    
    boolean cargaAceitavel = pesoProduto <= limitePesoCaminhao;
    System.out.printf("Carga ideal: %b%n", cargaAceitavel);

    boolean cargaExcedida = pesoProduto > limitePesoCaminhao2;
    System.out.printf("Carga Excedida: %b%n", cargaExcedida);
    

  
  }
}