import java.util.Scanner;

public class CalcularAnoBissexto {

  public static void main (String [] a){
  Scanner entrada = new Scanner (System.in);
  
  System.out.print("Introduza o ano: ");
  int ano = entrada.nextInt();

  // System.out.print("Introduza o numero: ");
  // int y = entrada.nextInt();
   
  // É multiplo de 4 qualquer numero que dividido por 4 o resto é 0. 
  boolean modulo = ano % 4 == 0;

  System.out.printf("Ano bissexto: %b%n", modulo);

  }
}