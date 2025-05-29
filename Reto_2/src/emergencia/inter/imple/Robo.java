package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class Robo extends Emergencia implements InEmergencia {

    private boolean atracoArmaFuego;
    private boolean atracoArmaBlanca;
    private boolean atracoViolento;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    // private String nivelGravedad;

    public Robo(String descripcion, String ubicacion, boolean atracoArmaFuego,
            boolean atracoArmaBlanca, boolean atracoViolento, boolean personasHeridas, boolean personasFallecidas) {
        super(ubicacion, descripcion);
        this.atracoArmaFuego = atracoArmaFuego;
        this.atracoArmaBlanca = atracoArmaBlanca;
        this.atracoViolento = atracoViolento;
        this.personasHeridas = personasHeridas;
        this.personasFallecidas = personasFallecidas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void verLista() {
        System.out.print("Atendiendo robo ");
        System.out.print("Ubicacion: " + super.getUbicacion());
        System.out.print(" Robo con arma de fuego: " + atracoArmaFuego);
        System.out.print(" Robo con arma blanca: " + atracoArmaBlanca);
        System.out.print(" Robo violento: " + atracoViolento);
        System.out.print(" Personas heridas: " + personasHeridas);
        System.out.print(" Personas fallecidas: " + personasFallecidas);

    }

    public void verDatosEmergencia() {
        System.out.println("Atendiendo robo: " + super.getDescripcion());
        System.out.println("Ubicacion: " + super.getUbicacion());
        System.out.println("Robo con arma de fuego: " + atracoArmaFuego);
        System.out.println("Robo con arma blanca: " + atracoArmaBlanca);
        System.out.println("Robo violento: " + atracoViolento);
        System.out.println("Personas heridas: " + personasHeridas);
        System.out.println("Personas fallecidas: " + personasFallecidas);
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
