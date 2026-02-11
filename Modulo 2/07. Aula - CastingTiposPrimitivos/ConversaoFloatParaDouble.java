/* Conversões de double para Float

  As conversões sempre acontecem implicitamente quando a conversão é feita de um tipo menor para um maior como exemplo abaixo.

  Não precisamos de uma conversão explicita porque certamente o tipo float é 32x e o double é 64x.
*/
 

public class ConversaoFloatParaDouble {

  public static void main (String [] args) {
   
    float taxa1 = 357.5f;
    double taxa2 = taxa1;

   // double taxa2 = (double) taxa1 ;  Casting Opcional
    
    

    System.out.println(taxa1);
    System.out.println(taxa2);

        
  }
}