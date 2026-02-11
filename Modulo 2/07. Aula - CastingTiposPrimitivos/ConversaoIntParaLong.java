/* Conversões de double para Float

  As conversões sempre acontecem implicitamente quando a conversão é feita de um tipo menor para um maior como no exemplo abaixo.
  Não precisamos de uma conversão explicita porque certamente o tipo menor cabe nas celulas do tipo maior.
*/
 

public class ConversaoDoubleParaFloat {

  public static void main (String [] args) {
    int x = 102344;
    long y = x;  
    
    // long y = (long) x; Instrução de casting é opcional.

    System.out.println(x);
    System.out.println(y);

        
  }
}