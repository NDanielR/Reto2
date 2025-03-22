package emergencia;

public class Incendio extends Emergencia {

    public Incendio (TipoEmergencia tipo,String ubicacion, String nivelGravedad, String tiempoRespuesta) {

        super (tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }
}
