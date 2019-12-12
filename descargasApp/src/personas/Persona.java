package personas;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private Nacionalidad nacionalidad;
	private boolean sexo;
	private int anioNacimiento;
	
	public Persona (String nombre, String apellidos, Nacionalidad nacionalidad) {
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

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public String getSexo() {
		String sexo = "masculino";
		if (this.sexo) {
			sexo = "masculino";
		} else {
			sexo = "femenino";
		}		
		return sexo;
		
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public String mostrarPersona () {
		return "Nombre: " + getNombre() + "\nApellidos: " + getApellidos() + 
				"\nNacionalidad: " + getNacionalidad().mostrarNacionalidad() +
				"\nAño de nacimiento: " + getAnioNacimiento() +
				"\nSexo: "+ getSexo();
	}
}
