public class Rectangulo{
    private String name;
    private Punto a,b;
    //-----funciones auxiliares-----
    static void swap(int a,int b){
        int aux = a;
        a=b;
        b=aux;
    }
    static int max(int a,int b){
        return a>b?a:b;
    }
    static int min(int a,int b){
        return a<b?a:b;
    }
    //------------------------------
    //---------constructores--------
    public Rectangulo(String n,String an,String bn,int ax,int ay,int bx,int by){
        if(ax==bx || ay==by){
            System.out.println(n + " es un rectangulo invalido...");
            a = new Punto("-1",0,0);
            b = new Punto("-1",0,0);
            name = "invalido";
        }else{
            if(ax>bx){
                swap(ax,bx);
            }
            if(ay>by){
                swap(ay,by);
            }
            a = new Punto(an,ax,ay);
            b = new Punto(bn,bx,by);
            name = n;
            /*Siempre:
            *******b
            *      *
            *      * 
            a*******
            */
        }
    }
    public Rectangulo(String n,int ax,int ay,int bx,int by){
        this(n,"iz","de",ax,ay,bx,by);
    }
    public Rectangulo(String n,Punto a1,Punto b1){
        this(n,a1.obtenerX(),a1.obtenerY(),b1.obtenerX(),b1.obtenerY());
    }
    public Rectangulo(String x){
        this(x,0,0,1,1);
    }
    public Rectangulo(){
        this("r1");
    }
    public Rectangulo(Rectangulo r){
        this(r.obtenerNombre(),r.a,r.b);
    }
    //-----------------------------
    //setters y getters
    public String obtenerNombre(){
        return name;
    }
    public Punto obtenerP1(){
        return a;
    }
    public Punto obtenerP2(){
        return b;
    }
    public void cambiarNombre(String x){
        name = x;
    }
    public void cambiarP1(Punto x){
        if(x.obtenerX()==a.obtenerX() || x.obtenerY()==a.obtenerY()){
            System.out.println("Este cambio no genera un rectangulo...");
            return ;
        }
        a=x;
        int ax = a.obtenerX(),ay=a.obtenerY();
        int bx = b.obtenerX(),by=b.obtenerY();
        if(ax>bx){
            swap(ax,bx);
        }
        if(ay>by){
            swap(ay,by);
        }
        a = new Punto("iz",ax,ay);
        b = new Punto("de",bx,by);
    }
    public void cambiarP2(Punto x){
        if(x.obtenerX()==b.obtenerX() || x.obtenerY()==b.obtenerY()){
            System.out.println("Este cambio no genera un rectangulo...");
            return ;
        }
        b=x;
        int ax = a.obtenerX(),ay=a.obtenerY();
        int bx = b.obtenerX(),by=b.obtenerY();
        if(ax>bx){
            swap(ax,bx);
        }
        if(ay>by){
            swap(ay,by);
        }
        a = new Punto("iz",ax,ay);
        b = new Punto("de",bx,by);
    }
    //-------------------
    public Rectangulo Union(Rectangulo o){
        Rectangulo ans = new Rectangulo("U1",min(a.obtenerX(),o.a.obtenerX()),min(a.obtenerY(),o.a.obtenerY()),max(b.obtenerX(),o.b.obtenerX()),max(b.obtenerY(),o.b.obtenerY()));
        return ans;
    }
    public double Area(){
        return (b.obtenerX()-a.obtenerX())*(b.obtenerY()-a.obtenerY());
    }
    public int comparar(Rectangulo o){
        double a1=this.Area();
        double a2=o.Area();
        if(a1<a2)return -1;
        if(a1==a2)return 0;
        return 1;
    }
    public int comparar(Triangulo o){
        double a1=this.Area();
        double a2=o.Area();
        if(a1<a2)return -1;
        if(a1==a2)return 0;
        return 1;
    }
    public boolean puntodentro(Punto p){
        int thax = this.a.obtenerX();
        int thay = this.a.obtenerY();
        int  px= p.obtenerX();
        int  py= p.obtenerY();
        int thbx = this.b.obtenerX();
        int thby = this.b.obtenerY();
        return thax<=px && thay<=py && thbx>=px && thby>=py; 
    }
    public boolean estaAdentro(Rectangulo o){// this fuera, o dentro
        return this.puntodentro(o.a ) && this.puntodentro(o.b);
    }
    public Rectangulo empty(){
        return new Rectangulo("vacio");
    }
    public Rectangulo Interseccion(Rectangulo o){
        if(this.estaAdentro(o))return o; 
        if(o.estaAdentro(this))return this;
        Punto a3 = o.a;
        Punto a2 = o.b;
        Punto a1 = new Punto("a1",a3.obtenerX(),a2.obtenerY());
        Punto a4 = new Punto("a4",a2.obtenerX(),a3.obtenerY());
        
        boolean a1d = this.puntodentro(a1);
        boolean a2d = this.puntodentro(a2);
        boolean a3d = this.puntodentro(a3);
        boolean a4d = this.puntodentro(a4);
        Rectangulo res = new Rectangulo();
        res = empty();
        /*Siempre:
            a1******a2
            *       *
            *       * 
            a3******a4
        */
        if(a1d && a2d){
            res = new Rectangulo("res",a1.obtenerX(),this.a.obtenerY(),a2.obtenerX(),a2.obtenerY());
        }else if(a2d && a4d){
            res = new Rectangulo("res",this.a.obtenerX(),a4.obtenerY(),a2.obtenerX(),a2.obtenerY());
        }else if(a4d && a3d){
            res = new Rectangulo("res",a3.obtenerX(),a3.obtenerY(),a4.obtenerX(),this.b.obtenerY());
        }else if(a3d && a1d){
            res = new Rectangulo("res",a3.obtenerX(),a3.obtenerY(),this.b.obtenerX(),a2.obtenerY());
        }else if(a1d){
            res = new Rectangulo("res",a1.obtenerX(),a1.obtenerY(),this.b.obtenerX(),this.a.obtenerY());
        }else if(a2d){
            res = new Rectangulo("res",this.a.obtenerX(),this.a.obtenerY(),a2.obtenerX(),a2.obtenerY());
        }else if(a3d){
            res = new Rectangulo("res",a3.obtenerX(),a3.obtenerY(),this.b.obtenerX(),this.b.obtenerY());
        }else if(a4d){
            res = new Rectangulo("res",this.a.obtenerX(),this.b.obtenerY(),a4.obtenerX(),a4.obtenerY());
        }
        if(res.obtenerNombre()=="vacio")
            System.out.println("No hay intersección");
        return res;
    }
    public void moverRect(Punto a,Punto b){
        Rectangulo aux = new Rectangulo("aux",a,b);
        this.a=a;
        this.b=b;
    }
    public int cuadRect(){
        Punto aux = new Punto("Rect1",a.obtenerX(),b.obtenerY());
        return aux.cuadrante();
    }
    public String toString(){
        return name+": ["+a+","+b+")]";
    }
}
