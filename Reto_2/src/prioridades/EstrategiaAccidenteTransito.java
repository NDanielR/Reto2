package prioridades;

import util.Config;

public class EstrategiaAccidenteTransito implements IEstrategia {

    @Override
    public void prioridadAlta() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("Accidente de tránsito grave");
        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias() - 3);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia() - 1);
        solicitarUnidades.setVehiculosBomberos(solicitarUnidades.getVehiculosBomberos() - 1);
        solicitarUnidades.setNumeroBomberos(solicitarUnidades.getNumeroBomberos() - 6);
        }

    @Override
    public void prioridadMedia() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("Accidente de tránsito medio");


        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias() - 3);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia() - 1);
        solicitarUnidades.setVehiculosBomberos(solicitarUnidades.getVehiculosBomberos() - 1);
        solicitarUnidades.setNumeroBomberos(solicitarUnidades.getNumeroBomberos() - 6);
    }

    @Override
    public void prioridadBaja() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("Accidente de tránsito leve");

      

        solicitarUnidades.setNumeroPolicias(solicitarUnidades.getNumeroPolicias() - 1);
        solicitarUnidades.setVehiculosPolicia(solicitarUnidades.getVehiculosPolicia() - 1);
    }
}
