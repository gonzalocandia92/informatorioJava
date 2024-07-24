package clases.poo;

import clases.poo.dominio.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         Para instanciar:
         1. Tipo de dato -> Clase Persona
         2. variable para guardar el objeto
         3. instanciar el objeto con new NombreDeClase()
         */

        Persona persona = new Persona("Holu", "Camina", 30, 98765432);

        System.out.print(persona.getApellido()+" ");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());
        System.out.println();

        persona.setApellido("Pérez");
        persona.setNombre("Juan");
        persona.setEdad(25);
        persona.setDni(12345678);

        System.out.print(persona.getApellido()+" ");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());


    }
}
