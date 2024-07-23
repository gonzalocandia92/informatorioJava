package estructurado;

public class WhileDo {
    public static void main(String[] args) {
        int cont = 1;
        while (cont <= 10) {
            System.out.println("Hola soy el número: "+ cont);
            cont++;
        }

        do {
            System.out.println("Por lo menos una vez... "+ cont);
            cont--;
        }while (cont > 10); // Condición falsa

    }
}
