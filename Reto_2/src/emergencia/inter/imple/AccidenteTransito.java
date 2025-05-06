package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class AccidenteTransito implements InEmergencia {

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    // private String nivelGravedad;

    public AccidenteTransito(String ubicacion, String descripcion, boolean personasAtrapadas,
            boolean personasHeridas, boolean personasFallecidas) {
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.personasAtrapadas = personasAtrapadas;
        this.personasHeridas = personasHeridas;
        this.personasFallecidas = personasFallecidas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void registrarEmergencia() {

    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo Accidente de transito: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Personas atrapadas: " + personasAtrapadas);
        System.out.println("Personas heridas: " + personasHeridas);
        System.out.println("Personas fallecidas: " + personasFallecidas);
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

    public boolean isPersonasHeridas() {
        return personasHeridas;
    }

    public void setPersonasHeridas(boolean personasHeridas) {
        this.personasHeridas = personasHeridas;
    }

    public boolean isPersonasFallecidas() {
        return personasFallecidas;
    }

    public void setPersonasFallecidas(boolean personasFallecidas) {
        this.personasFallecidas = personasFallecidas;
    }
}
