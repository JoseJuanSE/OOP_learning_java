
class Point{

    private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(){
		this(1,1);
	}
	
	public void mover(int nx, int ny){
		x = nx;
		y = ny;
	}
	
	/*
    //Redefinición (overriden) de equals para la clase Point
	public boolean equals(Object Ob){
		if(Ob instanceof Point){ //Verificamos que Ob sea un objeto de Point
			Point P = (Point) Ob;  //Downcasting
			if(this.x==P.x && this.y == P.y)
				return true;
		}
		return false;
	}
	*/
	
	/*
	//Redefinición de toString
	public String toString(){
		return "[X=" + x + ", " + "Y=" + y + "]";
	}
	*/
	
}

public class Puntos{
	public static void main(String [] args){
		Point A = new Point();
		Point B = new Point(-8, 10);
		
		//Invocamos al método equals de la clase Object
		boolean r = A.equals(B);
		//Desplegamos el valor de r
		System.out.println("A.equals(B):  " + r);
		// Ahora modificamos el valor del objeto B para que sea igual que el objeto A, e invocamos a equals
		B.mover(1,1);
		r = A.equals(B);
		System.out.println("A.equals(B):  " + r);
		// El método equals no compara el contenido de los objetos, compara las referencias de los objetos
		
		
		//Ahora imprimimos la representación de toString de la clase Object
		System.out.println("Método toString de la clase Object para A:  "+ A.toString()); 
		System.out.println("Método toString de la clase Object para B:  "+ B);
		
		
		/*
		//Ahora usamos nuestra definición de toString para la clase Point
		System.out.println("Nuestra definicióndel método toString para A: " + A.toString()); 
		System.out.println("Método toString de la clase Object para B:  "+ B);
		*/
		
		System.out.println("El valor hash para A es: " + A.hashCode());
		System.out.println("El valor hash para B es: " + B.hashCode());
		
		
	}
}