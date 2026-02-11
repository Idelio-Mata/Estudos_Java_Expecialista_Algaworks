public class OperadoresDeIgualdadeNegacao {

 public static void main (String [] a) {

   //Comparacao denumeros literais
      //boolean numerosIguais = 10 == 10;
 
   //Comparacao de operacoes aritmeticas
       //boolean numerosIguais = ( 4 + 6 ) == ( 5 * 2 );

   //Comparacao de valores de variaveis
      int numero1 = 10;
      int numero2 = 11;
      boolean numerosIguais = numero1 == numero2;
 
     
   
  //Comparacao dentro da saida printf
  System.out.printf("Numeros iguais: %b%n", numero1 == numero2);
 
  System.out.printf("Numeros iguais: %b%n", numerosIguais);
 
  //Operador de negacao unario.
  boolean numerosDiferentes = !numerosIguais;
  System.out.printf("Numeros diferentes: %b%n", numerosDiferentes); 

  // Outra forma
  boolean numerosDiferentes1 = !(numero1 == numero2);
  System.out.printf("Numeros diferentes: %b%n", numerosDiferentes1); 

 // Forma simples > Para saber se sao diferentes, basta usar o operador de diferenca
 
  boolean numerosDiferentes2 = numero1 != numero2;
  System.out.printf("Numeros diferentes: %b%n", numerosDiferentes2); 
 

 // Comparacao de Strings

   String nome1 = "Jonas";
   String nome2 = "Jonas";
  
   boolean nomesIguais = nome1 == nome2;
   System.out.printf("Nomes sao iguais: %b%n", nomesIguais); 
  
    

 
  
  

  



 }
}