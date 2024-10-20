public class Piloto {

	private Vuelo vuelo;
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
	 * @param vuelo
	 */

	public void setVuelo(Vuelo vuelo){
		this.vuelo = vuelo;
	}
	public Piloto(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

}