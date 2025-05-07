package prioridades;

public class EmergenciaContexto {
    
    private IEstrategia estrategia;
	
	public EmergenciaContexto(IEstrategia estrategia) {
		this.estrategia = estrategia;
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
