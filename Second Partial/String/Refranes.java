import java.util.Random;

public class Refranes{
	public static void main(String[] args) {
		Random azar = new Random();
		
		String[] grupo = new String[] {
			"Ajonjoli de todos los moles", 
			"El que es perico donde quiera es verde", 
			"El que no conoce a Dios ante cualquier santo se hinca",
			"Del dicho al lecho hay mucho trecho",
			"Para todo mal un buen mezcal; para todo bien, tambien",
			"El que nace para tamal del cielo le caen las hojas",
			"Estas trompudo �o quieres beso?",
			"Siempre hay un roto para un descosido",
			"Ya se le vieron las orejas al viol�n",
			"A caballo regalado no se le ve el colmillo"
		};
		System.out.println("Refran del dia: ");
		int val = azar.nextInt(10);
		System.out.println(grupo[val]);
	}
}