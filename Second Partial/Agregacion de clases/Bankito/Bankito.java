public class Bankito{               
         public static void main(String [ ] args){
              Cuenta ctaAux;  
              //Creamos el cliente “El Quijote” 
              // con un num. de cuenta: QX400
              Cliente qx = new Cliente ("El Quijote", "QX400");
              //Creamos  su cuenta con saldo de 550.45
              qx.establecerCuenta(new Cuenta (550.45));
              //Obtenemos la cuenta del Quijote
              //y la asignamos a la referencia ctaAux
              ctaAux = qx.obtenerCuenta( );
               //Ahora depositamos 300.55 pesos a cuenta del Quijote
               ctaAux.depositar(300.55);
               //Ahora imprimimos toda la información del Quijote
               System.out.println("Nombre Cliente:" + qx.obtenerNombre( ));
               System.out.println("Num cuenta:" + qx.obtenerNumCta( )); 
               System.out.println("Saldo:" + ctaAux.consultar( ));
               
               //¿Cómo se accede al atributo "saldo" de la clase Cuenta del cliente qx?
               
               //Primera opcion: 
               //double valor = qx.cuenta.consultar(); //Error: cuenta tiene acceso privado para Bankito
               //System.out.println("Saldo :" + valor);
               
               //Segunda opción:
               //Usando los métodos de la clse Cliente y de la clase Cuenta:
               //System.out.println("Saldo =" + qx.obtenerCuenta().consultar());
               
               //Tercera opción:
               //Agregando el método consultarCuenta( ) en la clase Cliente para tener acceso al atributo saldo:
               double monto = qx.consultarCuenta();
               System.out.println("Saldo (usando consultarCuenta):" + monto);
               
                   
      } // Fin de método main
} // Fin de la clase
