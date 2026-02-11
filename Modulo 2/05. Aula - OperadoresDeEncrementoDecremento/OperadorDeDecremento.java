public class OperadorDeDecremento {
  
  public static void main (String [] args){
   int limiteTentativasLogin =10;
  
   //limiteTentativasLogin --;
   
   //Decremento PosFixado
   int novoLimiteTentativasLogin = limiteTentativasLogin --;

   System.out.println("Limite de Tentativas de login: " +limiteTentativasLogin);
   System.out.println("Novo limite de Tentativas de login: " +novoLimiteTentativasLogin);
  }
}