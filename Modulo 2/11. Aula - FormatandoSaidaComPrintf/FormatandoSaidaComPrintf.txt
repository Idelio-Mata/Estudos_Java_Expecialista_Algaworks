public class FormatandoSaidaComPrintf {

  public static void main (String [] args) {
  
    String nome1 = "Mata";
    System.out.printf("Ola, %s%n", nome1);
    //Resultado: Ola, Mata
    
    int quantidade = 48;
    System.out.printf("Quantidade: %d  itens%n", quantidade);
    //Resultado: Quantidade: 48 itens
 
    double peso = 938.22;
    System.out.printf("Peso: %f%n", peso);
    //Resultado: 938.220000  


    System.out.printf("Peso: %.2f%n", peso);
    //Resultado: 938.22
   
    System.out.printf("Peso: %10.2f%n", peso);
    //Resultado: _ _ _ _ 938.220000   Ele move o texto 4 casas para
                                   	// direita para somar 10 de tamanho do texto  
  
    
   
   
  }
}