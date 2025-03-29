import emergencia.inter.imple.TipoEmergencia;

import java.util.Scanner;

public class Menu {

    public static Config MenuConfiguracion (){
        Scanner scn = new Scanner(System.in);
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
        scn.close();
        return Config.getInstancia(vPolicia,nPolicias,vAmbulancias,nParamedicos,vBomberos,nBomberos);
    }

    public void MenuPrincipal (){
        System.out.println("Bienvenidos al Sistema de Emergencias");
        System.out.println("Seleccione la emergencia que presenta:");
        System.out.println("1. Incendio");
        System.out.println("2. Robo");
        System.out.println("3. accidente de transito");
    }

    public static TipoEmergencia SeleccionEmergencia() {
        Scanner scn = new Scanner(System.in);
        int opcion = 0;
        try{
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
        }finally {
            scn.close(); 
        }   
    }
    
}
