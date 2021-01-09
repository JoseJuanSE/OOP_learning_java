public class Punto {
    private int x,y;
    private String name;
    public Punto(){
        x = y = 0;
        name = "P1";
    }
    public Punto(String name){
        x = y = 0;
        this.name = name;
    }
    public Punto(String g,int a,int b){
        name = g;
        x=a;
        y=b;
    }
    int obtenerX(){
        return x;
    }
    public int obtenerY(){
        return y;
    }
    public String obtenerNombre(){
        return name;
    }
    public void CambiaX(int a){
        x=a;
    }
    public void CambiaY(int a){
        y=a;
    }
    public void CambiarNombre(String a){
        name = a;
    }
    public void establece(String g,int a,int b){
        name = g;
        x=a;
        y=b;
    }
    public String toString(){
        return name+"("+x+","+y+")";
    }
    public double distancia(Punto a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }
    public double distancia(){
        return Math.sqrt((this.x)*(this.x)+(this.y)*(this.y));
    }
    public int cuadrante(){
        if(x>=0){
            if(y>=0){
                return 1;
            }else{
                return 4;
            }
        }else{
            if(y>=0){
                return 2;
            }else{
                return 3;
            }
        }
    }
}
