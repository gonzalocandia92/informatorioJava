package clases.colecciones.map;

import java.util.HashMap;
import java.util.Map;


public class MapApp {
    public static void main(String[] args) {
        // ..
        hashMapExample();
    }

    private static void hashMapExample(){
        Map<String, String> definiciones = new HashMap<String, String>();

        definiciones.put("Java", "Lenguaje de programación orientado a objetos");
        definiciones.put("Python", "Lenguaje de programación interpretado y dinámico");
        definiciones.put("C++", "Lenguaje de programación de alto rendimiento y eficiencia");

        // Al obtener por clave se guarda el valor
        String valor = definiciones.get("Java");
        System.out.println(valor);

        // Ejemplo de eliminación de una clave-valor.
        definiciones.remove("Java");

        // Imprime el mapa entero con clave-valor
        System.out.println(definiciones);

        // Boolean por Clave
        System.out.println(definiciones.containsKey("Java"));

        // Boolean por Valor
        System.out.println(definiciones.containsValue("Lenguaje de programación interpretado y dinámico"));

        // Recorrer un mapa con For Each
        for (Map.Entry<String,String> elemento: definiciones.entrySet()) {
            System.out.println("Clave: "+elemento.getKey()+", Valor: "+elemento.getValue());
        }

    }
}

