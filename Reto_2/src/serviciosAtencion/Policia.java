package serviciosAtencion;

import emergencia.Emergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class Policia implements IObserver {

   @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Robo){
            System.out.println("Policia notificada: " + message);
        }
    }


}
