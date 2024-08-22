package org.example;
import java.util.Iterator;
import java.util.Vector;



public class Configuracion {
    Vector<IRecursoCargable> recursosCargables = new Vector<>();
    Vector<IRecursoGuardable> recursosGuardables = new Vector<>();

    public void cargarConfiguracion() {
        recursosCargables.add(new ConfiguracionSistema());
        recursosCargables.add(new ConfiguracionUsuario());
        recursosCargables.add(new ConfiguracionHoraria());

        for (Iterator<IRecursoCargable> i = recursosCargables.iterator(); i.hasNext(); )
            i.next().load();
    }

    public void salvarConfiguracion() {
        recursosGuardables.add(new ConfiguracionSistema());
        recursosGuardables.add(new ConfiguracionUsuario());

        for (Iterator<IRecursoGuardable> i = recursosGuardables.iterator(); i.hasNext(); )
            i.next().save();
    }

    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
        Usuario usuario = new Usuario("Juan");
        usuario.notificar("Tienes un nuevo mensaje.");
    }
}
