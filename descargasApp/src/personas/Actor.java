package personas;

import java.util.ArrayList;
import java.util.List;

public class Actor extends Persona{


	private ArrayList<String> estilos;

	public ArrayList<String> getEstilos() {
		return estilos;
	}

	public void agregarEstilo (String estilo) {
		estilos.add(estilo);
	}
	
	public void eliminarEstilo (String estilo) {
		for (String string : estilos) {
			if (string.equalsIgnoreCase(estilo)) {
				estilos.remove(estilo);
			}
		}
	}
	
	public String mostrarActor () {
		return super.mostrarPersona() + ", especializado en papeles de: " + estilos.toString()+"\n";
	}
	
	public Actor(String nombre, String apellidos, List<String> nacionalidad, ArrayList<String> estilos) {
		super(nombre, apellidos, nacionalidad);
		this.estilos = estilos;		
	}
}
