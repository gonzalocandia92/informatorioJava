package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        int[] miArray = {1,2,3,4,5,6,7};
        System.out.println(miArray.length);
        System.out.println("La posición 7 tiene: "+miArray[6]);

        double[] miArray2 = new double[6];
        System.out.println("Mi array2[0]: "+miArray2[0]);

        // Cambiar el valor de un elemento en una posición
        miArray[0] = 250;

        // Recorrer desde el comienzo
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("El valor en la posición "+ i +" : "+miArray[i]);
        }

        // Recorrer desde el final
        int[] array = {0,1,2,3,4,5,6};
        for (int i = array.length -1; i >= 0; i--) {
            System.out.println("Elemento: "+i);
            System.out.println("Valor: "+array[i]);
        }
    }
}
