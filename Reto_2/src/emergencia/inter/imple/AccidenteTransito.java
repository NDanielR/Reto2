package emergencia.inter.imple;

import emergencia.Emergencia;
import emergencia.inter.InEmergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class AccidenteTransito extends Emergencia implements InEmergencia, IObserver{

    private String descripcion;
    private boolean personasAtrapadas;
    private boolean personasHeridas;
    private boolean personasFallecidas;

    @Override
    public void registrarEmergencia() {
       
    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo Accidente de transito: " + descripcion);
        System.out.println("Ubicacion: " + getUbicacion());
        System.out.println(personasAtrapadas ? "Hay personas atrapadas" : "No hay personas atrapadas");
        System.out.println(personasHeridas ? "Hay personas heridas" : "No hay personas heridas");
        System.out.println(personasFallecidas ? "Hay personas fallecidas" : "No hay personas fallecidas");
    }

    @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Accidente_Transito){
            System.out.println("Ambulancia notificada: " + message);
        }
    }

   
}
