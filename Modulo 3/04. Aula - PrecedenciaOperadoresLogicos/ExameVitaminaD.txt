//Ecreva um programa que diz se os niveis de vitamina estao normais ou anormais.

// Desejavel : Acima de 20 ng/ML
// Grupo de risco : 30 a 60 ng /ML

import java.util.Scanner;
public class ExameDeVitaminaD {
  
  public static void main (String [] a) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("Grupo de Risco: ");
    boolean grupoDeRisco = entrada.nextBoolean();

    System.out.printf("Vitamina D: ");
    double vitaminaD = entrada.nextDouble(); //nanograma por mililitro


    boolean examinarVitamina = (!grupoDeRisco && vitaminaD > 20)
            || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);  
  
    
   System.out.printf("Vitamina D normal: %b%n", examinarVitamina);

  }
}