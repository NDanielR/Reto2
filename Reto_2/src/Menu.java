import emergencia.inter.imple.TipoEmergencia;

import java.util.Scanner;

import java.lang.System;
public class Menu {

    private static final Scanner scn = new Scanner(System.in); // Instancia única de Scanner

    public static Config MenuConfiguracion() {
        System.out.println("Bienvenido al menu de configuracion");
        System.out.println("Debemos agregar la configuracion");
        System.out.println("inicial del programa.");
        System.out.println("ingresa el numero de vehiculos policiales:");
        int vPolicia = scn.nextInt();
        System.out.println("ingrese el numero de agentes de policia:");
        int nPolicias = scn.nextInt();
        System.out.println("ingresar el numero de vehiculos de ambulancias:");
        int vAmbulancias = scn.nextInt();
        System.out.println("ingresa el numero de paramedico:");
        int nParamedicos = scn.nextInt();
        System.out.println("ingresa en numero de maquinas de bomberos:");
        int vBomberos = scn.nextInt();
        System.out.println("ingresa el numero de bomberos:");
        int nBomberos = scn.nextInt();
        return Config.getInstancia(vPolicia, nPolicias, vAmbulancias, nParamedicos, vBomberos, nBomberos);
    }

    public void MenuPrincipal (){
        System.out.println("Bienvenidos al Sistema de Emergencias");
        System.out.println("Seleccione la emergencia que presenta:");
        System.out.println("1. Incendio");
        System.out.println("2. Robo");
        System.out.println("3. accidente de transito");
    }

    private static TipoEmergencia SeleccionEmergencia() {
        int opcion = 0;

        while (true) {
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
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número del 1 al 3.\n");
            }
        }
    }

    public static void MenuRegistrarEmergencia() {
        System.out.println("Registro de nueva emergencia");
        TipoEmergencia tipo = SeleccionEmergencia();
        System.out.println("Ubicacion de la emergencia");
        String ubicacion = scn.nextLine();
        System.out.println("Nivel de gravedad");
        String nivelGravedad = scn.nextLine();
        System.out.println("Tiempo estimado de la atencion inicial");
        String tiempo = scn.nextLine();
    }

    // Llamar a scn.close() al final del programa
    public static void cerrarScanner() {
        scn.close();
    }
}
