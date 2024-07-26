package opcionales.guia3.iniciado;

import java.util.Arrays;

public class Curso {
    private String nombre;
    private String descripcion;
    private Boolean estaHabilitado;
    private Alumno[] alumnos;

    // Constructor
    public Curso(String nombre, String descripcion, Boolean estaHabilitado, Alumno[] alumnos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estaHabilitado = estaHabilitado;
        this.alumnos = alumnos;
    }

    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(Boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String estaHabilitadoDesc(){
        return (this.estaHabilitado) ? "Si" : "No";
    }

    // Sobreescribir método
    @Override
    public String toString() {
        String mensaje = "Curso: " +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estaHabilitado=" + this.estaHabilitadoDesc() + "." + '\'';
        for (Alumno alumno : this.getAlumnos()) {
            mensaje += " " + alumno.toString() + '\'';
        }
        return mensaje;

    }
}
