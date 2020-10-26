public class Arrays {
    //Arreglo de obsjetos Racionales
    public static void main(String[] args){
        System.out.println("Arreglos de tipo Racional");
        Racional grupoA[] = new Racional[3];
        grupoA[0] = new Racional();
        grupoA[1] = new Racional(3,2);
        grupoA[2] = new Racional(2,5);
        //imprimimos valores
        for(int i=0;i<grupoA.length;i++)
            grupoA[i].imprimir();
        //Modificamos los valores
        grupoA[0].establecer(0,2);
        grupoA[1].establecer(6,6);
        grupoA[2].establecer(7,7);

        //Desplegamos usando for-each
        System.out.println("Desplegamos usando for-each");
        for(Racional var:grupoA)
            var.imprimir();
    }
}
