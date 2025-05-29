package util;
import java.util.List;
import java.util.ArrayList;
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
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número del 1 al 5.\n");
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

        int numeroEmergencia = 1;

          if (listaEmergencias.isEmpty()) {
            limpiarConsola();
            System.out.println("No hay emergencias registradas.");
            System.out.println("-----------------------------");
            System.out.println("");
            esperarEnter();
        } else {
            limpiarConsola();
            System.out.println("Selecciona la emergencia que requiere atender");
            for (InEmergencia emergencia : listaEmergencias) {
                System.out.print(numeroEmergencia);
                emergencia.verLista();
                System.out.println("-----------------------------");
                numeroEmergencia++;
            }
            esperarEnter();
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
