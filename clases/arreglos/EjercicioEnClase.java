package arreglos;

public class EjercicioEnClase {
    public static void main(String[] args) {
        /*
        Dado un arreglo de 4 posiciones crear un programa en java
        que permita tomar los dos valores del medio eliminando los extremos.
        Mostrar por pantalla el resultado.
        (Debe ser un arreglo de dos posiciones)
         */

        int[] array = {1,2,3,4,6};
        int[] result = new int[array.length-2];
        int x = 0;

        for (int i = 1; i < (array.length-1); i++) {
            result[x] = array[i];
            x++;
            }

        System.out.println("Recorrer el array resultado");
        for (int j : result) {
            System.out.print(j+" ");
        }

    }
}
