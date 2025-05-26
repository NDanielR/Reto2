package emergencia.inter.imple;

public class Emergencia {

    private String ubicacion;
    private String descripcion;

    public Emergencia(String ubicacion, String descripcion){

        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }   
}
