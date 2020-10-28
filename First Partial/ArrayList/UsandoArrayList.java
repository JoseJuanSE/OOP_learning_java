import java.util.*;
public class UsandoArrayList{

    public static void main(String [ ] args) {

        // Creando un arreglo vac�o

        ArrayList<String> list = new ArrayList<String>();
        
        // Agregando elementos a ArrayList

        list.add("Quijote");
        list.add("Sancho");
		list.add("Rocinante");
		list.add("Rocinante");
        //Agrega el elemento en la posici�n 1 del arreglo
        list.add(1, "Pedro Paramo");

        // Despliega el contenido de ArrayList
        System.out.println("The arraylist contains the following elements: "
                + list);

        // Checa el �ndice de "Rocinante"

        int pos = list.indexOf("Rocinante");
        int pos2 = list.indexOf("Gregorio Samsa");

        System.out.println("El indice de Rocinante es: " + pos);
        System.out.println("El indice de Gregorio Samsa es: " + pos2);
        
        // Checking if array list is empty
        boolean check = list.isEmpty();

        System.out.println("Checa si Arraylist esta vacio: " + check);
        
		// Obtiene el tama�o del arreglo
        int size = list.size();
        System.out.println("El tamamo es: " + size);
        
       // Checa si un elemento est� incluido en el ArrayList
        boolean element = list.contains("Dracula");
        System.out.println("Existe el elemento Dracula?: " + element);

        // Obtiene el elemento de una posisicon especifica
        String item = list.get(0);
        System.out.println("El elemento en la posicion 0 es: " + item);

        // Listando los elementos del Arraylist
        // Primera forma: Usando la sentencia for
        System.out.println("Listando el arreglo usando for: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " - elemento: " + list.get(i));
        }

        // Segunda forma: Usando for-each.
        System.out.println("Listando el arreglo usando for-each: ");
        for (String aux : list) {
            System.out.println("El elemento es: " + aux);
        }

        // Tercera forma: Usando un iterador:
        // hasNext(): devuelve true si a�n hay elementos en el ArrayList
        // next(): devuelve el siguiente elemento
        System.out.println("Listando el ArrayList usando un iterador");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("Item is: " + it.next());
        }

        // Reemplazando un elemento
        list.set(0, "Alonso Quijano");
        System.out.println("El Arraylist con reempazo es: " + list);

        // Removiendo el elemento 1
        list.remove(1);

        // Removiendo la primera ocurrencia de "Rocinante"
        list.remove("Rocinante");
        list.remove("Dracula");

        System.out.println("El ArrayList es: " + list);

        // Conviertiendo un ArrayList a Arreglo
        String[] arreglo = list.toArray(new String[list.size()]);
        System.out.println("El arreglo resultante es: "+ Arrays.toString(arreglo));
    }
}
