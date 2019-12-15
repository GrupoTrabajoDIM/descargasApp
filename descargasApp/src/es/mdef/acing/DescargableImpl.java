package es.mdef.acing;

public class DescargableImpl implements Descargable, Comparable<Contenido> {
	
	private Double tamanoMegas;
	private Contenido contenido;
		
	@Override
	public Double getTamanoMegas() {
		return tamanoMegas;
	}

	@Override
	public Contenido getContenido() {
		return contenido;
	}
	
	public String mostrarDescargableImpl() {
		
		return getContenido().mostraContenido() + ", Tamaño fichero = " + getTamanoMegas()+ " Mbps.";
	}
	public DescargableImpl(Double tamanoMegas, Contenido contenido) {
		super();
		this.tamanoMegas = tamanoMegas;
		this.contenido = contenido;
	}

	@Override
	public int compareTo(Contenido otroContenido) {
		int resultado;
		resultado = contenido.getTitulo().compareToIgnoreCase(otroContenido.getTitulo());
		return resultado;
	}


}
