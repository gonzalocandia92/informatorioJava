package clases.poo.escenario1;


import clases.poo.escenario1.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class EscenarioApp {
    public static void main(String[] args) {
        List<ZoologicoInterface> listaZoologico = new ArrayList<ZoologicoInterface>();

        Perro perro = new Perro("Firu", 2);
        Perro perro2 = new Perro("Asd", 3);
        Gato gato = new Gato("Michi", 8, "Calle");

        List<Animal> animales = new ArrayList<Animal>();

        animales.add(perro2);
        animales.add(gato);
        animales.add(perro);

        ZoologicoSaenzPena zooSaenzPena = new ZoologicoSaenzPena(animales);
        Zoologico zoo = new Zoologico(animales);

        listaZoologico.add(zoo);
        listaZoologico.add(zooSaenzPena);

        for (ZoologicoInterface z: listaZoologico) {
            zoo.hacerSonidoAnimal();
        }
    }
}
