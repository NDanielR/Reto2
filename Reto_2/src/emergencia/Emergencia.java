package emergencia;

public class Emergencia {

    private TipoEmergencia tipo;
    private String ubicacion;
    private String nivelGravedad;
    private String tiempoRespuesta;

    public Emergencia (TipoEmergencia tipo,String ubicacion, String nivelGravedad, String tiempoRespuesta){

        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
        
    }
}
