import java.util.Scanner;
public class EstruturaDeRepeticaoWhile {

  public static void main (String[] args) {
    Scanner entrada = new Scanner (System.in);

    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();
    
    int pesoTotalPassageiros = 0;
    boolean incluirNovoPassageiro = true;
   

   //Loop infinito
   // while (true) {}

    while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
      System.out.print("Peso do passageiro: ");
      int pesoPassageiro = entrada.nextInt();

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("incluir novo passageiro?: ");
      incluirNovoPassageiro = entrada.nextBoolean();
    } 

    System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situacao  da aeronave: %s%n", 
	pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberado");
   
  }
}