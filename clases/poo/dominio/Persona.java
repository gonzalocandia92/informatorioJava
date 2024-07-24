package clases.poo.dominio;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;

    // Relaciones 1:1
    private Auto auto;

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    // Setters

    public void setNombre(String nombre) throws Exception {
        boolean esNombreValido = validaString(nombre);
        if (esNombreValido) {
            this.nombre = nombre;
        }else {
            throw new Exception("Nombre inválido");
        }
    }

    public void setApellido(String apellido) throws Exception {
        boolean esApellidoValido = validaString(apellido);

        if (esApellidoValido) {
            this.apellido = apellido;
        } else {
            throw new Exception("Apellido inválido");
        }

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    // Constructores

    public Persona(String nombre, String apellido, int edad, int dni) throws Exception {
        boolean esNombreValido = validaString(nombre);
        boolean esApellidoValido = validaString(apellido);

        if (esNombreValido && esApellidoValido) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.dni = dni;

        } else {
            throw new Exception("Nombre o Apellido inválido");
        }
    }

    public Persona(int dni) throws Exception {
        if (dni == 12345678) {
            this.dni = dni;
            this.nombre = "Fulano";
            this.apellido = "Mengano";
            this.edad = 18;
        } else {
            throw new Exception("DNI INVÁLIDO");
        }
    }


    // Validadores
    private boolean validaString(String var) {
        return var != null && !var.isEmpty();
    }
}
