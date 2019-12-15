package personas;

import java.util.ArrayList;
import java.util.List;

public class Artista extends Persona {
	
	private ArrayList<String> grupos;
	private ArrayList<String> estilos;

	public void agregarGrupo (ArrayList<String> grupos, String nombreGrupo) {
		grupos.add(nombreGrupo);
	}
	public void eliminarGrupo (String nombreGrupo) {
		for (String string : grupos) {
			if (string.equalsIgnoreCase(nombreGrupo)) {
				grupos.remove(nombreGrupo);
			}
		}		
	}
	
	public void agregarEstilo (ArrayList<String> estilos, String nombreEstilo) {
		estilos.add(nombreEstilo);
	}
	public void eliminarEstilo (String nombreEstilo) {
		for (String string : estilos) {
			if (string.equalsIgnoreCase(nombreEstilo)) {
				estilos.remove(nombreEstilo);
			}
		}		
	}

	public String mostrarArtista () {
		return super.mostrarPersona() +	"\nGrupos musicales: "+ grupos.toString()+
				"\nEstilo musical: "+estilos.toString();
	}
	public Artista(String nombre, String apellidos, List<String> nacionalidad,
			ArrayList<String> grupos, ArrayList<String> estilos) {
		super(nombre, apellidos, nacionalidad);
		this.grupos = grupos;
		this.estilos = estilos;
	
	}
}
	

