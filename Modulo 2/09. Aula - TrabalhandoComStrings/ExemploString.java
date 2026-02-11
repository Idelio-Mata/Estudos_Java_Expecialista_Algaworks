public class ExemploString {

  public static void main (String [] args ) {
    System.out.println("Exemplo String");
    
    int x = 10;
    int y = 5;
    
    
    //Contatenação, porque depois de string, tudo contatena.

    System.out.println("O resusltado é: " + x + y); 

    
    // Os dois exemplos abaixo, são de operações arimeticas com string
    // Os dois imprimem 15, porque antes de string faz operações aritmeticas e só inicia a concatenação após strings.

    System.out.println("O resusltado é: " + (x + y)); // Faz operação aritmetica, porque mesmo depois da string está em parenteses. 
    System.out.println( x + y + " é o resultado ");  // Faz operação aritmetica, porque ela está, antes da string que tem regras de concatenação. 


   // Concatenando Strings com inteiros
   
    String nome = "Maria";
    int idade = 30;    
    
    System.out.println(nome + " tem " + idade + " anos de idade" ); 

    
   }
}