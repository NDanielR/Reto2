package emergencia;

import java.util.ArrayList;

public class Emergencia {

    private TipoEmergencia tipo;
    private String ubicacion;
    private String nivelGravedad;
    private String tiempoRespuesta;
    private static ArrayList<Emergencia> listaEmergencias = new ArrayList<>();

    public Emergencia (TipoEmergencia tipo,String ubicacion, String nivelGravedad, String tiempoRespuesta){

        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
        listaEmergencias.add(new Emergencia(tipo, ubicacion, nivelGravedad, tiempoRespuesta));   
    }
    
    public static void ImprimirListaEmergencias() {
        if (listaEmergencias.isEmpty()) {
            System.out.println("No hay emergencias registradas.");
        } else {
            for (Emergencia emergencia : listaEmergencias) {
                System.out.println(emergencia);
            }
        }
    }
    
    public TipoEmergencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmergencia tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(String nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public String getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(String tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }


}
