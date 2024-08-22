package org.example;

public class ConfiguracionUsuario implements IRecursoGuardable, Inotificable {

    @Override
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}
