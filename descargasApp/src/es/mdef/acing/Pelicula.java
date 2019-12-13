package es.mdef.acing;

import personas.Actor;
import personas.Director;

public class Pelicula extends Contenido {
	   private Director director;
	   private Actor[] actoresPrincipales;

	   public Pelicula(Identificador id, String titulo) {
		   super(id, titulo);
	   }
	   
}
