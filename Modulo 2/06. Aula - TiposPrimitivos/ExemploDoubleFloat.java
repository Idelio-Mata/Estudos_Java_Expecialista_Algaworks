public class ExemploDoubleFloat {
 
  public static void main (String [] args) {

    /* 
      Esses dois tipos primitivos, nao devem ser utilizados para numeros que exigem muita precisao, tais
      como valores monetarios, dinheiro. Sitema financeiro.

      Para isso devemos usar BigDeciaml. 
    */


    double peso = 89.9;
   
    System.out.println(peso); 

   // float taxa = 1_249.93; Nao compila
   float taxa = 1_249.93f;
   
   System.out.println(taxa); 
   
  }
}

