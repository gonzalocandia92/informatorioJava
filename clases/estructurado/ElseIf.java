package estructurado;

public class ElseIf {
    public static void main(String[] args) {
        boolean esUnDiaDeClases = true;
        final String DIA = "Viernes";

        if (esUnDiaDeClases && DIA == "Lunes") {
            // Sentencias..
            System.out.println("Hoy es: " + DIA+ "y no hay clases");
        } else if (!esUnDiaDeClases) {
            System.out.println("No es día de clases");
        } else {
            System.out.println("No es lunes");
        }
    }
}
