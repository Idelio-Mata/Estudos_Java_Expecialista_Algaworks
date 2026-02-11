public class PromocaoAritmeticaLongInt {

  public static void main (String [] args ) {
    
    long x = 10;
    long y = 5;
    //int z = x * y; N compila, a menos que se faca um cast ou se mude o tipo para long.
    
    long z = x * y;
    
    System.out.println(z);
    
   /*
   Mesmo o exemplo abaixo nao compilaria
   
   int x = 10;
   long y = 5;
   int z = x * y;
    
   System.out.println(z);
   */
 
    System.out.println(z);
    
   }
}