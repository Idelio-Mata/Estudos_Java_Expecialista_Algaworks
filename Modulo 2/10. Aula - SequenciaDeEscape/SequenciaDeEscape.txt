/* Sabemos que strings devem ser representadas dentro de aspas duplas. 
   Mas encontramos certas situações em que precisamos mostrar aspas ou caracteres especiais como strings sem receber erros.

  Por isso usaremos um truque chamado sequência de escape.
*/

public class SequenciaDeEscape {

  public static void main (String [] args) {
   
   
    // System.out.println("Oi "Maria"");  
   
    /* N compila, mostrando dois erros.
      1º Erro, a leitura de string termina depois da ", e não reconhecendo tudo que vem depois das " do Oi que inclusive é Maria"".
      2º Erro, inicia nova leitura de string que começa em "Maria" e não reconhece as ltimas aspas que ternam o texto "Maria" ";
    
      Solução, usar sequência de escape \ , que significa que ignora o caractere imediato seguinte, só pode ignorar um caractere or vez.

    */
    
    System.out.println("Oi \"Maria\"");
    // Resultado : Oi "Maria".    Usando a aspa "Maria e aultima depois do \".
     
    // Como quebar uma linha? 
    System.out.println("Seu nome: João"); // Resultado:   Seu nome: João
    
   // Quebrando linha 
   System.out.println("Seu nome: \nJoão");  /* Resultado:   Seu nome: 
                                                            João */

  
   // Desejamos imprimir um diretório do windows C:\Windows
   // System.out.println("C:\Windows");  Não compila, pois a sequencia de escape \, não reconhece a letra W que a segue.
  
   // Imprimindi um diretório do windows C:\Windows
   System.out.println("C:\\Windows"); // A primeira \, anula a função da segunda e representa-a como mera string, mostrando nos o texto desejado.
   
    

  }
}