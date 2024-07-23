package estructurado;


public class EstructuraSwitchCase {
    public static void main(String[] args) {
        int cal1 = 5;
        int cal2 = 3;
        int prom = (cal1 + cal2) / 2;
        System.out.println("El valor prom es: "+prom);
        String mensaje;

        switch (prom){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensaje = "Desaprobaste";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                mensaje = "Aprobaste";
                break;
            default:
                mensaje = "Valor no válido";
                break;
        }

        System.out.println(mensaje);
    }
}
