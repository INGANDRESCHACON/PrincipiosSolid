package org.example;

public class ConfiguracionSistema implements IRecursoGuardable {
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }

    public void notificar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }

}
