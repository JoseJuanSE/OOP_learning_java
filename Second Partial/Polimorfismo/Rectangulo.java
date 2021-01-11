class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double b, double a){
        super("Rectangulo");
        base = b;
        altura = a;
    }
    public Rectangulo(){
        this(10,10);
    }
    public double obtenerArea(){
        return base*altura;
    }
    public void dibujar(){
        System.out.println("Soy un Rectangulo de :"+base+"*"+altura);
    }
}
