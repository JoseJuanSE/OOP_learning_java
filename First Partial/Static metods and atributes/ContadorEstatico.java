public class ContadorEstatico {

   private static int counter = 0;        //Solamente una copia en memoria

   public static int getCount() {
      return counter;
   }

   public static void increment(){
      counter++;
   }

   public static void main( String [ ] args){
         System.out.println("Start: " + ContadorEstatico.getCount() );
         ContadorEstatico.increment( );
         ContadorEstatico.increment( );  
         System.out.println("Start: " + ContadorEstatico.getCount() );
         System.out.println("exp(counter): " + Math.exp((double)ContadorEstatico.getCount()));
   }
}
