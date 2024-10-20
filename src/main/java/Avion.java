import java.util.*;

public class Avion {

	private List<Vuelo> vuelos;
	private String modelo;

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * @param modelo
	 * @param vuelos
	 */
	public Avion(String modelo, List<Vuelo> vuelos) {
		this.modelo = modelo;
		this.vuelos = vuelos;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos){
		this.vuelos = vuelos;
	}
}