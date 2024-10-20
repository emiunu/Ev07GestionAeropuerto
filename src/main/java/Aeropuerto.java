import java.util.*;

public class Aeropuerto {

	private List<Avion> aviones;
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param numVuelo
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param fechaInicio
	 * @param fechaDestino
	 * @param pilotos
	 */
	public boolean crearVuelo(int numVuelo, Ciudad ciudadOrigen, Ciudad ciudadDestino, int fechaInicio, int fechaDestino, List<Piloto> pilotos, Avion avion) {
		for (Vuelo vuelo : avion.getVuelos()){
			if (vuelo.getNumVuelo() != numVuelo){
				Vuelo vueloNuevo = new Vuelo(numVuelo, fechaInicio, fechaDestino, ciudadOrigen, ciudadDestino, pilotos);
				for (Piloto pil : pilotos){
					pil.setVuelo(vuelo);
				}
				avion.getVuelos().add(vueloNuevo);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param modelo
	 */
	public boolean registrarAviones(String modelo, List<Vuelo> vuelos) {
		for (Avion avion : aviones) {
			if (avion.getModelo().equals(modelo)) {
				return false;
			}
		}
		Avion nuevoAvion = new Avion(modelo, vuelos);
		this.aviones.add(nuevoAvion);
		return true;
	}



	/**
	 * 
	 * @param avion
	 * @param numVuelo
	 * @param pasajero
	 */
	public boolean registrarPasajeros(Avion avion, int numVuelo, Pasajero pasajero) {
		for (Vuelo vuelo : avion.getVuelos()){
			if (vuelo.getNumVuelo() == numVuelo){
				List<Pasajero> pasajeros = vuelo.getPasajeros();
				pasajeros.add(pasajero);
				vuelo.setPasajeros(pasajeros);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param avion
	 * @param numVuelo
	 * @param piloto
	 */
	public boolean registrarPilotos(Avion avion, int numVuelo, Piloto piloto) {
		for (Vuelo vuelo : avion.getVuelos()) {
			if(vuelo.getNumVuelo() == numVuelo){
				List<Piloto> pilotos = vuelo.getPilotos();
				pilotos.add(piloto);
				vuelo.setPilotos(pilotos);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param avion
	 * @param numVuelo
	 * @param fechaActual
	 */
	public boolean validarPasajeros(Avion avion, int numVuelo, int fechaActual) {
		List<Vuelo> vuelos = avion.getVuelos();
		boolean pasajerosValidados = true;
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getNumVuelo() == numVuelo){
				List<Pasajero> pasajeros = vuelo.getPasajeros();
				for (Pasajero pasajero : pasajeros){
					if (pasajero.getPasaporte().getFechaExpiracion() < fechaActual && pasajero.getPasaporte().getHojasDisponibles() == 0){
						pasajerosValidados = false;
					}
				}
			}
		}
		return pasajerosValidados;
	}


	public List<Pasajero> buscarPasajeroPorFecha(int fechaInicio) {
		List<Pasajero> pasajeros = new ArrayList<>();
		for (Avion avion : aviones){
			for (Vuelo vuelo : avion.getVuelos()){
				if (vuelo.getFechaInicio() == fechaInicio){
					for (Pasajero pasajero : vuelo.getPasajeros()){
						pasajeros.add(pasajero);
					}
				}
			}
		}

		return pasajeros;
	}

	/**
	 * 
	 * @param avion
	 * @param numVuelo
	 */
	public List<Pasajero> buscarPasajeroPorVuelo(Avion avion, int numVuelo) {
		List<Vuelo> vuelos = avion.getVuelos();
		for (Vuelo vuelo : vuelos){
			if (vuelo.getNumVuelo() == numVuelo){
				return vuelo.getPasajeros();
			}
		}
		return null;
	}

	public Aeropuerto(String nombre){
		this.nombre = nombre;
		this.aviones = new ArrayList<>();
	}

}