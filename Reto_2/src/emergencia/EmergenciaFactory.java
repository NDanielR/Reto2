package emergencia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import emergencia.inter.InEmergencia;
import emergencia.inter.imple.AccidenteTransito;
import emergencia.inter.imple.Incendio;
import emergencia.inter.imple.Robo;
import emergencia.inter.imple.TipoEmergencia;
import util.ScannerSingleton;

public class EmergenciaFactory {

    private static List<InEmergencia> listaEmergenciasRegistradas = new ArrayList<>();

    public static InEmergencia crearEmergencia(TipoEmergencia tipo) {
        Scanner scn = ScannerSingleton.getInstance();
        InEmergencia emergencia;
        switch (tipo) {
            case Incendio:
                emergencia = crearIncendio(scn);
                break;

            case Robo:
                emergencia = crearRobo(scn);
                break;

            case Accidente_Transito:
                emergencia = crearAccidenteTransito(scn);

            default:
                throw new IllegalArgumentException("Tipo de emergencia no válido");
        }

        listaEmergenciasRegistradas.add(emergencia);
        return emergencia;
    
    }

    private static Incendio crearIncendio(Scanner scn) {
        System.out.println("Ingrese la ubicacion del incendio: ");
        String ubicacion = scn.nextLine();
        System.out.println("Ingrese la descripcion del incendio: ");
        String descripcion = scn.nextLine();
        boolean personasAtrapadasIncendio = false;

        while (true) {
            System.out.println("Hay personas atrapadas en el incendio (si/no): ");
            String entrada = scn.nextLine().toLowerCase().trim();
            if (entrada.equals("si")) {
                personasAtrapadasIncendio = true;
                break;
            } else if (entrada.equals("no")) {
                personasAtrapadasIncendio = false;
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
            }
        }
        return new Incendio(ubicacion, descripcion, personasAtrapadasIncendio);
    }

    private static Robo crearRobo(Scanner scn) {
        System.out.println("Ingrese la ubicacion del Robo: ");
        String ubicacionRobo = scn.nextLine();
        System.out.println("Ingrese la descripcion del Robo: ");
        String descripcionRobo = scn.nextLine();
        System.out.println("El robo fue con arma de fuego: ");
        boolean atracoArmaFuego = scn.nextBoolean();
        System.out.println("El robo fue con arma blanca: ");
        boolean atracoArmaBlanca = scn.nextBoolean();
        System.out.println("El robo fue violento: ");
        boolean atracoViolento = scn.nextBoolean();
        System.out.println("Hay personas heridas en el robo: ");
        boolean personasHeridas = scn.nextBoolean();
        System.out.println("Hay personas fallecidas en el robo: ");
        boolean personasFallecidas = scn.nextBoolean();
        return new Robo(ubicacionRobo, descripcionRobo, atracoArmaFuego, atracoArmaBlanca, atracoViolento, personasHeridas, personasFallecidas);
    }

    private static AccidenteTransito crearAccidenteTransito(Scanner scn) {
        System.out.println("Ingrese la ubicacion del Accidente de transito: ");
        String ubicacionAccidente = scn.nextLine();
        System.out.println("Ingrese la descripcion del Accidente de transito: ");
        String descripcionAccidente = scn.nextLine();
        System.out.println("Hay personas atrapadas en el Accidente: ");
        boolean personasAtrapadasAccidente = scn.nextBoolean();
        System.out.println("Hay personas heridas en el Accidente: ");
        boolean personasHeridasAccidente = scn.nextBoolean();
        System.out.println("Hay personas fallecidas en el Accidente: ");
        boolean personasFallecidasAccidente = scn.nextBoolean();
        return new AccidenteTransito(ubicacionAccidente, descripcionAccidente, personasAtrapadasAccidente, personasHeridasAccidente, personasFallecidasAccidente);
    }
    
       public static void imprimirEmergenciasRegistradas() {
        if (listaEmergenciasRegistradas.isEmpty()) {
            System.out.println("No hay emergencias registradas.");
        } else {
            System.out.println("Emergencias registradas:");
            for (InEmergencia emergencia : listaEmergenciasRegistradas) {
                emergencia.verDatosEmergencia();
                System.out.println("-----------------------------");
            }
        }
    }
}
