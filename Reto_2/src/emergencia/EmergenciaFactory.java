package emergencia;

import java.time.Duration;

import emergencia.inter.InEmergencia;
import emergencia.inter.imple.AccidenteTransito;
import emergencia.inter.imple.Incendio;
import emergencia.inter.imple.Robo;
import util.GravedadEmergencia;
import util.TipoEmergencia;

public class EmergenciaFactory {

    public static InEmergencia crearEmergencia(TipoEmergencia tipo, Object... args) {
        switch (tipo) {
            case Incendio:
                return new Incendio();
            case Robo:
                return new Robo();
            case Accidente_Transito:
                return new AccidenteTransito((TipoEmergencia) args[0], (String) args[1], (GravedadEmergencia) args[2], (Duration) args[3], (String) args[4], (boolean) args[5], (boolean) args[6], (boolean) args[7]);
            default:
                throw new IllegalArgumentException("Tipo de emergencia no válido");
        }
    }
}
