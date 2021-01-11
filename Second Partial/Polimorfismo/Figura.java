abstract class Figura {
    private String nombre;

    abstract public double obtenerArea();
    abstract public void dibujar();

    public Figura (String nomFigura){
        nombre = nomFigura;
    }
    public boolean mayorQue (Figura fig){
        return (this.obtenerArea() > fig.obtenerArea());
    }
    public String toString (){
        return (nombre + " , "+obtenerArea());
    }
}
