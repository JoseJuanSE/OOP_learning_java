public class InicializadorEstatico {

      private static final boolean[ ] switches = new boolean[5];  

      static {  // Inicialización del Bloque estático
            System.out.println("Inicializando.");
            for(int i=0; i<5 ;  i++)
                  switches[i] = true;
      }

      public static void main( String [ ] args){
            switches[1] = false;  switches[2] = false; 
            System.out.println("Estableciendo switches." );
            for (boolean curSwitch: switches)
                  if(curSwitch) { System.out.print("1"); }
                  else { System.out.print("0"); }
      }
}