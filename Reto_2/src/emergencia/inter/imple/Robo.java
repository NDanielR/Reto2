package emergencia.inter.imple;

import java.util.Scanner;

import emergencia.inter.InEmergencia;
import util.ScannerSingleton;

public class Robo implements InEmergencia {

    private String descripcion;
    private String ubicacion;
    private boolean atracoArmaFuego;
    private boolean atracoArmaBlanca;
    private boolean atracoViolento;
    private boolean personasHeridas;
    private boolean personasFallecidas;
    //private String nivelGravedad;

    public Robo() {
        Scanner scn = ScannerSingleton.getInstance();
        System.out.println("Ingrese la ubicacion del Robo: ");
        System.out.println("Ingrese la descripcion del Robo: ");
        System.out.println("El robo fue con arma de fuego: ");
        this.atracoArmaFuego = scn.nextBoolean();
        System.out.println("El robo fue con arma blanca: ");
        this.atracoArmaBlanca = scn.nextBoolean();
        System.out.println("El robo fue violento: ");
        this.atracoViolento = scn.nextBoolean();
        System.out.println("Hay personas heridas en el robo: ");
        this.personasHeridas = scn.nextBoolean();
        System.out.println("Hay personas fallecidas en el robo: ");
        this.personasFallecidas = scn.nextBoolean();

    }

    @Override
    public void registrarEmergencia() {
        
    }

    public void verDatosEmergencia(){
        System.out.println("Atendiendo robo: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Robo con arma de fuego: " + atracoArmaFuego);
        System.out.println("Robo con arma blanca: " + atracoArmaBlanca);
        System.out.println("Robo violento: " + atracoViolento);
        System.out.println("Personas heridas: " + personasHeridas);
        System.out.println("Personas fallecidas: " + personasFallecidas);
    }
}
