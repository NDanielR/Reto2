package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class AccidenteTransito extends Emergencia implements InEmergencia {

    private boolean personasAtrapadas;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    // private String nivelGravedad;

    public AccidenteTransito(String ubicacion, String descripcion, boolean personasAtrapadas,
            boolean personasHeridas, boolean personasFallecidas) {
        super(ubicacion, descripcion);
        this.personasAtrapadas = personasAtrapadas;
        this.personasHeridas = personasHeridas;
        this.personasFallecidas = personasFallecidas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void verLista() {
        System.out.println("Atendiendo Accidente de transito: " + super.getDescripcion());
        System.out.println("Ubicacion" + super.getUbicacion());
        System.out.println("Personas atrapadas: " + personasAtrapadas);
        System.out.println("Personas heridas: " + personasHeridas);
        System.out.println("Personas fallecidas: " + personasFallecidas);

    }

    @Override
    public void verDatosEmergencia() {
        System.out.print("Atendiendo Accidente de transito ");
        System.out.print("Ubicacion" + super.getUbicacion());
        System.out.print(" Personas atrapadas: " + personasAtrapadas);
        System.out.print(" Personas heridas: " + personasHeridas);
        System.out.print(" Personas fallecidas: " + personasFallecidas);
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
