class UsoFiguras {
    public static void main(String[] args) {
        Figura[] grupo = new Figura[3];
        int mayor;

        grupo[0] = new Circulo();
        grupo[1] = new Rectangulo(55,55);
        grupo[2] = new Triangulo(20,30);

        for (int i=0;i<3;i++){
            System.out.println(grupo[i]);
            System.out.println("Area: "+grupo[i].obtenerArea());
            System.out.println("Dibujar: ");
            grupo[i].dibujar();
        }

        if(grupo[0].mayorQue(grupo[1]))mayor = 0;
        else mayor =1;
        if(grupo[2].mayorQue(grupo[mayor]))mayor = 2;
        System.out.println("La figura mayor es: ");
        System.out.println(grupo[mayor]);
    }
}
