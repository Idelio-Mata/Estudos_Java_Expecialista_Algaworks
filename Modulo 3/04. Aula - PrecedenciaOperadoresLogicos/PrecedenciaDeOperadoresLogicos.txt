public class PrecedenciaDeOperadoresLogicos {

  public static void main (String [] a){
    int x = 10;
    int y = 20;
     
    //Os dois primeiros tem o mesmo resultado, devido a precedencia do // em relacao ao ||

    boolean resultado0 = x == 13 && x == 15 || y == 20;  //true  
    boolean resultado1 = (x == 13 && x ==15) || y ==20; //true
    boolean resultado2 = x == 13 && (x ==15 || y == 20); // false

   System.out.println(resultado0);
   System.out.println(resultado1);
   System.out.println(resultado2);

  }

}