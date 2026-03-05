// DESAFIO 2
/* Escreva um programa que solicita um número inteiro positivo para o usuário e imprime na saída uma mensagem dizendo se o número digitado é um número primo ou não. 
   Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.*/

import java.util.Scanner;
public class RecebeEImprimeDezNumeros {

  public static void main (String [] args) {
  Scanner entrada = new Scanner (System.in);
  
    int numeros = 0;
    int soma = 0;
    boolean novoNumero = true;    

    for (int i = 1; i <= 1; i++) {
      System.out.print("Introduza um numero: ");
      numeros = entrada.nextInt();
      System.out.print("Mais um numero? ");
      novoNumero = entrada.nextBoolean();
     
      soma += numeros;
    }
  System.out.print("A soma dos numeros: "+soma);
        
    
  }

}