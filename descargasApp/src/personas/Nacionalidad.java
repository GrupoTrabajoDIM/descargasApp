package personas;

import java.util.ArrayList;

public class Nacionalidad {
	private ArrayList<String> listaNacionalidades;
	
	public Nacionalidad() {
		
	}
	public void anadirNacionalidad (String nacionalidad) {
		listaNacionalidades.add(listaNacionalidades.size()-1, nacionalidad);
	}
	public String mostrarNacionalidad() {
		String nacionalidades = "[ ";
		for (String string : listaNacionalidades) {
			nacionalidades += string + ", ";
			
		}
		return nacionalidades;
	}

}
