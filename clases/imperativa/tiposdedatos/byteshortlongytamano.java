package imperativa.tiposdedatos;

public class byteshortlongytamano {
    public static void main(String[] args) {

        // Byte - 8 bits
        // Clase wrapper de Byte
        System.out.println("Rango de valor del byte: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);

        // Primitivo de Byte
        byte minValue = -128;
        byte maxValue = 127;

        // Short - 16 bits
        System.out.println("Rango de valor del short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);

        short minValueShort = -32768;
        short maxValueShort = 32767;

        // Integer - 32 bits
        System.out.println("Rango de valor del Integer: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        int minValueInteger = -2147483648;
        int maxValueInteger = 2147483647;

        // Long -
        System.out.println("Rango de valor del Long: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        long minValueLong = -9223372036854775808L;
        long maxValueLong = 9223372036854775807L;

        // Declaración y asignación de CONSTANTE
        final long SCREAMER_CAMEL_CASE = 3L;

    }
}
