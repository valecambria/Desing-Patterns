package org.patrones.observer.ejemplos;

import org.patrones.observer.UsuarioRepositorio;

public class EjemploObservers2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviando un mail al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un mail al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario " + u + " en el logs"));
        repo.crearUsuario("Andres");
    }
}
