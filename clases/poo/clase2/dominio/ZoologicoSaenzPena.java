package clases.poo.clase2.dominio;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoSaenzPena implements ZoologicoInterface {
    private List<Animal> animales = new ArrayList<Animal>();

    public ZoologicoSaenzPena(List<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public void hacerSonidoAnimal() {
        System.out.println("Hacer sonido desde saenz peña: ");
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
