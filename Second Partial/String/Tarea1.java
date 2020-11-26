import java.util.Scanner;
class Tarea1{
    public static boolean Esprefi(String a, String b){
        if(a.length()>b.length())return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))return false;
        return true;
    }
    public static String reverse(String a){
        StringBuffer ar = new StringBuffer(a);
        ar.reverse();
        return ar.toString();
    }
    public static boolean Essufi(String a, String b){
        a = reverse(a);
        b = reverse(b);
        return Esprefi(a,b);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su primera cadena: ");
        String a = leer.nextLine();
        System.out.print("Ingrese su segunda cadena: ");
        String b = leer.nextLine();
        if(Esprefi(a,b)){
            System.out.println("La primer cadena es prefijo de la segunda");
        }else{
            System.out.println("La primera cadena no es prefijo de la segunda");
        }
        if(Essufi(a,b)){
            System.out.println("La primer cadena es sufijo de la segunda");
        }else{
            System.out.println("La primer cadena no es sufijo de la segunda");
        }
    }
}