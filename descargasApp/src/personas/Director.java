package personas;

import java.util.ArrayList;
import java.util.List;

public class Director extends Persona{
	
	private ArrayList<String> generos;
	
	public ArrayList<String> getGeneros() {
		return generos;
	}

	private void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}

	public void agregarGenero (String nombreGenero) {
		generos.add(nombreGenero);
	}
	public void eliminarGenero (String nombreGenero) {
		for (String string : generos) {
			if (string.equalsIgnoreCase(nombreGenero)) {
				generos.remove(nombreGenero);
			}
		}		
	}

	public String mostrarDirector () {
		return super.mostrarPersona() + ", sus géneros son: " + getGeneros().toString();
	}
	public Director (String nombre, String apellidos, List<String> nacionalidad, ArrayList<String> generos) {
	
		super(nombre, apellidos, nacionalidad);
		setGeneros(generos);
	}
}
