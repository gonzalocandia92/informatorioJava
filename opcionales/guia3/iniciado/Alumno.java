package opcionales.guia3.iniciado;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Alumno {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;

    // Constructor
    public Alumno(String nombre, String apellido, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.setFechaNacimiento(fechaNacimiento);
    }

    // Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(fechaNacimiento);
    }

    public void setFechaNacimiento(String fechaNacimiento) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                this.fechaNacimiento = dateFormat.parse(fechaNacimiento);
            } catch (ParseException e) {
                System.out.println("Error en formato de fecha");
            }
        }

    // Sobreescribir toString
    @Override
    public String toString() {
        return "Alumno: " +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", fecha de nacimiento=" + this.getFechaNacimiento() +
                ", edad=" + this.edad +
                ". ";
    }

}
