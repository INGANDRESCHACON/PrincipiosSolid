package org.example;

public class Usuario implements Inotificable {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }

    // Otros métodos y atributos de la clase Usuario...
}
