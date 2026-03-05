import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main (String [] args){
    Scanner entrada = new Scanner (System.in);

    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();
     
    int pesoTotalPassageiros = 0;
     
   //tornando o ciclo infinito e parando-o com break
    
    while (true) {
      System.out.print("Peso do passageiro: ");
      int pesoPassageiro = entrada.nextInt();
     
      if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
	System.out.println("Impossivel incluir novo passageiros, o peso excederia o maximo.");
        continue;
      } 

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("Incluir novo passageiros? ");
      if (!entrada.nextBoolean()) {
        break;
      } 
     }
    
    System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situacao da aeronave: %s%n", 
        pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "Liberado");

  } 
}

