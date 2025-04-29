package emergencia.inter.imple;

import java.util.Scanner;

import emergencia.Emergencia;
import emergencia.inter.InEmergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class Incendio implements InEmergencia, IObserver{

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;

    @Override
    public void registrarEmergencia() {
      
    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo incendio: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Personas atrapadas: " + personasAtrapadas);
    }

    @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Incendio){
            System.out.println("Bomberos notificados: " + message);
        }
    }
}
