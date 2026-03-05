import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main (String [] args){
    Scanner entrada = new Scanner (System.in);

    System.out.print("Peso maximo: ");
    int pesoMaximo = entrada.nextInt();
     
    System.out.print("Quantidade de passageiros: ");
    int totalPassageiros = entrada.nextInt();
     
    int pesoTotalPassageiro = 0;

    for (int passageiro = 1; passageiro <= totalPassageiros; passageiro++) {
       System.out.printf("Peso do passageiro #%d: ", passageiro);
       int pesoPassageiro = entrada.nextInt();
       pesoTotalPassageiro += pesoPassageiro;
    }
    
    System.out.printf("Peso maximo permitido: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiro);
    System.out.printf("Peso total dos passageiros: %s%n", 
        pesoTotalPassageiro > pesoMaximo ? "peso excedido" : "Liberado");

  }
}


