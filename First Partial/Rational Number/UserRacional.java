class UserRacional{
    public static void main(String [] args){
        Racional A,B,C;
        A = new Racional(3,3);
        B = new Racional(2,2);
        C = new Racional(4,4);
        /*A.imprimir();
        B = new Racional(3,0);
        B.imprimir();
        System.out.println("Multiplicacion de (3,1)*(4,5)");
        C = new Racional(4,5);
        B.mul(C);
        B.imprimir();
        A.establecer(5, 6);
        B.mul(A,C);
        System.out.println("Multiplicacion de (5,6)*(4,5)");
        B.imprimir();
        B.mul(C.mul(B));
        */
        A.mul(B.mul(C));
        A.reduce();
        A.imprimir();
    }
}