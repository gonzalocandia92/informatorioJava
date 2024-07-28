package opcionales.guia3.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    // Atributo
    private String nombre;
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    // Constructor
    public Flota(String nombre, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }
    // Getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // Método mover vehiculos
    public void moverVehiculos(){
        System.out.println("En la flota: "+nombre+" se mueven los vehiculos: ");
        for (Vehiculo v : vehiculos) {
            v.mover();
        }

    }
}
