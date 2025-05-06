package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class Robo implements InEmergencia {

    private String descripcion;
    private String ubicacion;
    private boolean atracoArmaFuego;
    private boolean atracoArmaBlanca;
    private boolean atracoViolento;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    // private String nivelGravedad;

    public Robo(String descripcion, String ubicacion, boolean atracoArmaFuego,
            boolean atracoArmaBlanca, boolean atracoViolento, boolean personasHeridas, boolean personasFallecidas) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.atracoArmaFuego = atracoArmaFuego;
        this.atracoArmaBlanca = atracoArmaBlanca;
        this.atracoViolento = atracoViolento;
        this.personasHeridas = personasHeridas;
        this.personasFallecidas = personasFallecidas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void registrarEmergencia() {

    }

    public void verDatosEmergencia() {
        System.out.println("Atendiendo robo: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Robo con arma de fuego: " + atracoArmaFuego);
        System.out.println("Robo con arma blanca: " + atracoArmaBlanca);
        System.out.println("Robo violento: " + atracoViolento);
        System.out.println("Personas heridas: " + personasHeridas);
        System.out.println("Personas fallecidas: " + personasFallecidas);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAtracoArmaFuego() {
        return atracoArmaFuego;
    }

    public void setAtracoArmaFuego(boolean atracoArmaFuego) {
        this.atracoArmaFuego = atracoArmaFuego;
    }

    public boolean isAtracoArmaBlanca() {
        return atracoArmaBlanca;
    }

    public void setAtracoArmaBlanca(boolean atracoArmaBlanca) {
        this.atracoArmaBlanca = atracoArmaBlanca;
    }

    public boolean isAtracoViolento() {
        return atracoViolento;
    }

    public void setAtracoViolento(boolean atracoViolento) {
        this.atracoViolento = atracoViolento;
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
