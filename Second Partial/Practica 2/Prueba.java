public class Prueba {
    public static void main(String[] args) {
        Punto a = new Punto("Q",1,3);
        Punto b = new Punto();
        b.CambiarNombre("F");
        b.CambiaX(4);
        b.CambiaY(5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("distancia en a origen: "+a.distancia());
        System.out.println("distancia en a a b: "+a.distancia(b));
        System.out.println("distancia en b a a: "+b.distancia(a));
        System.out.println("El cuadrante de a es: "+a.cuadrante());
        System.out.println("El cuadrante de b es: "+b.cuadrante());
    }
}
