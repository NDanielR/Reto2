package emergencia.inter.imple;

import java.time.Duration;

import emergencia.Emergencia;
import emergencia.inter.InEmergencia;
import util.GravedadEmergencia;
import util.TipoEmergencia;

public class AccidenteTransito extends Emergencia implements InEmergencia{

    private String descripcion;
    private boolean personasAtrapadas;
    private boolean personasHeridas;
    private boolean personasFallecidas;

    public AccidenteTransito(TipoEmergencia tipoEmergencia, String ubicacion, GravedadEmergencia nivelDeGravedad, Duration tiempoRespuesta, String descripcion, boolean personasAtrapadas, boolean personasHeridas, boolean personasFallecidas) {
     super(tipoEmergencia, ubicacion, nivelDeGravedad, tiempoRespuesta);
     this.descripcion = descripcion;
     this.personasAtrapadas = personasAtrapadas;
     this.personasHeridas = personasHeridas;
     this.personasFallecidas = personasFallecidas;
    }

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
}
