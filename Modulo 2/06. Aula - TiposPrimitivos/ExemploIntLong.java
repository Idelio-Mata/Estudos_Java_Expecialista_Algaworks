public class ExemploIntLong {
 
  public static void main (String [] args ) {

   /* O tipo int e long são numeros inteiros com tamanhos grnades. 
       Para calcular o tamanho de alocação de cada um deles, basta olhar a formula da tabela.   
      
       int  = 32 Bits menorValor = -2^31; maiorValor =(2^63)-1;
       long = 64 Bits menorValor = -2^63  maiorValor =(2^63)-1= 9223372036854775807;    

      A partir do java 7+, podemos usar underscore entre os numeros para facilitar a visualizacao dos numeros.
      Exemplo  2345676 = 2_345_676;
     */
    
   
   //Exemplo int   
     int populacaoMocambicana = 699_097;

   // int populacaoMocambicana2 = 2_147_483_648; Nao compila, excede o limite de alocacao.
      int populacaoMocambicana2 = 2_147_483_647;


  // Exemplo long
     long populacaoMocambicana3 =  699_097;
     long populacaoMocambicana4 = 2_147_483_648L; 
     // long populacaoMocambicana5 = 2_147_483_648;  // Nao compila

        /* Nao compila, mesmo long suportando numeros mais grandes que esse. 
           Porque por padrao, todos os numeros inteiros literaisque sao introduzidos no 
           codigo fonte, sao automaticamente convertidos para tipo primitivo int.

           Devemos converter o codigo manulamente para long adicionando a letra minuscula ou maiuscula "L" no final do numero.
           Ex: long populacaoMocambicana = 2_147_483_648L;
        */ 
     
  
  }
} 




//Minima = -2^63 ; Maxima (2^63)-1 = 9223372036854775807