class Circulo extends Figura{
    private double radio;
    private static final double PI = 3.1416;

    public Circulo (double r){
        super("Circulo");
        radio = r;
    }
    public Circulo(){
        this(10.0);
    }
    public double obtenerArea(){
        return (PI * radio * radio);
    }
    public void dibujar(){
        System.out.println("Soy un Circulo con radio: " + radio);
    }
}
