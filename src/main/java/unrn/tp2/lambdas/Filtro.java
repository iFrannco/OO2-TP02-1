package unrn.tp2.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {
/*
    public List<Persona> nombresQueEmpiezanConE(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().startsWith("E")) {
                resultado.add(persona);
            }
        }
        return resultado;
    }

    public List<Persona> nombresCuyaCantidadDeLetrasEsPar(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().length() % 2 == 0) {
                resultado.add(persona);
            }
        }
        return resultado;
    }*/

    public List<Persona> filtrar(List<Persona> listaPersonas, Predicate<Persona> p) {
        // Implementacion con un bucle for
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : listaPersonas) {
            if (p.test(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
