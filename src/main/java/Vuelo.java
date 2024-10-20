import java.util.*;

public class Vuelo {

	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private List<Piloto> pilotos;
	private List<Pasajero> pasajeros;
	private int fechaInicio;
	private int fechaDestino;
	private int numVuelo;

	public int getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(int fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getFechaDestino() {
		return this.fechaDestino;
	}

	/**
	 * 
	 * @param fechaDestino
	 */
	public void setFechaDestino(int fechaDestino) {
		this.fechaDestino = fechaDestino;
	}

	/**
	 * 
	 * @param numVuelo
	 * @param fechaInicio
	 * @param fechaDestino
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param pilotos
	 */
	public Vuelo(int numVuelo, int fechaInicio, int fechaDestino, Ciudad ciudadOrigen, Ciudad ciudadDestino, List<Piloto> pilotos) {
		this.numVuelo = numVuelo;
		this.fechaInicio = fechaInicio;
		this.fechaDestino = fechaDestino;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.pilotos = pilotos;
		this.pasajeros = new ArrayList<>();

	}

	public List<Pasajero> getPasajeros() {
		return this.pasajeros;
	}

	/**
	 * 
	 * @param pasajeros
	 */
	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public List<Piloto> getPilotos() { return this.pilotos; }

	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public int getNumVuelo() {
		return this.numVuelo;
	}

	/**
	 * 
	 * @param numVuelo
	 */
	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

}