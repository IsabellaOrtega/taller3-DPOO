package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	//atr
	
	public double IMPUESTO= 0.28;
	
	//funciones
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	protected int calculadoraCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	protected double calculadoraPorcentajeDescuento(Cliente cliente) {
		return 0;
		
	}
	
	protected int calcularDistanciavuelo(Ruta ruta) {
		return 0;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return 0;
	}

}
