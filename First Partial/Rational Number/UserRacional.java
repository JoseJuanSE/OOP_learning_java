import java.util.*;

public class UserRacional {
    public static void main( String [ ] args) {
        Racional A, B; 
        A = new Racional( );      // A = 1/1
        B = new Racional(3, 4); // B = 3/4  
        Racional C = new Racional(2,3);  
        A.imprimir( );
        B.imprimir( );
        C.imprimir( );
        A.establecer(1,2);  // A = 1/2
        // Imprimimos el valor modificado de A en pantalla: [ 1, 2 ]
        A.imprimir( );
		A.mult(B);
		A.mult(B.mult(C));
		System.out.print("Multiplicacion: ");
		A.imprimir();
		B.mult(A,C);
		System.out.print("Multiplicacion sobrecarga de metodos: ");
		B.imprimir();
		
		//Arreglos tipos primitivos
		System.out.println("\n\n********* Arreglos tipos primitivos *******");
		int [] varInt = new int[3];
		System.out.println("Entero 0: " + varInt[0]);
		System.out.println("Entero 0: " + varInt[1]);
		
		double [] varDouble = { 3.1416, 2.7172, 9.81};
		System.out.println("Double 0: " + varDouble[0]);
		System.out.println("Double 0: " + varDouble[1]);
		
		boolean [] varBoolean = new boolean[3];
		System.out.println("boolean 0: " + varBoolean[0]);
		System.out.println("boolean 0: " + varBoolean[1]);
		
		long [] varLong = new long[3];
		System.out.println("Entero largo 0: " + varLong[0]);
		System.out.println("Entero largo 0: " + varLong[1]);	
		
		//Arreglo de objetos Racional
		System.out.println("\n\n+++++++++ Arreglos tipo Racional +++++++");
		Racional [] grupoA;
        grupoA	= new Racional[3]; //Es una arreglo de variables referencia (faltan los objetos)
		grupoA[0] = new Racional();     
		grupoA[1] = new Racional(3,2);
		grupoA[2] = new Racional(2,5);
		
		//Desplegamos valores en pantalla
		for(int i=0; i<grupoA.length; i++)
			grupoA[i].imprimir();
		
		//Modificamos valores
		grupoA[0].establecer(3,3);
		grupoA[1].establecer(2,2);
		grupoA[2].establecer(1,1);

		
		//Desplegamos valores usando for-each
		System.out.println("\n\n-----Modificamos valores y usamos for-each");
		for(Racional var: grupoA)
			var.imprimir();
		
		//Ahora vamos a generar un nuevo arreglo de objetos Racional, pero creados de forma aleatoria.
		// Usaremos la clase Random y su método nextInt para generar enteros de forma aleatoria
		// Tenemos que incluir el paquete java.util que es el paquete de la clase Random, en la primera 
		// línea de este programa con la sentencia:  import java.util.Random
		
		System.out.println("\n\n######## Generamos un arreglo Racional de forma aleatoria #########");
		Random rand = new Random();
		Racional [] grupoB = new Racional[10];
		
		int i, j, k;
		for(i=0; i<grupoB.length; i++ ){
			j = rand.nextInt(10);
			k = rand.nextInt(10);
			grupoB[i] = new Racional(j, k);
		}
		//Imprimimos el arreglo
		for(Racional var: grupoB)
			var.imprimir();
		
		
		//Comparando dos objetos tipo Racional
        // La clase Object contiene el método equals que compara dos objetos y nos dice si son iguales
        // La clase Object es la clase base o madre de todas las clases, incluso de Racional
        // Por lo tanto la clase Racional hereda de la clase Object todos sus métodos, incluso equals
		// El método equals tiene esta declaración: public boolean equals(Object O)
		// Usemos el método equals y veamos el resultado

		System.out.println("\n\n------Probamos el metodo equals de la clase Object ---------");		
		Racional R1 = new Racional(2,3);
		Racional R2 = new Racional(3,2);
		boolean r = R1.equals(R2);
		System.out.println("Primera prueba. El valor de r es: " + r);
		// Los numeros racionales son diferentes
		// Modificamos R2 para que sea igual que R1, y hacemos la prueba
		R2.establecer(2,3);
		R1=R2;
		r = R1.equals(R2);
		System.out.println("Segunda prueba. El valor de r es: " + r);
		//NO FUNCIONA
		// Tenemos que redefinir equals dentro de la clase racional
		
		
		Racional T = new Racional(1,6);
		Racional U = new Racional(4,6);
		Racional X = new Racional(3,4);
		Racional Y = new Racional(1,2);
		Racional Z = new Racional(3,5);
		//Uso de ArrayList con objetos de tipo Racional
		ArrayList<Racional> grupo2 = new ArrayList<Racional>();
		System.out.println("Usando ArrayList de clase Racional");
		grupo2.add(T);
		grupo2.add(U);
		grupo2.add(X);
		grupo2.add(Y);
		grupo2.add(Z);
			
		System.out.println("Tamaño del ArrayList grupo2: " + grupo2.size());
		Racional aux;
		for( j=0; j<grupo2.size() ; j++){
			aux =  grupo2.get(j);
			aux.imprimir();
		}
		grupo2.remove(2);
		System.out.println("Despues del remove();");
		for( j=0; j<grupo2.size() ; j++){
			aux =  grupo2.get(j);
			aux.imprimir();
		}
	
	
	System.out.println("Uso de for each: ");
	for(Racional index: grupo2){
		index.imprimir();
	}

    //Comparamos dos numeros racionales:
	
	boolean b = T.mayorQue(U);
	System.out.println("T es mayor que U: " + b);


/* Resolver los siguiente:

1) Obtener el Racional mayor de un arreglo de racionales estático 
2) Obtener el Racionall mayor de un arreglo de racionales dinámico (ArrayList)
3) Diseñar un método para comparar dos arreglos estáticos de tipo Racional: devuelve true si son iguales
4) Diseñar un método para comparar dos arreglos dinámicos de tipo Racional: devolver true si son iguales.

*/
		
		
    }
}              



