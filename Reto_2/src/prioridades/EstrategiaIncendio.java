package prioridades;

import util.Config;

public class EstrategiaIncendio implements IEstrategia {

    @Override
    public void prioridadAlta() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("incendio grave");
        solicitarUnidades.setNumeroBomberos(solicitarUnidades.getNumeroBomberos()-15);
        solicitarUnidades.setVehiculosBomberos(solicitarUnidades.getVehiculosBomberos()-5);
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias()-4);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia()-2);
        System.out.println("se han solicitado 15 bomberos y 5 camiones de bomberos para atender el incendio grave");
    }

    @Override
    public void prioridadMedia() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("incendio medio");
        solicitarUnidades.setNumeroBomberos(solicitarUnidades.getNumeroBomberos()-8);
        solicitarUnidades.setVehiculosBomberos(solicitarUnidades.getVehiculosBomberos()-3);
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias()-2);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia()-1);
        System.out.println("se han solicitado 8 bomberos y 3 camiones de bomberos para atender el incendio medio");
    }

    @Override
    public void prioridadBaja() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("incendio leve");
        solicitarUnidades.setNumeroBomberos(solicitarUnidades.getNumeroBomberos()-3);
        solicitarUnidades.setVehiculosBomberos(solicitarUnidades.getVehiculosBomberos()-1);
        System.out.println("se han solicitado 3 bomberos y 1 camión de bomberos para atender el incendio leve");
    }
}
