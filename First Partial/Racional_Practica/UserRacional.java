import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

class UserRacional{
    public static Racional pedirres(){
        int num,den;
        Racional c = new Racional();
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIntroduce tu respuesta: ");
        System.out.print("\nIntroduce el numerador: ");
        num = leer.nextInt();
        do{
            System.out.print("\nIntroduce el denominador: ");
            den = leer.nextInt();
            if(den==0)
                System.out.println("Denominador invalido (!=0)");
        }while(den==0);
        c.establecer(num, den);
        leer.close();
        return c;
    }
    public static int menu()throws IOException {
        int op;
        //Runtime.getRuntime().exec("cls"); windows
        Runtime.getRuntime().exec("clear"); //linux
        do {
            System.out.println("\n\t MENÚ: ");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- Division");
            System.out.println("5.- Salir");
            System.out.print("Ingresa la operacion que deseas realizar: ");
            Scanner EntradaDeDato = new Scanner(System.in);
            
            op = EntradaDeDato.nextInt();
            System.out.println("Usted ha seleccionado la opción de: " +op);    
            if(op<1 || op>5){
                //Runtime.getRuntime().exec("cls"); windows
                Runtime.getRuntime().exec("clear"); //linux
                System.out.println("\n\n Opción no valida, ¡intente otra vez!");
            }
            EntradaDeDato.close();
        } while (op<1 || op>5);
        return op;
    }
    public  static void sum(Racional a, Racional b){
        System.out.println("¿Cuál es la suma de los siguientes racionales?: ");
        a.imprimir(); System.out.print(" + "); b.imprimir();

        Racional correcta = new Racional();
        Racional resp = pedirres();
        
        correcta.suma(a, b);
        if(resp.Esigual(correcta)){
            
        }
    }
    public  static void substration(Racional a, Racional b){

    }
    public  static void multiplication(Racional a, Racional b){

    }
    public  static void division(Racional a, Racional b){

    }
    public static void main(String [] args)throws IOException {
        boolean a=true;
        while(a){
            Racional ra = new Racional();
            Racional rb = new Racional();
            ra.random();
            rb.random();

            int op = menu();
            switch(op){
                case 1:
                    sum(ra, rb);
                case 2:
                    substration(ra, rb);
                case 3:
                    multiplication(ra, rb);
                case 4:
                    division(ra, rb);
                case 5:
                    break;
            }
        }
        System.out.println("Mensaje de despedida chido");
    }
}
/*
Objetivo.
Llevar a cabo la implementación de conceptos tales como: encapsulamiento, clases
(constructores, métodos, atributos, formas de acceso), objetos, y modelación UML, de las
unidades I y II del plan de la UA para POO.
Desarrollo.
Diseñar e implementar un programa que sirva de apoyo en el aprendizaje de operaciones
con números racionales para estudiantes de la unidad de aprendizaje matemáticas del nivel
básico.

El programa deberá realizar lo siguiente:
a) Desplegar un menú de opciones en donde aparezcan todas las operaciones con
números racionales que pueden ser realizadas por el programa (suma, resta,
división, multiplicación). --listo--

b) Desplegar dos números racionales generados aleatoriamente por el programa.
c) Desplegar la operación que el usuario debe resolver, esto es, los números racionales
generados aleatoriamente y la operación a realizar. La operación también debe ser
generada aleatoriamente.
d) Invitar al usuario a que realice la operación.
e) Una vez que el usuario haya hecho sus cálculos, se deberá solicitar que ingrese su
resultado por el teclado, es decir, el programa deberá leer el valor correspondiente
al numerador y el valor correspondiente al denominador.
f) Calificar el valor ingresado por el usuario: en caso de que sea correcto, desplegar en
la pantalla un mensaje de felicitación; en caso incorrecto, desplegar un mensaje de
aliento al usuario e invitarlo a que intente de nuevo.
Notas:
1) Los números racionales deberán manejar una sola cifra tanto para el numerador
como para el denominador.
2) El programa debe ser capaz de identificar un acierto si el usuario no llevó a cabo la
reducción de un número racional. Por ejemplo, si el resultado correcto debe ser 1/2
y el usuario ingresó el valor de 2/4, el programa deberá desplegar que la respuesta
fue correcta y hará la indicación de que la fracción puede ser simplificada.
3) La interacción del usuario con el programa se puede hacer en modo consola (solo
texto) o en modo gráfico (ventanas, menús, etc.).
Diseño.
- Se debe usar la clase Racional vista en el salón de clase (con las extensiones o
modificaciones debidas).
- Se deberá diseñar la clase usuario (UsuarioRacional) de la clase Racional.
- Realizar el diagrama de clases UML. El código fuente (Java) del programa debe
corresponder con el diagrama UML presentado.
- Se tomará en cuenta la creatividad en el programa (también habrá participaciones
extras).
- Los programas o desarrollos que sean iguales o copiados serán cancelados, tanto de
quien copia como de quien permite la copia.
*/