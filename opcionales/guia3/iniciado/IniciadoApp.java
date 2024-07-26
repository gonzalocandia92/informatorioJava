package opcionales.guia3.iniciado;


public class IniciadoApp {
    public static void main(String[] args) {
        Alumno alumnito = new Alumno("Juan", "Perez", 18, "1980-08-07");
        Alumno alumnito2 =  new Alumno("Fulano", "Perez", 12, "1986-08-07");
        Alumno alumnito3 = new Alumno("Mengano", "Juarez", 14, "1984-08-07");
        System.out.println(alumnito);
        System.out.println(alumnito2);
        System.out.println(alumnito3);

    }

}
