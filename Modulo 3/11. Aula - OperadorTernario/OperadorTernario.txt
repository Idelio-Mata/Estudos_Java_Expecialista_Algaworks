import java.util.Scanner;
public class OperadorTernario {
  
  public static void main (String [] args) {
  Scanner entrada = new Scanner(System.in);

    //char tipoNotaFiscal = 'S';
    char tipoNotaFiscal = 'P';
    double totalFaturado = 1200.30;

   //Expressao Ternaria
   
   double valorImpostos = tipoNotaFiscal == 'P' ? totalFaturado * 0.16 : totalFaturado * 0.35;



  //Com if else  
  /*
    double valorImpostos;

    if (tipoNotaFiscal == 'p') {
      valorImpostos = totalFaturado * 0.16;
    } else {
      valorImpostos = totalFaturado * 0.35;
    }
  */

    
    System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
    System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);

  }
 
}