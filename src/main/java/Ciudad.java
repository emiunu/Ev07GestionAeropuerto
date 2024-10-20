public class Ciudad {

	private String nombre;
	private String pais;

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

	public String getPais() {
		return this.pais;
	}

	/**
	 * 
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * 
	 * @param nombre
	 * @param pais
	 */
	public Ciudad(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

}