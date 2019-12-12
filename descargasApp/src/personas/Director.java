package personas;

import java.util.ArrayList;

public class Director extends Persona{
	private ArrayList<String> generos;
	private String escuela;
	private ArrayList<String> productoras;
	private ArrayList<String> premios;
	
	public Director (String nombre, String apellidos, Nacionalidad nacionalidad, String escuela) {
		super(nombre, apellidos, nacionalidad);
		setEscuela(escuela);
	}
	public void agregarGenero (ArrayList<String> generos, String nombreGenero) {
		generos.add(nombreGenero);
	}
	public void eliminarGenero (String nombreGenero) {
		for (String string : generos) {
			if (string==nombreGenero) {
				generos.remove(nombreGenero);
			}
		}		
	}
	public void agregarProductora (ArrayList<String> productoras, String nombreProductora) {
		productoras.add(nombreProductora);
	}
	public void eliminarProductora (String nombreProctora) {
		for (String string : productoras) {
			if (string==nombreProctora) {
				productoras.remove(nombreProctora);
			}
		}		
	}
	public void agregarPremio (ArrayList<String> premios, String premio) {
		premios.add(premio);
	}
	public void eliminarPremio (String premio) {
		for (String string : premios) {
			if (string==premio) {
				premios.remove(premio);
			}
		}		
	}
	
	public ArrayList<String> getGeneros() {
		return generos;
	}
	public ArrayList<String> getProductoras() {
		return productoras;
	}
	public ArrayList<String> getPremios() {
		return premios;
	}
	public String getEscuela() {
		return escuela;
	}

	private void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public String mostrarDirector () {
		return super.mostrarPersona() + "\nEscuela cinematográfica: " + getEscuela()+
				"\nLos géneros de sus peliculas son: "+getGeneros().toString()+
				"\nHa ganado los siguientes premios : "+ getPremios().toString()+
				"\nHa trabajado para las productoras siguientes : "+ getProductoras().toString();
	}
	
}
