public class ExemploBoolean {
  
  public static void main (String [] args) {

    // Retorna somente os valores literal.

    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    System.out.println("O valor literal é: "+ compraAprovada);
    System.out.println("O valor literal é: "+ clienteBloqueado);

   // Verifica se o estoque é suficinete.    

   int quantidadeEstoque = 10;
   int quantidadePedidoCompra =15;
   
   boolean estoqueSuficiente = quantidadePedidoCompra <= quantidadeEstoque;
   System.out.println("Estoque suficiente: " + estoqueSuficiente );

 
  }
}