public class ExemploByteShort {
  
  public static void main (String [] args) {

    /* O tipo Byte e Short são numeros inteiros, com tamanhos menores. 
       Para calcular o tamanho de alocação de cada um deles, basta olhar a formula da tabela.   
      
       byte  = 8 Bits o menorValor = (-2)^7 = -127 ; maiorValor =(2^7)-1 = 127;
       short = 16 Bits  menorValor = (-2)^15 = -32.767; maiorValor =(2^15)-1 =32.767 ;     
    */
    
    
    // Exemplo abaixo, não significa que idade é byte.
    
    // byte idade = 128;  Não compila, porque excede o limite de alocação para o tipo byte. 
       byte idade2 = 127;  // Compila porque está dentro do limite de alocação;
 
   
    Short quantidadeEstoque = -32767;  // Compila porque está dentro do limite de alocação;
     // Short quantidadeEstoque2 = -42765; Não compila, porque excede o limite de alocação para o tipo short.
  
  }
}