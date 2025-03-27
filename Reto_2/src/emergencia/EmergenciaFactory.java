package emergencia;

import emergencia.inter.InEmergencia;
import emergencia.inter.imple.AccidenteTransito;
import emergencia.inter.imple.Incendio;
import emergencia.inter.imple.Robo;
import emergencia.inter.imple.TipoEmergencia;

public class EmergenciaFactory {

    public static InEmergencia crearEmergencia(TipoEmergencia tipo) {
        switch (tipo) {
            case Incendio:
                return new Incendio();
            case Robo:
                return new Robo();
            case Accidente_Transito:
                return new AccidenteTransito();
            default:
                throw new IllegalArgumentException("Tipo de emergencia no válido");
        }
    }
}
