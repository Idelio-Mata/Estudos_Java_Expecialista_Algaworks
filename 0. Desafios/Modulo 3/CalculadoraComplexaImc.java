/*  Calcular o IMC (Índice de Massa Corporal). 
    Implemente um programa que obtém os valores como entrada do usuário e  imprime na tela o resultado (condição da pessoa), usando essas regras e 
    aplicando todos os conteúdos que você aprendeu até agora neste módulo.
    		---------------------------------------------------------------------------------------------------------------------------
    		| CONDIÇÃO         | Abaixo do peso | No Peso ideal     | Um pouco acima do peso | Acima do peso ideal | Obeso            |
    		---------------------------------------------------------------------------------------------------------------------------
    		| IMC EM MULHERES  | Menor que 19.1 | Entre 19.1 e 25.8 | Entre 25.9 e 27.3      | Entre 27.4 e 32.3   | Maior que 32.3   |
    		---------------------------------------------------------------------------------------------------------------------------
    		| IMC EM HOMENS    | Menor que 20.7 | Entre 20.8 e 26.4 | Entre 26.5 e 27.8      | Entre 27.9 e 31.1   | Maior que 31.1   |
    		---------------------------------------------------------------------------------------------------------------------------   

*/

import java.util.Scanner;
public class CalculadoraComplexaImc {
  
    public static void main (String [] a){
        Scanner entrada = new Scanner (System.in);
    
        System.out.println("Genero (F ou M): ");
        char genero = entrada.next().toUpperCase().charAt(0);

        System.out.println("Peso (kg): ");
        int peso = entrada.nextInt();
        
        System.out.println("Altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso /(altura * altura);

        System.out.printf("O Indice de massa corporal é: %.2f%n", imc);
    
        //Caso Femenino
        if (genero == 'F') {
            if (imc < 19.1){ 					// Abaixo do peso
              System.out.println("Abaixo do peso");
            } else if (imc <= 25.8){ 				// No peso ideal » Entre 25.9 e 27.3
              System.out.println("No peso ideal");	
            } else if (imc <= 27.3){ 				// Um pouco acima do peso » Entre 27.4 e 32.3
              System.out.println("Um pouco acima do peso");
            } else if (imc <= 32.3){ 				// Acima do peso ideal » Maior que 32.3
              System.out.println("Acima do peso ideal");
            }  else { 		 				// Obeso
              System.out.println("Obeso");
            }
          }
          
         // Caso Masculino
         if (genero == 'M') {
             if (imc < 20.7) {
               System.out.println("Abaixo do peso");
             } else if (imc <= 26.4){ 				// No peso ideal » Entre 25.9 e 27.3
              System.out.println("No peso ideal");	
             } else if (imc <= 27.8){ 				// Um pouco acima do peso » Entre 27.4 e 32.3
              System.out.println("Um pouco acima do peso");
             } else if (imc <= 31.1){ 				// Acima do peso ideal » Maior que 32.3
              System.out.println("Acima do peso ideal");
             }  else { 		 				// Obeso
              System.out.println("Obeso");
             }

           } 

           System.out.println("Fim do programa");
           entrada.close();       
   
          
     }
}

