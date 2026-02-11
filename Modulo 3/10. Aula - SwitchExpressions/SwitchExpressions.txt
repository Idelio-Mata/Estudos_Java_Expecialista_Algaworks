import java.util.Scanner;

public class HorarioFuncionamento {
  public static void main (String [] args) {
    
    Scanner entrada = new Scanner (System.in);
	
    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();

    System.out.print("Mes ");
    int mes =entrada.nextInt();


    //Agora usando Switch Expressions Java 14+
     
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> {
        if (mes == 12) {
          yield "08:00 as 16:00";
        }
        yield "Fechado";
      }
      case "ter", "qua","qui", "sex" -> " 08:00 as 18:00";
      case "sab", "dom" -> " 08:00 as 12:00";
      default -> "Dia invalido";
    };

    System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
    
  }


}