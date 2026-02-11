import java.util.Scanner;

public class OperadoresLogicos {

  public static void main (String [] a){
    Scanner entrada = new Scanner (System.in);
    
    System.out.print("Cortisol ");
    double cortisol = entrada.nextDouble();

    // Operador && E
    //Cortisol ideal 6 a 18.4  Para ser verdadeiro as N condicoes devem ser V
    //boolean resultadoNormal = cortisol >= 6 && cortisol <= 18.5;

//   System.out.printf("Cortisol normal: %b%n", resultadoNormal);

    // Operador || Ou
    //Cortisol ideal 6 a 18.4  Basta que uma ser verdadeira para ser V
    boolean resultadoAnormal = cortisol < 6 || cortisol > 18.5;

   System.out.printf("Cortisol anormal: %b%n", resultadoAnormal);


  }
}