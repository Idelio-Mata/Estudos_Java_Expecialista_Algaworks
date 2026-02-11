import java.util.Scanner;
// AvaliacaoAtendimento
public class EstruturaCondicionalSwitch {

    public static void main (String [] args) {
    	Scanner entrada = new Scanner (System.in);

	System.out.print("Avalie o nosso atendimento (1 a 5): ");
        int nota = entrada.nextInt();
	
	String descricaoNota;


        switch (nota){
	  case 1:
   	    descricaoNota = "Pessimo: ";
	    break;
	  case 2:
   	    descricaoNota = "Mao: ";
            break;
	  case 3:
   	    descricaoNota = "Razoavel: ";
	    break;
	  case 4:
   	    descricaoNota = "Bom: ";
	    break;	 
	  case 5:
   	    descricaoNota = "Muito bom: ";
	    break;	  
	  default :
   	    descricaoNota = "Opcao invalida: ";
	 }
 	
	 System.out.printf("A sua nota foi: %d - %s%n", nota , descricaoNota);






	// Usando if	
	/*
	if(nota == 1) {
	  descricaoNota = "Pessimo: ";	
	} else if (nota == 2) {
          descricaoNota = "Mao";	
	} else if (nota == 3) {
	  descricaoNota = "Razoavel";
	} else if ( nota == 4) {
          descricaoNota = "Bom";
	} else if (nota == 5) {
          descricaoNota = "Muito bom";
	}
	 descricaoNota = "Opcao invalida";
	*/     	

	//System.out.println(" A sua nota foi: " + nota +" "+ descricaoNota);
	
    }


}