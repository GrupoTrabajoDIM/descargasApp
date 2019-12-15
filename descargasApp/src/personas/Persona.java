package personas;

import java.util.List;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private List<String> nacionalidad;

	
	public Persona (String nombre, String apellidos, List<String> nacionalidad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public List<String> getNacionalidad() {
		return nacionalidad;
	}
	
	public void anadirNacionalidad (String nacionalidad) {
		this.nacionalidad.add(nacionalidad);
	}
	public String mostrarPersona () {
		return getNombre() + " " + getApellidos() + 
				", nacionalidad: " + getNacionalidad();
	}
}
