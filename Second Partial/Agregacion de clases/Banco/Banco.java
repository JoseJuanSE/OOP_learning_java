public class Banco {
	private Cliente[ ] clientes;
	private int numClientes;
	
	public Banco(){ 
		clientes = new Cliente[10];
		numClientes = 0;
	}
	
	public void agregaCliente(String nom, String numCta, double saldo){
		int i = numClientes;
		clientes[i]= new Cliente(nom,numCta);
		clientes[i].establecerCuenta(new Cuenta(saldo));
		numClientes++;
	}
	
	public int obtenerNumClientes( ){
		return numClientes;
	}

	public Cliente obtenerCliente( int indice){
		if(indice>=0 && indice<numClientes){
			return clientes[indice];
		}
		else{
			System.out.println("El numero de cliente solicitado no existe. Se devuelve null");
			return null;		
		}
	}
	
	public void imprimirClientes(){
		Cliente auxCliente;
		Cuenta auxCuenta;
			for(int i=0; i<numClientes; i++){
				auxCliente = obtenerCliente(i);
				System.out.print("Cliente [" + i + "] =" + auxCliente.obtenerNombre());
				auxCuenta = auxCliente.obtenerCuenta();
				System.out.println(" Saldo:" + auxCuenta.consultar());
				 
			}
			
		}
		
		
}