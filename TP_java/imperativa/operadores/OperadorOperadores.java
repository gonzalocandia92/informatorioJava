package imperativa.operadores;

public class OperadorOperadores {
    public static void main(String[] args) {

        int resultado = 5 + 3 * 2;
        int resultado2 = 20/4*2+3;

        // Operador ternario
        // > < = >= <=
        int resultado3 = (resultado2 > resultado) ? 1 : 0;

        int value = 5;
        System.out.println(value++); // Asigna, luego incremetna
        System.out.println(value--); // Asigna, luego decrementa
        System.out.println(++value); // Incrementa value luego asigna
        System.out.println(--value); // Decrementa value luego asigna

    }
}
