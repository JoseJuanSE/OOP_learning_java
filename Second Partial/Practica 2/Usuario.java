public class Usuario {
    public static void main(String[] args) {
        //probando punto
        System.out.println("PROBEMOS PUNTO");
        Punto a = new Punto("Q",1,3);
        Punto b = new Punto();
        b.CambiarNombre("F");
        b.CambiaX(-4);
        b.CambiaY(-5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("distancia de "+a.obtenerNombre()+ " al origen: "+a.distancia());
        System.out.println("distancia en Q a F: "+a.distancia(b));
        System.out.println("distancia en F a Q: "+b.distancia(a));
        System.out.println("Cambiamos el nombre de "+a.obtenerNombre() +" a T");
        a.CambiarNombre("Cu1");
        System.out.println("El cuadrante de Cu1 es: "+a.cuadrante());
        Punto c2 = new Punto("c2",-1,3);
        Punto c4 = new Punto("c4",1,-3);
        System.out.println("El cuadrante de "+c2.obtenerNombre()+" es: "+c2.cuadrante());
        System.out.println("El cuadrante de "+b.obtenerNombre()+" es: "+b.cuadrante());
        System.out.println("El cuadrante de "+c4.obtenerNombre()+" es: "+c4.cuadrante());

        //Probando rectangulo
        System.out.println("PROBEMOS RECTANGULO");
        Punto a1 = new Punto("a1",-9,2);
        Punto b1 = new Punto("b1",-3,8);
        Rectangulo x = new Rectangulo("RecA",a1,b1);
        
        Punto a2 = new Punto("a2",-7,4);
        Punto b2 = new Punto("b2",-4,6);
        Rectangulo y = new Rectangulo("RecB",a2,b2);
        Rectangulo prueba = new Rectangulo("prueba",0,0,0,5);
        System.out.println("el area del rectangulo " + x + " es: "+x.area());

        Rectangulo unionxy = x.Union(y);
        Rectangulo interxy = x.Interseccion(y);
        System.out.println("la union es: "+ unionxy);
        System.out.println("la interseccion es: "+ interxy);
        System.out.println("comparemos la union con la interseccion: "+unionxy.comparar(interxy));
        System.out.println("Ahora veamos en que cuadrante esta union: " + unionxy.cuadRect());
        System.out.println("Ahora probemos mas casos para las intersecciones");
        
        //notese que con dar dos puntos cuya x y y no coincidan tomamos como primer punto
        //el de la esquina inferior izquierda y el segundo como el de la esquina superior derecha
        //esta estandarizacion en la clase rectangulo nos es muy util en todo el resto de codigo.
        x = new Rectangulo("rec1",4,-5,2,-6);
        System.out.println("El primer rectangulo queda: "+x);

        y = new Rectangulo("rec2",3,-3,5,-8);
        System.out.println("El segundo rectangulo queda: "+y);
        Rectangulo nuevaInter = x.Interseccion(y);
        System.out.println("El resultado de esta interseccion es: "+nuevaInter);
        // se puede comprobar que esta interseccion es correcta en el siguiente link:
        //https://www.geogebra.org/calculator/t4mg9wsa
        
        //Probemos otra intersección
        x = new Rectangulo("rec1",0,0,5,5);
        System.out.println("El primer rectangulo queda: "+x);
        a1.CambiaX(3);
        a1.CambiaY(8);
        b1.CambiaX(8);
        b1.CambiaY(3);
        y.moverRect(a1,b1);
        System.out.println("El segundo rectangulo queda: "+y);
        nuevaInter = x.Interseccion(y);
        System.out.println("El resultado de esta interseccion es: "+nuevaInter+ ", ademas este rectangulo esta en el cuadrante: "+ nuevaInter.cuadRect());
        //este puede verificarse en:
        //https://www.geogebra.org/calculator/ucdmbepm
        //si se desean comprobar las demas intersecciones posibles basta con hacer los casos
        
        //Probando triangulo
        System.out.println("PROBEMOS TRIANGULO");
        Punto uno = new Punto("a1",1,1);
        Punto dos = new Punto("a2",0,0);
        Punto tres = new Punto("a1",5,5);
        Triangulo T = new Triangulo("T1",uno,dos,tres);
        //es claro que estos puntos no pueden formar un triangulo puesto que estan en la misma linea....
        uno.Cambia(10,5);
        T = new Triangulo("T1",uno,dos,tres);
        System.out.println("Los puntos dados si forman un triangulo: "+T);
        System.out.println("El area del triangulo dado es de: "+T.area());
        //declaremos otro triangulo
        Triangulo F = new Triangulo("F1",4,3,5,4,6,4);
        System.out.println("Los puntos dados para el triangulo "+F.obtenerNombre()+" forman un triangulo: "+F);
        System.out.println("El area del triangulo dado es de: "+F.area());
        System.out.println("Por tanto...");
        int com =T.comparar(F); 
        if(com==1){
            System.out.println(T.obtenerNombre()+" es mas grande");
        }else if(com == 0){
            System.out.println("Son iguales");
        }else{
            System.out.println(F.obtenerNombre()+" es mas grande");
        }
        System.out.println("Ahora veamos la interseccion de T1 y F1");
        Triangulo inter = T.intereseccion(F);
        System.out.println("la interseccion obtenida es: "+inter);
        // lo cual se puede verificar en el siguiente link:
        //https://www.geogebra.org/calculator/sdvpyzp5
        System.out.println("ahora probemos uno que tenga dos puntos adentro y uno fuera...");
        F = new Triangulo("fuera",4,3,5,4,8,0);
        inter = T.intereseccion(F);
        System.out.println("la interseccion obtenida es: "+inter);
        //lo cual se puede comprobar en:
        //https://www.geogebra.org/calculator/deysdqqd
    }
}
