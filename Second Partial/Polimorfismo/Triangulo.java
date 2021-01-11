class Triangulo extends Figura{
    private double base;
    private double altura;
    public Triangulo(double b,double a){
        super("Triangulo");
        base = b;
        altura = a;
    }
    public Triangulo(){
        this(10,10);
    }
    public double obtenerArea(){
        return base*altura/2;
    }
    public void dibujar(){
        System.out.println("Soy un Triangulo de: "+base+"*"+altura);
    }
}
