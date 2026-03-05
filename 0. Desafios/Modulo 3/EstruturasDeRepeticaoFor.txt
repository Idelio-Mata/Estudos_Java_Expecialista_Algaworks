// DESAFIO 1
// Escreva um programa que solicita 10 números e imprime na saída a soma dos números digitados.

import java.util.Scanner;
public class RecebeEImprimeDezNumeros {

  public static void main (String [] args) {
  Scanner entrada = new Scanner (System.in);
    
   int soma = 0;
   
    for ( int i = 1; i <= 10; i++) { 
      System.out.print("Introduza um numeros: ");
      int numeros = entrada.nextInt();
      soma += numeros; 
    }
    System.out.print("A soma dos numeros: "+soma);
    
  }

}