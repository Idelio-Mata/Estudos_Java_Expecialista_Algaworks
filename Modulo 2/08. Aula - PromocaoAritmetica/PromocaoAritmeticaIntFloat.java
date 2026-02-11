public class PromocaoAritmeticaIntFloat {

  public static void main (String [] args ) {
    
    int x = 3;
    int y = 2; 
    float z = x / y;
   
    System.out.println(z);  // O resultado sai 1.0 em float porque é a saida flutuante.
    
    /* O resultado devia ser 1.5, mas sai 1.0 em float, porque a operacao é feita primeiro
       entre dois inteiros e inteiros só tem partes inteiras.*/

    /* Para o resultado 1.5  deve ser
       
       int x = 3;
       float y = 2; 
       float z = x / y;
    */
    
   }
}