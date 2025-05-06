package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class Incendio implements InEmergencia {

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;
   // private String nivelGravedad;

    public Incendio(String ubicacion, String descripcion, boolean personasAtrapadas) {
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.personasAtrapadas = personasAtrapadas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void registrarEmergencia() {
      
    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo incendio: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Personas atrapadas: " + personasAtrapadas);
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPersonasAtrapadas() {
        return personasAtrapadas;
    }

    public void setPersonasAtrapadas(boolean personasAtrapadas) {
        this.personasAtrapadas = personasAtrapadas;
    }
}
