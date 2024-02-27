package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo{
	//atributos 
	private String fecha;
	
	//constructor
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.fecha= fecha;
	}
	
	//funciones
	public Ruta getRuta() {
		return null;
	}
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return null;
	}
	public Collection<Tiquete> getTiquetes(){
		return null;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadores, int cantidad) {
		return 1;
	}
	public boolean equals(Object obj) {
		return true;
	}
}