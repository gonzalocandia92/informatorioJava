package imperativa.Conversiones;

public class Conversiones {
    public static void main(String[] args) {

        // Conversion de tipo promocion
        int value = 5;

        // Conversion de tipo contracción
        int value2 = (int)5.69f; // Castear a int (puede haber pérdida de datos)
        System.out.println(value2);

        // Conversión de tipo implícita
        double value3 = 10 * 20.5d; // Castear a double (Se combinan dos tipos de datos, queda el de mayor precisión)
        System.out.println(value3);

        int value4 = 1 + 4 * 2;
        System.out.println(value4); // Prioridades de operadores...

    }

}
