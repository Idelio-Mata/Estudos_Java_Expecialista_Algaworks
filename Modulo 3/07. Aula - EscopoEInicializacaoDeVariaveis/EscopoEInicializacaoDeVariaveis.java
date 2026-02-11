import java.util.Scanner;
 
/* Ex:1 Não compila, porque o valorFrete foi inicializado dentro do escopo if e só pode ser usando e impresso dentro do escopo if

public class EscopoEInicializacaoDeVariaveis {
    public static void main (String [] args) {
    
        Scanner entrada = new Scanner (System.in);
        
	System.out.println("Preço dos produtos: ");
	double precoProdutos = entrada.nextDouble();

	System.out.println("Cobrar frete? ");
	boolean cobrarFrete = entrada.nextBoolean();

	if(cobrarFrete) {
          System.out.print("Valor do frete: ");
	  double valorFrete = entrada.nextDouble();
        }
        
	double valorTotal = precoProdutos + valorFrete;
        System.out.printf("O valor total:  R$%.2f%n", valorTotal);

    }
} */

// Ex:2 Compila porque o valorFrete foi inicializado globalmente e está acesivel pata todo o programa

public class EscopoEInicializacaoDeVariaveis {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
	System.out.print("Preço dos produtos: ");
	double precoProdutos = entrada.nextDouble();

	System.out.print("Cobrar frete? ");
	boolean cobrarFrete = entrada.nextBoolean();

	double valorFrete = 0;

	if(cobrarFrete) {
          System.out.print("Valor do frete: ");
 	  valorFrete = entrada.nextDouble();
        }
        
	double valorTotal = precoProdutos + valorFrete;
        System.out.printf("O valor total:  R$%.2f%n", valorTotal);

    }
} 
