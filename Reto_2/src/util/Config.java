import java.util.Scanner;

import util.ScannerSingleton;

public class Config {

    //instancia de configuracion
    private static Config configuracion;

    //atributos de la configuracion
    private int vehiculosPolicia;
    private int vehiculosAmbulancias;
    private int vehiculosBomberos;
    private int numeroPolicias;
    private int numeroParamedico;
    private int numeroBomberos;

    private Config(){
        inicializarConfiguracion();
    }

    public void inicializarConfiguracion() {
        Scanner scn = ScannerSingleton.getInstance();
        System.out.println("Bienvenido al menu de configuracion");
        System.out.println("Debemos agregar la configuracion");
        System.out.println("inicial del programa.");
        System.out.println("ingresa el numero de vehiculos policiales:");
        this.vehiculosPolicia = scn.nextInt();
        System.out.println("ingrese el numero de agentes de policia:");
        this.numeroPolicias = scn.nextInt();
        System.out.println("ingresar el numero de vehiculos de ambulancias:");
        this.vehiculosAmbulancias = scn.nextInt();
        System.out.println("ingresa el numero de paramedico:");
        this.numeroParamedico = scn.nextInt();
        System.out.println("ingresa en numero de maquinas de bomberos:");
        this.vehiculosBomberos = scn.nextInt();
        System.out.println("ingresa el numero de bomberos:");
        this.numeroBomberos = scn.nextInt();
    }

    //metodo static para agregar la config de inicio
    public static Config getInstancia() {
        if (configuracion == null) {
            configuracion = new Config();
        }   
        return configuracion;
    }

    public static void imprimirConfiguracion(Config config) {
        System.out.println("----- CONFIGURACIÓN ACTUAL -----");
        System.out.println("Vehículos de Policía     : " + config.getVehiculosPolicia());
        System.out.println("Vehículos de Ambulancias : " + config.getVehiculosAmbulancias());
        System.out.println("Vehículos de Bomberos    : " + config.getVehiculosBomberos());
        System.out.println("Número de Policías       : " + config.getNumeroPolicias());
        System.out.println("Número de Paramédicos    : " + config.getNumeroParamedico());
        System.out.println("Número de Bomberos       : " + config.getNumeroBomberos());
        System.out.println("--------------------------------");
    }

    public int getVehiculosPolicia() {
        return vehiculosPolicia;
    }

    public void setVehiculosPolicia(int vehiculosPolicia) {
        this.vehiculosPolicia = vehiculosPolicia;
    }
    
    public int getVehiculosAmbulancias() {
        return vehiculosAmbulancias;
    }

    public void setVehiculosAmbulancias(int vehiculosAmbulancias) {
        this.vehiculosAmbulancias = vehiculosAmbulancias;
    }

    public int getVehiculosBomberos() {
        return vehiculosBomberos;
    }

    public void setVehiculosBomberos(int vehiculosBomberos) {
        this.vehiculosBomberos = vehiculosBomberos;
    }

    public int getNumeroPolicias() {
        return numeroPolicias;
    }

    public void setNumeroPolicias(int numeroPolicias) {
        this.numeroPolicias = numeroPolicias;
    }

    public int getNumeroParamedico() {
        return numeroParamedico;
    }

    public void setNumeroParamedico(int numeroParamedico) {
        this.numeroParamedico = numeroParamedico;
    }

    public int getNumeroBomberos() {
        return numeroBomberos;
    }

    public void setNumeroBomberos(int numeroBomberos) {
        this.numeroBomberos = numeroBomberos;
    }
}



