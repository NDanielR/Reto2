package prioridades;

import emergencia.*;

public class EmergenciaContexto {
    
    private IEstrategia estrategia;
    private EmergenciaFactory emergencia;
	
	public EmergenciaContexto(IEstrategia estrategia, EmergenciaFactory emergencia) {
		this.estrategia = estrategia;
        this.emergencia = emergencia;
	}
	
	public void prioridadAlta () {
		this.estrategia.prioridadAlta();
    }

	public void prioridadMedia(){
		this.estrategia.prioridadMedia();
	}

    public void prioridadBaja(){
		this.estrategia.prioridadBaja();
	}
}
