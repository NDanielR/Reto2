package util;
import java.util.List;
import java.util.Scanner;

import emergencia.EmergenciaFactory;
import emergencia.inter.InEmergencia;
import emergencia.inter.imple.TipoEmergencia;

public class Menu {

    public static Config MenuConfiguracion() {
        return Config.getInstancia();
    }

    public static void MenuPrincipal() {

        Scanner scn = ScannerSingleton.getInstance();
        int opcion = 0;
        while (true) {
            limpiarConsola();
            System.out.println("Bienvenidos al Sistema de Emergencias");
            System.out.println("Seleccione la opcion que desea usar:");
            System.out.println("1. Registrar emergencia");
            System.out.println("2. Ver lista de emergencias");
            System.out.println("3. Ver estado de recursos disponibles");
            System.out.println("4. Atender una emergencia");
            System.out.println("5. Mostrar estadisticas de atencion");

            try {
                opcion = Integer.parseInt(scn.nextLine());

                switch (opcion) {
                    case 1:
                        EmergenciaFactory.crearEmergencia(seleccionTipoEmergencia());
                        break;
                    case 2:
                        EmergenciaFactory.imprimirEmergenciasRegistradas();
                        break;
                    case 3:
                        Config.imprimirConfiguracion(Config.getInstancia());
                        break;
                    case 4:
                        seleccionEmergenciaAtender(EmergenciaFactory.getListaEmergenciasRegistradas());
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.\n");
                        esperarEnter();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número del 1 al 5.\n");
                esperarEnter();
            }
        }
    }

    private static TipoEmergencia seleccionTipoEmergencia() {
        Scanner scn = ScannerSingleton.getInstance();
        int opcion = 0;
        while (true) {
            limpiarConsola();
            System.out.println("Seleccione la emergencia que presenta:");
            System.out.println("1. Incendio");
            System.out.println("2. Robo");
            System.out.println("3. Accidente de tránsito");


            try {
                opcion = Integer.parseInt(scn.nextLine());


                switch (opcion) {
                    case 1:
                        return TipoEmergencia.Incendio;
                    case 2:
                        return TipoEmergencia.Robo;
                    case 3:
                        return TipoEmergencia.Accidente_Transito;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.\n");
                        esperarEnter();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número del 1 al 3.\n");
            }
            esperarEnter();
        }
    }

    private static void seleccionEmergenciaAtender(List<InEmergencia> listaEmergencias){

        Scanner scn = ScannerSingleton.getInstance();
        if (listaEmergencias == null || listaEmergencias.isEmpty()) {
            limpiarConsola();
            System.out.println("No hay emergencias registradas.");
            esperarEnter();
            return;
        }
        while (true) {
            EmergenciaFactory.imprimirEmergenciasRegistradas();
            System.out.println("Seleccione el numero de la emergencia que desea atender");
            try {
                int emergenciaSeleccionada = Integer.parseInt(scn.nextLine());
                if (emergenciaSeleccionada < 1 || emergenciaSeleccionada > listaEmergencias.size()) {
                    throw new IndexOutOfBoundsException();
                }
                InEmergencia emergencia = listaEmergencias.get(emergenciaSeleccionada - 1);
                // Aquí puedes trabajar con el objeto emergencia seleccionado
                System.out.println("Atendiendo emergencia seleccionada:");
                emergencia.verDatosEmergencia();
                esperarEnter();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número válido de la lista.");
                esperarEnter();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("La emergencia no existe. Seleccione una opción de la lista.");
                esperarEnter();
            }
        }
    }

    public static void limpiarConsola() {

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Si falla, simplemente no limpia la pantalla
        }

    }

    public static void esperarEnter() {
    System.out.println("Presione Enter para continuar...");
    Scanner scn = ScannerSingleton.getInstance();
    scn.nextLine();
}
}
