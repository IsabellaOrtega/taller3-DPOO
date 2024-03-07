package uniandes.dpoo.aerolinea.tiquetes;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	//atributos
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente clienteComprador;

	
	//constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
	}
	
	public Cliente getCliente() {
		return clienteComprador;
		
	}

	public Vuelo getVuelo() {
		return vuelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void marcarComoUsado() {
		this.usado = true;
	}
	public boolean esUsado() {
		return usado;
		
	}
}
