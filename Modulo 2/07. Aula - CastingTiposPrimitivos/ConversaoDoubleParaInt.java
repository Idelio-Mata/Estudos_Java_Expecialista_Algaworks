/* Conversões de double para Float

  As conversões sempre acontecem implicitamente quando a conversão é feita de um tipo menor para um maior. 
  
 Sempre precisaremos de conversão explicita quando convertermos tipos diferentes : Double pata Int.
*/
 

public class ConversaoDoubleParaInt {

  public static void main (String [] args) {
    
    double largura = 10.0;
    // int tamanho = largura;  Não compila, são tipos diferentes, conversão explicita necessária.
   
    int tamanho = (int) largura; 
       
    

    System.out.println(largura);
    System.out.println(tamanho);

        
  }
}