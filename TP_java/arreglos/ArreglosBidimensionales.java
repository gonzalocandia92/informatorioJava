package arreglos;

public class ArreglosBidimensionales {
    public static void main(String[] args) {

        // Arreglo bidimensional
        int[][] arrBidimensional = {{1, 2}, {3, 4, 5}};

        // Mostrar primer elemento
        System.out.println("Primer elemento 0,0: " + arrBidimensional[0][0]);

        // Recorrer elementos
        for (int i = 0; i < arrBidimensional.length; i++) {
            for (int j = 0; j < arrBidimensional[i].length; j++) {
                System.out.println("arrDimensional[" + i + "][" + j + "]: " + arrBidimensional[i][j]);
            }
        }

        // Recorrer elementos con fors más lindos
        System.out.println();
        for (int[] its : arrBidimensional) {
            for (int anInt : its) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
