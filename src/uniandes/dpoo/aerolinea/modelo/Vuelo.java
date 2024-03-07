package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo{
	//atributos 
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Collection<Tiquete> tiquetes;
	
	//constructor
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.fecha= fecha;
		this.ruta = ruta;
		this.avion = avion;
		
	}
	
	//funciones
	public Ruta getRuta() {
		return ruta;
	}
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Collection<Tiquete> getTiquetes(){
		return tiquetes;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadores, int cantidad) {
		return 1;
	}
	public boolean equals(Object obj) {
		return true;
	}
}