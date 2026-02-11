/* 
  As conversões sempre acontecem implicitamente quando a conversão é feita de um tipo menor para um maior. 
  E nunca quando é de um maior para um menor, porque não é possivel saber se o maior vai caber na variavel menor.
   
  Portanto, se quisermos converter de um maior para menor, devemos fazer a conversão explicita, correndo sempre 
  o risco de perda de bits, se o tipo convertido for maior que o tipo que vai receber a conversão.
*/
 

public class ConversaoIntParaLong {

  public static void main (String [] args) {
  
    long x = 10;
    // int y = x;  //Não compila, por possivel perda de bits, mas podemos forçar a conversão por nosSsa conta e risco.
    
    int y = (int) x;
   
    System.out.println(x);
    System.out.println(y);
     
  }
}