package es.mdef.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import personas.Actor;
import personas.Artista;
import personas.Director;

public class AppDescargas {

	
	public static void main(String[] args) {
		
//		Collection<Descargable> misDescargas = new ArrayList<Descargable>(); 
//		Contenido cancion1 = new Contenido(new Identificador(1), "thunder");
//		Contenido pelicula1 = new Contenido(new Identificador(2), "La chaqueta metálica");
//		
//		
//		misDescargas.add(new DescargableImpl(12.5, cancion1));
//		misDescargas.add(new DescargableImpl(278.0, pelicula1));
//		misDescargas.add(new DescargableImpl(128.5, pelicula1));
//		misDescargas.add(new DescargableImpl(12.5, cancion1));
//		
//		ordenarListaDescarga(misDescargas);
		//CREO ARTISTAS, DIRECTORES Y ACTORES, creo nacionalidades, grupos, estilos, generos para asignar más rapidamente.
		List<String> nacionalidad = new ArrayList<>();//nacionalidades
		nacionalidad.add("Inglesa");
		nacionalidad.add("Americana");
		List<String> nacionalidad1 = new ArrayList<>();
		nacionalidad1.add("Americana");
		List<String> nacionalidad2 = new ArrayList<>();
		nacionalidad2.add("Española");
		
		ArrayList<String> grupo = new ArrayList<>();//grupos musicales
		grupo.add("Fecale Matter");
		grupo.add("Nirvana");
		ArrayList<String> grupo1 = new ArrayList<>();
		grupo1.add("Queen");
		grupo1.add("Smile");
		
		ArrayList<String> estilo = new ArrayList<>();//estilo musical
		estilo.add("Grunge");
		estilo.add("Rock Alternativo");
		estilo.add("Punk rock");
		
		ArrayList<String> estilo1 = new ArrayList<>();
		estilo1.add("Hard Rock");
		estilo1.add("Opera Rock");
		
		ArrayList<String> genero = new ArrayList<>();//gneros de director
		genero.add("Ciencia Ficción");
		genero.add("Acción");
		ArrayList<String> genero1 = new ArrayList<>();
		genero1.add("Drama");
		genero1.add("Terror");
		
		ArrayList<String> estiloActor = new ArrayList<>();//estilo de actor
		estiloActor.add("Accion");
		estiloActor.add("Comico");
		
		
		//Musicos
		Artista artista = new Artista("Kurt", "Cobain", nacionalidad1, grupo, estilo);
		artista.agregarEstilo(estilo, "Electro Punk");
		Artista artista2 = new Artista("Freddie", "Mercury", nacionalidad, grupo1, estilo1);
//		System.out.println(artista.mostrarArtista());
//		System.out.println(artista2.mostrarArtista());
		//Directores
		Director director = new Director("George", "Lucas", nacionalidad1, genero);
//		System.out.println(director.mostrarDirector());
		
		Director director1 = new Director("Santiago", "Segura", new ArrayList<>(), new ArrayList<>());
		director1.anadirNacionalidad("Española");
		director1.agregarGenero("Humor");
//		System.out.println(director1.mostrarDirector());
		//Actores

		Actor actor1 = new Actor("Harrison", "Ford", new ArrayList<>(), new ArrayList<>());
		actor1.anadirNacionalidad("Estadounidense");
		actor1.anadirNacionalidad("Polaco");
		actor1.agregarEstilo("Accion");
		actor1.agregarEstilo("Ciencia Ficcion");
//		System.out.println(actor1.mostrarActor());
		
		Actor actor2 = new Actor("Ewan", "Mc Gregor", new ArrayList<>(), new ArrayList<>());
		actor2.anadirNacionalidad("Britanico");
		actor2.agregarEstilo("Lírico");
		actor2.agregarEstilo("Ciencia Ficcion");
		
		
		//CREO CONTENIDO DE MUSICA Y PELICULA
	
		Musica cancion = new Musica(new Identificador(), "Nevermind", artista);
		Musica cancion1 = new Musica(new Identificador(), "Bohemian Rhapsody", artista2);
		System.out.println(cancion.mostrarMusica());
		System.out.println(cancion1.mostrarMusica());
		
		Pelicula pelicula = new Pelicula(new Identificador(), "Torrente", director1, new ArrayList<>());
		pelicula.anadirActor(new Actor("Tony", "Leblanc", nacionalidad2, new ArrayList<>()));
		Actor actor3 = new Actor("Gabino", "Diego", nacionalidad2, estiloActor);
		pelicula.anadirActor(actor3);
		System.out.println(pelicula.mostrarPelicula());
		
		Pelicula pelicula1 = new Pelicula(new Identificador(), "Star Wars", director, new ArrayList<>());
		pelicula1.anadirActor(actor1);		
		pelicula1.anadirActor(actor2);
		System.out.println(pelicula1.mostrarPelicula());
		
		//CREACION DE UNA LISTA DE DESCARGA
		//
		ArrayList<DescargableImpl> coleccionDescargables = new ArrayList<DescargableImpl>();
		
		DescargableImpl descargable = new DescargableImpl(1.5, cancion);
		DescargableImpl descargable1 = new DescargableImpl(3.0, cancion1);
		DescargableImpl descargable2 = new DescargableImpl(566.2, pelicula);
		DescargableImpl descargable3 = new DescargableImpl(1500.6, pelicula1);
		
		coleccionDescargables.add(descargable);
		coleccionDescargables.add(descargable1);
		coleccionDescargables.add(descargable2);
		coleccionDescargables.add(descargable3);
		coleccionDescargables.add(new DescargableImpl(4.6, new Contenido(new Identificador(), "Mi Carro me lo robaron")));
		coleccionDescargables.add(new DescargableImpl(6.0, cancion1));
		coleccionDescargables.add(descargable2);
		coleccionDescargables.add(descargable3);
			
		
		ListaDescargas miListaDescargas = new ListaDescargas(coleccionDescargables, "Fibra Optica", 20.0);
		System.out.println(miListaDescargas.mostrarListaDescarga());
		
		ListaDescargas miListaDescargas1 = new ListaDescargas(coleccionDescargables, "ADSL", 8.9);
		miListaDescargas1.anadirDescargable(descargable3);
		miListaDescargas1.eliminarDescargable(descargable);
		miListaDescargas1.anadirDescargable(descargable);
		System.out.println(miListaDescargas1.mostrarListaDescarga());
		
		
	}
	protected static void ordenarListaDescarga (Collection<Descargable> listaDescargable) {
		List<Descargable> nuevaList = new ArrayList<>(listaDescargable);
		Comparator<Descargable> comparador = new Comparator<Descargable>() {

			@Override
			public int compare(Descargable o1, Descargable o2) {
				
				return o1.getContenido().getId().getValor();
			}
		};
		Collections.sort(nuevaList, comparador);
	}
		
		
	
	
//	- calcularTamanoDescarga (ArrayList<Descargable>): Double
//	- calcularTiempoDescarga (Double, Conexion) : Double

}