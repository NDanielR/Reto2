package prioridades;

import util.Config;

public class EstrategiaAccidenteTransito implements IEstrategia {

    @Override
    public void prioridadAlta() {
        Config solicitarUnidades = Config.getInstancia();
        System.out.println("accidente de transito grave ");
        solicitarUnidades.setNumeroParamedico(solicitarUnidades.getNumeroParamedico()-9);
        System.out.println("se han solicitado 9 paramedicos para atender el accidente de transito grave");  
        solicitarUnidades.setVehiculosAmbulancias(solicitarUnidades.getVehiculosAmbulancias()-3);
        System.out.println("se han solicitado 3 ambulancias para atender el accidente de transito grave");
    }

    @Override
    public void prioridadMedia() {
        System.out.println("accidente de transito medio");
        
    }

    @Override
    public void prioridadBaja() {
       System.out.println("accidente de transito suave");
        
    }
}
