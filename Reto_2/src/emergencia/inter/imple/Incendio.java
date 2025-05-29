package emergencia.inter.imple;

import emergencia.inter.InEmergencia;

public class Incendio extends Emergencia implements InEmergencia {

    private boolean personasAtrapadas;
   // private String nivelGravedad;

    public Incendio(String ubicacion, String descripcion, boolean personasAtrapadas) {
        super(ubicacion, descripcion);
        this.personasAtrapadas = personasAtrapadas;
        // this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void verLista() {
        System.out.print("Atendiendo incendio ");
        System.out.print("Ubicacion: " + super.getUbicacion());
        System.out.print(" Personas atrapadas: " + personasAtrapadas);
    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo incendio: " + super.getDescripcion());
        System.out.println("Ubicacion: " + super.getUbicacion());
        System.out.println("Personas atrapadas: " + personasAtrapadas);
    }

    public boolean isPersonasAtrapadas() {
        return personasAtrapadas;
    }

    public void setPersonasAtrapadas(boolean personasAtrapadas) {
        this.personasAtrapadas = personasAtrapadas;
    }
}
