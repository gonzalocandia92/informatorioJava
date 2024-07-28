package opcionales.guia3.desafio.dominio;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    @Override
    public void mover() {
        System.out.println(marca+" - "+modelo+": "+"La moto está acelerando");
    }

}
