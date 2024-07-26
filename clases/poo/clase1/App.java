package clases.poo.clase1;

import clases.poo.clase1.dominio.Auto;
import clases.poo.clase1.dominio.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         Para instanciar:
         1. Tipo de dato -> Clase Persona
         2. variable para guardar el objeto
         3. instanciar el objeto con new NombreDeClase()
         */


        /*
        Instancia de una persona:

        Persona persona = new Persona("Holu", "Camina", 30, 98765432);
        System.out.print(persona.getApellido()+" ");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());
        System.out.println();

        Modificación:

        persona.setApellido("Pérez");
        persona.setNombre("Juan");
        persona.setEdad(25);
        persona.setDni(12345678);

        System.out.print(persona.getApellido()+" ");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());
        System.out.println();

        Instacia de otra persona desde segundo constructor:

        Persona persona2 = new Persona(12345678);
        System.out.print(persona2.getApellido()+" ");
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());
        System.out.println(persona2.getDni());
        System.out.println();
        */

        Persona persona = new Persona("Juan", "Perez", 30, 12345678);
        Auto autito = new Auto("FIAT", 3, "UNO", "BLANCO", "ABC123");

        persona.setAuto(autito);

        System.out.println("Nombre de persona: "+persona.getNombre() +", patente de su auto: "+persona.getAuto().getPlaca());

        // NOTA!!! -> toString sobreescrito
        System.out.println(autito.toString());
    }
}
