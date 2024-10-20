public class Pasaporte {

	private int id;
	private String nacionalidad;
	private int hojasDisponibles;
	private int fechaExpiracion;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getHojasDisponibles() {
		return this.hojasDisponibles;
	}

	/**
	 * 
	 * @param hojasDisponibles
	 */
	public void setHojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public int getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	/**
	 * 
	 * @param fechaExpiracion
	 */
	public void setFechaExpiracion(int fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/**
	 * 
	 * @param id
	 * @param nacionalidad
	 * @param hojasDisponibles
	 * @param fechaExpiracion
	 */
	public Pasaporte(int id, String nacionalidad, int hojasDisponibles, int fechaExpiracion) {
		this.id = id;
		this.nacionalidad = nacionalidad;
		this.hojasDisponibles = hojasDisponibles;
		this.fechaExpiracion = fechaExpiracion;
	}

}