package clases.poo.clase1.dominio;

public class Auto {
    private String marca;
    private int cantidadDePuertas;
    private String modelo;
    private String color;
    private String placa;

    // Constructor

    public Auto(String marca, int cantidadDePuertas, String modelo, String color, String placa) {
        this.marca = marca;
        this.cantidadDePuertas = cantidadDePuertas;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }


    // Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }


    // Pisar métodos

    @Override
    public String toString() {
        return "Marca: "+marca+" - Modelo: "+modelo+" - Placa: "+placa;
    }
}
