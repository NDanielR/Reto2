package emergencia;

import java.time.Duration;

import util.GravedadEmergencia;
import util.TipoEmergencia;


public class Emergencia  {
    private TipoEmergencia tipoEmergencia;
    private String ubicacionEmergencia;
    private GravedadEmergencia nivelDeGravedad;
    private Duration tiempoRespuesta;


    public TipoEmergencia getTipo() {
        return tipoEmergencia;
    }

    public String getUbicacion() {
        return ubicacionEmergencia;
    }

    public GravedadEmergencia getNivelDeGravedad() {
        return nivelDeGravedad;
    }

    public Duration getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTipo(TipoEmergencia tipo) {
        this.tipoEmergencia = tipo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacionEmergencia = ubicacion;
    }

    public void setNivelDeGravedad(GravedadEmergencia nivelDeGravedad) {
        this.nivelDeGravedad = nivelDeGravedad;
    }

    public void setTiempoRespuesta(Duration tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

}
