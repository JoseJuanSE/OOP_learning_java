import static java.lang.Math.*;

public class UsoStatic1 {
	public static void main(String [] args){
		double area, hipo;
		System.out.println("Calculo del area de un circulo con radio = 10: ");
		area = Math.PI * Math.pow(10.0, 2.0);
		System.out.printf("Area del circulo: %.4f", area ); 
		System.out.println("\n\nCalculo de la hipotenusa con cateto A=3.0 y cateto B=4.0");
		hipo = Math.hypot(3.0, 4.0);
		System.out.printf("Hipotenusa: %.4f", hipo );
		//se pueden llamar a los metodos de Math sin escribir Math gracias a import static
		hipo = hypot(4.0, 5.0);
		System.out.printf("\nHipotenusa 2: %.4f", hipo );
	}
}