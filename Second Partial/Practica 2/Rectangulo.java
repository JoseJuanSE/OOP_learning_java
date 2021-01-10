public class Rectangulo {
    private String name;
    private Punto a,b;
    public Rectangulo(String n,String an,Strign bn,int ax,int ay,int bx,int by){
        if(ax==bx || ay==by){
            System.out.println("Rectangulo invalido...");
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
        Rectangulo(n,"iz","de",ax,ay,bx,by);
    }
    public Rectangulo(String n,Punto a1,Punto b1){
        Rectangulo(n,a1.x,a1.y,b1.x,b1.y);
    }
    public Rectangulo(string x){
        Rectangulo(x,0,0,1,1);
    }
    public Rectangulo(){
        Rectangulo("r1");
    }
    public Rectangulo(Rectangulo r){
        Rectangulo(r.name,r.a,r.b);
    }
    public Rectangulo Union(Rectangulo o){
        Rectangulo ans = new Rectangulo("U1",Point(min(x,o.a.obtenerX()),min(y,o.a.obtenerY())),Point(max(x,o.b.obtenerX()),max(y,o.b.obtenerY())));
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
    public boolean puntodentro(Punto p){
        int thax = this.a.obtenerX();
        int thay = this.a.obtenerY();
        int  px= p.obtenerX();
        int  py= p.obtenerY();
        int thbx = this.b.obtenerX();
        int thby = this.b.obtenerY();
        return thax<=px && thay<=py && thbx>=px && thby>=py; 
    }
    public boolean estaAdentro(Rectangulo o){
        return this.puntodentro(o.a) && this.puntodentro(o.b);
    }
    public Rectangulo empty(){
        return rectangulo("vacio");
    }
    public Rectangulo Interseccion(Rectangulo o){
        if(this.estaAdentro(o))return o;
        if(o.estaAdentro(this))return this;
        /*Siempre:
            a1******a2
            *       *
            *       * 
            a3******a4
        */
        Point a3 = o.a;
        Point a2 = o.b;
        Point a1 = new Point(a3.obtenerX(),a2.obtenerY());
        Point a4 = new Point(a2.obtenerX(),a3.obtenerY());
        
        boolean a1d = this.puntodentro(a1);
        boolean a2d = this.puntodentro(a2);
        boolean a3d = this.puntodentro(a3);
        boolean a4d = this.puntodentro(a4);
        Rectangulo res = new Rectangulo();
        res = empty();
        if(a1d && a2d){
            res = Rectangulo("res");
        }else if(a2d && a4d){

        }else if(a4d && a3d){

        }else if(a3d && a1d){

        }else if(a1d){

        }else if(a2d){

        }else if(a3d){

        }else if(a4d){

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
        Punto aux = new Punto(a.obtenerX(),b.obtenerY());
        return aux.cuadrante();
    }
    public String toString(){
        return name+": ["+toString(a)+","+toString(b)+")]";
    }
}
