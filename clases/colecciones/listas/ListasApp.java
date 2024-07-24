package clases.colecciones.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Diferencias:
+ Array list es más eficiente en la lectura de datos.
+ LinkedList es mucho más eficiente en el manejo de inserción y eliminación
*/

public class ListasApp {
    public static void main(String[] args) {
        listArrayExample();
        linkedListArrayExample();
        finalExample();
    }

    // Array List ejemplo y algunos métodos de clase.
    private static void listArrayExample(){
        List<String> nombresUsuarios = new ArrayList<String>();
        nombresUsuarios.add("Juan");
        nombresUsuarios.add("Pedro");
        nombresUsuarios.add("Maria");

        ArrayList<String> nombresUsuarios2 = new ArrayList<String>();
        nombresUsuarios2.add("Pablo");
        nombresUsuarios2.add("Leandro");

        nombresUsuarios.addAll(nombresUsuarios2);
        System.out.println(nombresUsuarios);
    }

    // Linked List ejemplo y algunos métodos de clase.
    private static void linkedListArrayExample() {
        LinkedList<String> tareasPendientes = new LinkedList<String>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Ir al gimnasio");
        tareasPendientes.add("Estudiar para el exámen");

        System.out.println("La primera tarea pendiente es: "+tareasPendientes.getFirst());
    }

    // Ejemplos de definición con List y luego la clase específica de colección.
    private static void finalExample() {
        List<String> apellidosUsuarios = new ArrayList<String>();
        apellidosUsuarios.add("Di María");
        apellidosUsuarios.add("Messi");
        apellidosUsuarios.add("Martinez");

        List<String> linkedApellidosUsuarios = new LinkedList<>(apellidosUsuarios);
        System.out.println(linkedApellidosUsuarios);
    }

}
