package emergencia;

import java.util.Scanner;

import emergencia.inter.InEmergencia;
import emergencia.inter.imple.AccidenteTransito;
import emergencia.inter.imple.Incendio;
import emergencia.inter.imple.Robo;
import emergencia.inter.imple.TipoEmergencia;
import util.ScannerSingleton;

public class EmergenciaFactory {

    public static InEmergencia crearEmergencia(TipoEmergencia tipo) {
        switch (tipo) {
            case Incendio:
            Scanner scn = ScannerSingleton.getInstance();// new Scanner(System.in);
            System.out.println("Ingrese la ubicacion del incendio: ");
            String ubicacion = scn.nextLine();
            System.out.println("Ingrese la descripcion del incendio: ");
            String descripcion = scn.nextLine();
            boolean personasAtrapadas = false;
    
            while (true) {
                System.out.println("Hay personas atrapadas en el incendio (si/no): ");
                String entrada = scn.nextLine().toLowerCase().trim();
                if (entrada.equals("si")) {
                    personasAtrapadas = true;
                    break;
                } else if (entrada.equals("no")) {
                    personasAtrapadas = false;
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
                }
            }
            return new Incendio(ubicacion, descripcion, personasAtrapadas);

            case Robo:
                return new Robo();
            case Accidente_Transito:
                return new AccidenteTransito();
            default:
                throw new IllegalArgumentException("Tipo de emergencia no válido");
        }
    }

    public static Incendio crearEmergenciaIncendio() {
        Scanner scn = ScannerSingleton.getInstance();// new Scanner(System.in);
        System.out.println("Ingrese la ubicacion del incendio: ");
        String ubicacion = scn.nextLine();
        System.out.println("Ingrese la descripcion del incendio: ");
        String descripcion = scn.nextLine();
        boolean personasAtrapadas = false;

        while (true) {
            System.out.println("Hay personas atrapadas en el incendio (si/no): ");
            String entrada = scn.nextLine().toLowerCase().trim();
            if (entrada.equals("si")) {
                personasAtrapadas = true;
                break;
            } else if (entrada.equals("no")) {
                personasAtrapadas = false;
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
            }
        }
        return new Incendio(ubicacion, descripcion, personasAtrapadas);
    }
}
