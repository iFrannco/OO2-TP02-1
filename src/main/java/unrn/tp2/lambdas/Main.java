package unrn.tp2.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AprendiendoLambdas a = new AprendiendoLambdas();

        // Se invoca al segundo metodo: public void unMetodo(B b).
        // Porque recibe un String y no retorna nada (osea un consumer)
        // b deberia ser un String al invocar al metodo.
        a.unMetodo((b) -> {
            System.out.println("abcd" + b);
        });

        // Se invoca al primer metodo: public void unMetodo(A a).
        // Ya que no recibe nada ni retorna nada. Un runnable?
        a.unMetodo(() -> System.out.println("abcd"));

        // Se invoca el segundo metodo: public void unMetodo(B b).
        // Porque recibe algo y no retorna nada. "variable" tiene que ser de tipo String.
        a.unMetodo((variable) -> {
            System.out.println("abcd");
        });

        // Se invoca al tercer metodo: public void unMetodo(C c).
        // Ya que acepta un valor y retorna un booleano (igual a un predicate).
        // Aunque no haria falta indicar el tipo de la variable. Y siempre retorna true.
        a.unMetodo((String variable) -> {
            System.out.println("abcd");
            return true;
        });

        // Se invoca el ultimo metodo: public void unMetodo(D d).
        // Ya que recibe un long y retorna un long (Igual que una function).
        a.unMetodo((Long variable) -> {
            System.out.println("abcd");
            return 10L;
        });

        // Punto 2:
        System.out.println("\nPUNTO 2:");
        a.otroMetodo((n) -> n.length() % 2 == 0);
        a.otroMetodo((m) -> {
            return Character.isUpperCase(m.charAt(0));
        });

        // Punto 3:
        System.out.println("\nPUNTO 3:");
        Filtro filtro = new Filtro();
        List<Persona> miLista = new ArrayList<>();
        Persona p1 = new Persona("matias", "mansilla");
        Persona p2 = new Persona("damian", "gasparini");
        Persona p3 = new Persona("dylan", "relmo");
        miLista.add(p1);
        miLista.add(p2);
        miLista.add(p3);

        List<Persona> resultado = filtro.filtrar(miLista, (persona) -> persona.nombreComienzaCon('d'));
        List<Persona> resultado2 = filtro.filtrar(resultado, Persona::nombreEsPar);

        resultado2.stream().map(Persona::nombre).forEach(System.out::println);
    }
}