package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private List<Tiquete> tiquetesUsados;
	private List<Tiquete> tiquetesSinUsar;
	
	//constructor
	public Cliente() {
		
		tiquetesUsados = new LinkedList<Tiquete>();
		tiquetesSinUsar = new LinkedList<Tiquete>();
		
	}
	
	public String getTipoCliente() {
		return null;
		
	}
	
	public String getIdentificador() {
		
		int numero = ( int ) ( Math.random( ) * 10e7 );
        String id = "" + numero;
        

        while( id.length( ) < 7 )
            id = "0" + id;

        return id;
	}
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		return 0;
		
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
	}

}
