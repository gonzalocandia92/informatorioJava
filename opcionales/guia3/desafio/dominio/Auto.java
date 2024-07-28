package opcionales.guia3.desafio.dominio;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, String patente, int puertas) {
        super(marca, modelo, patente);
        this.puertas = puertas;
    }

    @Override
    public void mover() {
        System.out.println(marca+" - "+modelo+": "+"El coche está conduciendo");
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
