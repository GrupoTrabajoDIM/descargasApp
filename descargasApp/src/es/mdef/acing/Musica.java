package es.mdef.acing;

import personas.Artista;

public class Musica extends Contenido {
	
	private Artista artista;
	
	
	public Artista getArtista() {
		return artista;
	}
	
	public String mostrarMusica () {
		return super.mostraContenido() +
				"\nArtista: " + getArtista().mostrarArtista()+"\n";
	}
	public Musica(Identificador id, String titulo, Artista artista) {
		super(id, titulo);
		this.artista = artista;
	}


}