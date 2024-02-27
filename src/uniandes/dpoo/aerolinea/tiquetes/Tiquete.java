package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	//atributos
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	//constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.tarifa = tarifa;
	}
	
	public Cliente getCliente() {
		return null;
		
	}

	public Vuelo getVuelo() {
		return null;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void marcarComoUsado() {
		
	}
	public boolean esUsado() {
		return usado;
		
	}
}
