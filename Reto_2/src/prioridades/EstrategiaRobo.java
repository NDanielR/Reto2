package prioridades;

import util.Config;

public class EstrategiaRobo implements IEstrategia {

    @Override
    public void prioridadAlta() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("robo grave");
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias()-10);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia()-4);
        System.out.println("se han solicitado 10 policías y 4 patrullas para atender el robo grave");
    }

    @Override
    public void prioridadMedia() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("robo medio");
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias()-5);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia()-2);
        System.out.println("se han solicitado 5 policías y 2 patrullas para atender el robo medio");
    }

    @Override
    public void prioridadBaja() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("robo leve");
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias()-2);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia()-1);
        System.out.println("se han solicitado 2 policías y 1 patrulla para atender el robo leve");
    }
}
