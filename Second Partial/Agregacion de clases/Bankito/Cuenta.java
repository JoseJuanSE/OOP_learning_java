public class Cuenta {
        // Atributo con acceso privado
        private double saldo;
        // Constructor: inicializa objetos de la clase Cuenta
        public Cuenta(double saldoInicial){
                saldo = saldoInicial;
        }
        //Métodos
        // Consultar: devuelve el saldo actual
        double consultar( ){
                return saldo;
        }
        //Métodos
        // Depositar: incrementa el saldo en el monto indicado
        void depositar(double monto ){
                saldo = saldo + monto;
        }
        // Retirar: decrementa el saldo en el monto indicado siempre
        // que el monto sea mayor o igual al saldo
        void retirar(double monto ){
                if ( saldo >= monto ) {
                        saldo = saldo - monto;
                }
                else {
                        System.out.println("Saldo insuficiente");
                }
        }
} // Fin de la clase Cuenta