package emergencia;

import java.time.Duration;

import util.GravedadEmergencia;
import util.TipoEmergencia;

public class Emergencia {
    TipoEmergencia tipo;
    String ubicacion;
    GravedadEmergencia nivelDeGravedad;
    Duration tiempoRespuesta;

    public Emergencia(TipoEmergencia tipoEmergencia, String ubicacion, GravedadEmergencia nivelDeGravedad, Duration tiempoRespuesta){
        this.tipo = tipoEmergencia;
        this.ubicacion = ubicacion;
        this.nivelDeGravedad = nivelDeGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public TipoEmergencia getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public GravedadEmergencia getNivelDeGravedad() {
        return nivelDeGravedad;
    }

    public Duration getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    
    
}
