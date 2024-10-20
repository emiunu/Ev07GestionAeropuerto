public class Pasajero {

	private Pasaporte pasaporte;
	private String nombre;
	private String apellido;

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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param pasaporte
	 */
	public Pasajero(String nombre, String apellido, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
	}

	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}

}