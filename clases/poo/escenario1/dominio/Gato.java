package clases.poo.escenario1.dominio;

public class Gato extends Animal{

    private String raza;

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miamu miau..");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


}
