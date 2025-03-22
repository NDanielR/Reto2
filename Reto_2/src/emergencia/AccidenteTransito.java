package emergencia;

public class AccidenteTransito extends Emergencia{

    public AccidenteTransito (TipoEmergencia tipo,String ubicacion, String nivelGravedad, String tiempoRespuesta) {

        super (tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }
}
