public class OperadorDeIncrementoPrefixado {
  
  public static void main (String[]args){
    int totalDownloads = 10;

   /*Essas duas abaixo sao as formas conhecidas.*/

   //totalDownloads = totalDownloads +1;
   //totalDownloads += 1;

   //Usando Operador Incremental

   // totalDownloads++;

   int novoTotalDownloads = totalDownloads++;
  
   System.out.println("O Total de Downlodas: " +totalDownloads);
   System.out.println("Novo Total de Downlodas: " +novoTotalDownloads);

  }
}