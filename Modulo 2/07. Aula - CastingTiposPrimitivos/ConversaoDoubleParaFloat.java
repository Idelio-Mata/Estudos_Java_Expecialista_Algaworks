/* Conversões de double para Float

  As conversões sempre acontecem implicitamente quando a conversão é feita de um tipo menor para um maior. 
  Oque nãos e aplica no exemplo abaixo.

  Precisamos de uma conversão explicita porque certamente o tipo double é 64x e o float é 32x.
*/
 

public class ConversaoDoubleParaFloat {

  public static void main (String [] args) {
   
    double peso1 = 20.5;
    // float peso2 = peso1;  Não complia.

    float peso2 = (float) peso1;
    
    

    System.out.println(peso1);
    System.out.println(peso2);

        
  }
}