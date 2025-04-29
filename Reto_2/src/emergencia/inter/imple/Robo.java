package emergencia.inter.imple;

import java.util.Scanner;

import emergencia.Emergencia;
import emergencia.inter.InEmergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class Robo implements InEmergencia, IObserver{

    private String descripcion;
    private String ubicacion;
    private boolean atracoArmaFuego;
    private boolean atracoArmaBlanca;
    private boolean atracoViolento;
    private boolean personasHeridas;
    private boolean personasFallecidas;

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

    @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Robo){
            System.out.println("Policía notificada: " + message);
        }
    }
}
