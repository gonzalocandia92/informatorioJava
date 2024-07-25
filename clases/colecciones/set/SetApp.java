package clases.colecciones.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetApp {
    public static void main(String[] args) {
        //SetExample();
        TreeSetExample();
    }

    private static void SetExample() {
        // Elementos únicos pero no mantiene un orden entre ellos
        Set<String> set1 = new HashSet<String>();
        set1.add("messi");
        set1.add("fideo");
        set1.add("motor");
        set1.add("asdoiasd");
        set1.add("D");
        set1.add("dibu");

        set1.remove("D");

        if (!set1.contains("D")){
            System.out.println("El conjunto no contiene 'D'");
        }

        if (!set1.isEmpty()) {
            System.out.println("El conjunto está vacío");
        }

        // Recorrer con for each
        for (String elemento : set1) {
            System.out.println(elemento);
        }

        System.out.println(("------------"));

        /* Ejemplo de iterador
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
    }

    private static void TreeSetExample() {
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("messi");
        set1.add("fideo");
        set1.add("motor");
        set1.add("asdoiasd");
        set1.add("D");
        set1.add("dibu");

        String firstElement = set1.first();
        System.out.println(firstElement);

        set1.remove("D");
        Set subSet = set1.subSet("fideo", "motor");
        System.out.println("subSet: "+ subSet);

        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object nextElement = iterator.next();
            System.out.println(nextElement.toString());
        }
    }


}
