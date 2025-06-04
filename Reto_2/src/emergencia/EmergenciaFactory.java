package emergencia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import emergencia.inter.InEmergencia;
import emergencia.inter.imple.AccidenteTransito;
import emergencia.inter.imple.Incendio;
import emergencia.inter.imple.Robo;
import emergencia.inter.imple.TipoEmergencia;
import util.Menu;
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
                break;

            default:
                throw new IllegalArgumentException("Tipo de emergencia no válido");
                
        }

        System.out.println("Emergencia registrada");
        listaEmergenciasRegistradas.add(emergencia);
        Menu.esperarEnter();
        Menu.limpiarConsola();  
        return emergencia;

    }

    private static Incendio crearIncendio(Scanner scn) {
        Menu.limpiarConsola();
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

        boolean atracoArmaFuego = false;
        boolean atracoArmaBlanca = false;
        boolean atracoViolento = false;
        boolean personasHeridas = false;
        boolean personasFallecidas = false;

        atracoArmaFuego = leerBooleanConExcepcion(scn, "El robo fue con arma de fuego (true/false): ");
        atracoArmaBlanca = leerBooleanConExcepcion(scn, "El robo fue con arma blanca (true/false): ");
        atracoViolento = leerBooleanConExcepcion(scn, "El robo fue violento (true/false): ");
        personasHeridas = leerBooleanConExcepcion(scn, "Hay personas heridas en el robo (true/false): ");
        personasFallecidas = leerBooleanConExcepcion(scn, "Hay personas fallecidas en el robo (true/false): ");

        return new Robo(ubicacionRobo, descripcionRobo, atracoArmaFuego, atracoArmaBlanca, atracoViolento,
                personasHeridas, personasFallecidas);
    }

    private static AccidenteTransito crearAccidenteTransito(Scanner scn) {
        System.out.println("Ingrese la ubicacion del Accidente de transito: ");
        String ubicacionAccidente = scn.nextLine();
        System.out.println("Ingrese la descripcion del Accidente de transito: ");
        String descripcionAccidente = scn.nextLine();

        boolean personasAtrapadasAccidente = leerBooleanConExcepcion(scn,
                "Hay personas atrapadas en el Accidente (true/false): ");
        boolean personasHeridasAccidente = leerBooleanConExcepcion(scn,
                "Hay personas heridas en el Accidente (true/false): ");
        boolean personasFallecidasAccidente = leerBooleanConExcepcion(scn,
                "Hay personas fallecidas en el Accidente (true/false): ");

        return new AccidenteTransito(ubicacionAccidente, descripcionAccidente, personasAtrapadasAccidente,
                personasHeridasAccidente, personasFallecidasAccidente);
    }

    public static void imprimirEmergenciasRegistradas() {

        Menu.limpiarConsola();
        int numeroEmergencia = 1;
        if (listaEmergenciasRegistradas.isEmpty()) {
            System.out.println("No hay emergencias registradas.");
            System.out.println("-----------------------------");
            System.out.println("");
        } else {
            System.out.println("Emergencias registradas:");
            System.out.println("-----------------------------");
            System.out.println("");
            for (InEmergencia emergencia : listaEmergenciasRegistradas) {
                System.out.println("Emergencia # " + numeroEmergencia);
                emergencia.verDatosEmergencia();
                System.out.println("-----------------------------");
                numeroEmergencia++;
            }
        }

        Menu.esperarEnter(); 
    }

    // Método auxiliar para leer booleanos con manejo de excepciones
    private static boolean leerBooleanConExcepcion(Scanner scn, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scn.nextLine().trim().toLowerCase();
            if (entrada.equals("true") || entrada.equals("si")) {
                return true;
            } else if (entrada.equals("false") || entrada.equals("no")) {
                return false;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese 'true/false' o 'si/no'.");
            }
        }
    }

    public static List<InEmergencia> getListaEmergenciasRegistradas() {
        return listaEmergenciasRegistradas;
    }
}
