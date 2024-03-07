package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	//atributos
	public String NATURAL = "Natural";
	private String nombre;
	
	// contructor 
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//funciones
	public String getIdentificador() {
		return super.getIdentificador();
		
	}
	public String getTipoCliente() {
		return NATURAL; 
	}
}
