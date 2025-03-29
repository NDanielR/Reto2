package emergencia.inter.imple;

import java.util.Scanner;

import emergencia.inter.InEmergencia;

public class AccidenteTransito implements InEmergencia{

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    //private String nivelGravedad;

    public AccidenteTransito() {
       Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese la ubicacion del Acidente de transito: ");
        this.ubicacion = scn.nextLine();
        System.out.println("Ingrese la descripcion del Accidente de transito: ");
        this.descripcion = scn.nextLine(); 
        System.out.println("Hay personas atrapadas en el Accidente: ");
        this.personasAtrapadas = scn.nextBoolean();
        System.out.println("Hay personas heridas en el Accidente: ");
        this.personasHeridas = scn.nextBoolean();
        System.out.println("Hay personas fallecidas en el Accidente: ");
        this.personasFallecidas = scn.nextBoolean();
        scn.close();
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
}
