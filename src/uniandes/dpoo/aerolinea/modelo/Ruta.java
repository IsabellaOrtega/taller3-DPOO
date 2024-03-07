package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta{
	
	//atributos
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
	public int getDuracion;
	
	// constructor
	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
		this.horaSalida= horaSalida;
		this.horaLlegada=horaLlegada;
		this.codigoRuta = codigoRuta;
		this.destino = destino;
		this.origen = origen;
	}
	
	public String getCodigoRuta() {
		return codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return origen;
	}
	
	public Aeropuerto getDestino() {
		return destino;
	}
	
	public String getHoraSalida() {
		return horaSalida;
	}
	
	public String getHoraLlegada() {
		return horaLlegada;
	}
	
	public int getDuracion() {
		
		int hSalida = getHoras(horaSalida);
		int mSalida = getMinutos(horaSalida);
		int hLlegada = getHoras(horaLlegada);
		int mLlegada = getMinutos(horaLlegada);
		
		if (hSalida> hLlegada) {
			hLlegada += 24;
		}
		
		int totalminSalida= 60*hSalida + mSalida;
		int totalminLlegada= 60*hLlegada + mLlegada;
		
		return (totalminLlegada - totalminSalida);
		
	}
    // TODO completar


    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
