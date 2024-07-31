package opcionales.guia3.iniciado;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class IniciadoApp {
    public static void main(String[] args) {
        // Declara e inicializa scanner y variable bandera
        Scanner sc = new Scanner(System.in);
        char x = 'S';
        ArrayList<Alumno> alumnosArray = new ArrayList<>();

        // Variables para curso
        char c = 'S';



        while (x == 'S') {
            System.out.print("¿Desea crear un alumno? (S/N): ");
            x = sc.next().charAt(0);
            if (x == 'S') {
                alumnosArray.add(crearAlumno());
            }
        }

        for (Alumno a : alumnosArray) {
            System.out.println(a);
        }

        Curso unCurso = new Curso("1A", "Primero A", true, alumnosArray);

        System.out.println(unCurso.toString());




    }

    public static Alumno crearAlumno() {
        // Variables para alumnos
        String nombre;
        String apellido;
        int edad;
        String fechaNacimiento;
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese apellido");
        apellido = sc.next();
        System.out.println("Ingrese edad");
        edad = sc.nextInt();
        System.out.println("Ingrese fechaNacimiento (yyyy-MM-dd)");
        fechaNacimiento = sc.next();

        return new Alumno( nombre, apellido, edad, fechaNacimiento);
        }

    public static Curso crearCurso(ArrayList<Alumno> listaAlumnos) {

        // Variables para curso
        String nombre;
        String descripcion;
        String habilitado;
        boolean estaHabilitado;
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese descripcion");
        descripcion = sc.next();
        System.out.println("¿Esta habilitado? (S/N)");
        habilitado = sc.next()
        estaHabilitado = (Objects.equals(habilitado, "S"));

        return new Curso( nombre, descripcion, estaHabilitado, listaAlumnos);
    }
}



