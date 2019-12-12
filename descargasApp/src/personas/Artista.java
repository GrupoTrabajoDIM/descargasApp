package personas;

import java.util.ArrayList;

public class Artista extends Persona {
	private ArrayList<String> grupos;
	private ArrayList<String> estilos;
	private int anioDebut;
	private boolean estado;
	private ArrayList<String> albumes;
	
	public Artista(String nombre, String apellidos, Nacionalidad nacionalidad, int debut) {
		super(nombre, apellidos, nacionalidad);
		this.anioDebut=debut;		
	}
	public void agregarGrupo (ArrayList<String> grupos, String nombreGrupo) {
		grupos.add(nombreGrupo);
	}
	public void eliminarGrupo (String nombreGrupo) {
		for (String string : grupos) {
			if (string==nombreGrupo) {
				grupos.remove(nombreGrupo);
			}
		}		
	}
	
	public void agregarEstilo (ArrayList<String> estilos, String nombreEstilo) {
		estilos.add(nombreEstilo);
	}
	public void eliminarEstilo (String nombreEstilo) {
		for (String string : estilos) {
			if (string==nombreEstilo) {
				estilos.remove(nombreEstilo);
			}
		}		
	}
	public void agregarAlbum (ArrayList<String> albumes, String nombreAlbum) {
		albumes.add(nombreAlbum);
	}
	public void eliminarAlbum (String nombreAlbum) {
		for (String string : albumes) {
			if (string==nombreAlbum) {
				albumes.remove(nombreAlbum);
			}
		}		
	}
	public String getEstado() {
		String estado = "no activo";
		if (this.estado) {
			estado = "activo";
		}
		return estado;
	}
	
	public int getAnioDebut() {
		return anioDebut;
	}
	public String mostrarArtista () {
		return super.mostrarPersona() + "\nAño Debut: " + getAnioDebut()+", se encuentra "+getEstado()+
				"\nFormo parte de los siguientes grupos musicales: "+ grupos.toString()+
				"\nLos estilos musicales que tiene son: "+estilos.toString()+
				"\nSus álbumes son los siguientes: "+albumes.toString();
	}
	
}
	

