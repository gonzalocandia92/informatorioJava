package opcionales.guia3.desafio;

import opcionales.guia3.desafio.dominio.Auto;
import opcionales.guia3.desafio.dominio.Flota;
import opcionales.guia3.desafio.dominio.Moto;
import opcionales.guia3.desafio.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class FlotaApp {
    public static void main(String[] args) {

        // Instanciar autos y motos
        Auto auto1 = new Auto("Fiat", "Uno", "ABC123", 3);
        Auto auto2 = new Auto("Fiat", "600", "ABC124", 3);
        Auto auto3 = new Auto("Renault", "Kangoo", "ABC125", 4);
        Auto auto4 = new Auto("Renault", "Kwid", "ABC126", 5);

        Moto moto1 = new Moto("Honda", "CB600", "104ABC");
        Moto moto2 = new Moto("Yamaha", "R6", "104ABC");

        // Crear lista de vehiculos
        List<Vehiculo> vehiculos1 = new ArrayList<Vehiculo>();
        List<Vehiculo> vehiculos2 = new ArrayList<Vehiculo>();

        // Guardo los vehiculos en listas..
        vehiculos1.add(auto1);
        vehiculos2.add(auto2);
        vehiculos1.add(auto3);
        vehiculos2.add(auto4);
        vehiculos1.add(moto1);
        vehiculos2.add(moto2);

        // Instancio una flota con la lista de vehiculos
        Flota flotaSur = new Flota("Sur", vehiculos1);
        Flota flotaNorte = new Flota("Norte", vehiculos2);

        flotaSur.moverVehiculos();
        System.out.println();
        flotaNorte.moverVehiculos();

    }
}
