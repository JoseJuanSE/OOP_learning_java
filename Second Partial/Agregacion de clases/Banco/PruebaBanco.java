public class PruebaBanco{
	public static void main(String [] args){
	Banco MiBanco = new Banco();
	
	MiBanco.agregaCliente("Alonso Quijano", "QX1600",300.50);
	MiBanco.agregaCliente("Sancho Panza", "SPANZA1600", 410.80);
	MiBanco.agregaCliente("Rocinante", "RX1600", 145.56);
	MiBanco.agregaCliente("Pedro Paramo", "PP1952", 187.23);
	MiBanco.agregaCliente("Aureliano Buendia", "AB1954", 0.5);
	MiBanco.agregaCliente("Jose Arcadio Buendia", "JAB1954", 10.45);
	MiBanco.agregaCliente("Dona Barbara", "DB1940", 2000.32);
	MiBanco.agregaCliente("El Brujeador", "EB1940", 12.45);
	MiBanco.agregaCliente("Ingeniero Santos", "IS1954", 36.23);
	MiBanco.agregaCliente("La Maga", "LM1958", 34.21);
	
	
	
	
	System.out.println("Numero de clientes: " + MiBanco.obtenerNumClientes());
	MiBanco.imprimirClientes();
		
		
	}


}