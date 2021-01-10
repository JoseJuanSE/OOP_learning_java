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

        //
        Punto a1 = new Punto("a1",-9,2);
        Punto b1 = new Punto("b1",-3,8);
        Rectangulo x = new Rectangulo("RecA",a1,b1);
        
        Punto a2 = new Punto("a2",-7,4);
        Punto b2 = new Punto("b2",-4,6);
        Rectangulo y = new Rectangulo("RecA",a2,b2);

        System.out.println("el area del rectangulo " + x + " es: "+x.Area());

        Rectangulo unionxy = x.Union(y);
        Rectangulo interxy = x.Interseccion(y);
        System.out.println("la union es: "+ unionxy);
        System.out.println("la interseccion es: "+ interxy);
    }
}
