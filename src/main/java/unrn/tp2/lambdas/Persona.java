package unrn.tp2.lambdas;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    public boolean nombreComienzaCon(char c) {
        return c == this.nombre.charAt(0);
    }

    public boolean nombreEsPar() {
        return this.nombre.length() % 2 == 0;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }
}

