public class Triangulo {
    private Punto a,b,c;
    private String name;

    //--------auxiliares-----------
    static boolean esTriangulo(int ax,int ay,int bx,int by,int cx,int cy){
        Punto a_1 = new Punto("a1",ax,ay);
        Punto b_1 = new Punto("b1",bx,by);
        Punto c_1 = new Punto("c1",cx,cy);
        /*
            a
           / \
          b---c
        */
        double lado1 = a_1.distancia(b_1);
        double lado2 = a_1.distancia(c_1);
        double lado3 = b_1.distancia(c_1);
        return lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1;
    }
    static double abs(double x){
        if(x<0)return -1*x;
        return x;
    }
    //-----------------------------
    //-------Constructores---------
    public Triangulo(String n,String an,String bn,String cn,int ax,int ay,int bx,int by,int cx,int cy){
        name = n;
        if(!esTriangulo(ax,ay,bx,by,cx,cy)){
            System.out.println("Los puntos dados no forman un triangulo...");
        }else{
            a = new Punto(an,ax,ay);
            b = new Punto(bn,bx,by);
            c = new Punto(cn,cx,cy);
            name = n;
        }
    }
    public Triangulo(String n,int ax,int ay,int bx,int by,int cx,int cy){
        this(n,"a","b","c",ax,ay,bx,by,cx,cy);
    }
    public Triangulo(int ax,int ay,int bx,int by,int cx,int cy){
        this("t1","a","b","c",ax,ay,bx,by,cx,cy);
    }
    public Triangulo(String n,Punto a1,Punto b1,Punto c1){
        this(n,"a","b","c",a1.obtenerX(),a1.obtenerY(),b1.obtenerX(),b1.obtenerY(),c1.obtenerX(),c1.obtenerY());
    }
    public Triangulo(Punto a1,Punto b1,Punto c1){
        this("t1","a","b","c",a1.obtenerX(),a1.obtenerY(),b1.obtenerX(),b1.obtenerY(),c1.obtenerX(),c1.obtenerY());
    }
    public Triangulo(){
        this("t1","a","b","c",1,1,1,2,2,1);
    }
    //-----------------------------

    //------Setters y Getters------
    public String obtenerNombre(){
        return name;
    }
    public Punto obtenerP1(){
        return a;
    }
    public Punto obtenerP2(){
        return b;
    }
    public Punto obtenerP3(){
        return c;
    } 
    public void cambiarP1(Punto a1){
        if(!esTriangulo(a1.obtenerX(), a1.obtenerY(), b.obtenerX(), b.obtenerY(), c.obtenerX(), c.obtenerY())){
            System.out.println("No es posible cambiar el punto puesto que esto no seria un triangulo...");
        }else{
            a = a1;
        }
    }
    public void cambiarP2(Punto a1){
        if(!esTriangulo(a.obtenerX(), a.obtenerY(),a1.obtenerX(), a1.obtenerY(), c.obtenerX(), c.obtenerY())){
            System.out.println("No es posible cambiar el punto puesto que esto no seria un triangulo...");
        }else{
            b = a1;
        }
    }
    public void cambiarP3(Punto a1){
        if(!esTriangulo(a.obtenerX(), a.obtenerY(),b.obtenerX(), b.obtenerY(), a1.obtenerX(), a1.obtenerY())){
            System.out.println("No es posible cambiar el punto puesto que esto no seria un triangulo...");
        }else{
            c = a1;
        }
    }
    public void cambiarNombre(String n){
        name = n;
    }
    //-----------------------------
    public double area(){
        double l1 = a.distancia(b);
        double l2 = a.distancia(c);
        double l3 = b.distancia(c);
        // como no sabemos el tipo de triangulo, tenemos que sacar el area con la formula de Heron.
        double sp = (l1+l2+l3)/2;
        return Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
    }
    static boolean puntoDentro(Triangulo af,Punto d){
        /*un punto esta dentro de un triangulo, sí y solo sí, 
            al tener un triangulo: 
              a
             / \     *d
            b---c
            y un punto d, entonces podemos trazar un triangulo con los puntos b,c,d
            otro con los puntos a,c,d
            y otro con los puntos a,b,d
            si el punto d, esta dentro del triangulo, la suma de las areas de los 3 triangulos anteriormente mencionadas
            debe ser igual a el area del triangulo a,b,c.
            Entonces llegamos a la conclusion de que sí.
            t = (a,b,c)
            y
            t1 = (a,b,d)
            t2 = (a,c,d)
            t3 = (b,c,d)
            entonces:
            d esta dentro del triangulo sí:
            area(t1)+area(t2)+area(t3) = area(t4).
            de otra forma d esta fuera.
            Nota: si continuamos el analisis podemos notar que cuando d esta fuera
            siempre :
            area(t1)+area(t2)+area(t3) > area(t4)
        */
        Triangulo t1 = new Triangulo("t1",af.a,af.b,d);
        Triangulo t2 = new Triangulo("t2",af.a,af.c,d);
        Triangulo t3 = new Triangulo("t3",af.b,af.c,d);
        //consideremos el margen de error en los calculos de double
        return abs (t1.area() + t2.area() + t3.area() -af.area()) < 0.005;
    }
    static boolean estaDentroDe(Triangulo adentro,Triangulo afuera){
        //un triangulo esta dentro de otro si todos los puntos de un triangulo estan dentro del otro
        return puntoDentro(afuera,adentro.a) && puntoDentro(afuera,adentro.b) && puntoDentro(afuera,adentro.c);
    }
    public Triangulo intereseccion(Triangulo o){
        //por simplicidad solo veamos el caso base, si esta el triangulo o no dentro
        //si hay un triangulo dentro de otro entonces el que esta dentro es la interseccion.
        if(estaDentroDe(this,o))return this;
        if(estaDentroDe(o,this))return o;
        //en otro caso
        System.out.println("No hay interseccion...");
        return null;
    }
    public int comparar(Rectangulo o){
        double a1=this.area();
        double a2=o.area();
        if(a1<a2)return -1;
        if(a1==a2)return 0;
        return 1;
    }
    public int comparar(Triangulo o){
        double a1=this.area();
        double a2=o.area();
        if(a1<a2)return -1;
        if(a1==a2)return 0;
        return 1;
    }
    public String toString(){
        return name+"["+a+","+b+","+c+"]";
    }
}