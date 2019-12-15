package es.mdef.acing;

import java.util.List;
import personas.Actor;
import personas.Director;

public class Pelicula extends Contenido {
	   
	private Director director;
	private List<Actor> actoresPrincipales;
	
	public Director getDirector() {
		return director;
	}

	public List<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}
	public void anadirActor (Actor actor) {
		actoresPrincipales.add(actor);
	}
	private String mostrarActoresPrincipales () {
		String actores= "";
		for (int i = 0; i < actoresPrincipales.size(); i++) {
			actores += "\t- " + actoresPrincipales.get(i).mostrarActor(); 
		}
		return actores;
	}
	public String mostrarPelicula () {
		return super.mostraContenido() + "\nDirector: " + getDirector().mostrarDirector()+
				"\nActores Principales:\n" + mostrarActoresPrincipales();
	}
	
	public Pelicula(Identificador id, String titulo, Director director,
					List<Actor> actores) {
		super(id, titulo);
		this.director = director;
		actoresPrincipales = actores;
	}
	   
}
