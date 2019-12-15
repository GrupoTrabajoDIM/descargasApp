package es.mdef.acing;

import java.util.ArrayList;
import java.util.Comparator;

public class ListaDescargas implements Conexion {
	
	private ArrayList<DescargableImpl> listaDescarga;
	private String nombreConexion;
	private Double velocidadConexion;
		
	public ArrayList<DescargableImpl> getListaDescarga() {
		return listaDescarga;
	}

	@Override
	public String getNombreConexion() {
		
		return nombreConexion;
	}

	@Override
	public Double getVelocidad() {
		
		return velocidadConexion;
	}
	
	public void anadirDescargable (DescargableImpl descargable) {
		listaDescarga.add(descargable);
		
	}
	public void eliminarDescargable (DescargableImpl descargable) {
		listaDescarga.remove(descargable);
		
	}
	
	private void ordenarListaDescarga (ArrayList<DescargableImpl> lista){
		
		lista.sort(new Comparator<DescargableImpl>() {

			@Override
			public int compare(DescargableImpl o1, DescargableImpl o2) {
				return o1.compareTo(o2.getContenido());
			}
			
		});		
	}
	
	public String mostrarListaDescarga () {
		ordenarListaDescarga(listaDescarga);
		String lista = "";
		for (int i = 0; i < listaDescarga.size(); i++) {
			lista += getListaDescarga().get(i).mostrarDescargableImpl();
		}
		return "\n---------LISTA DE DESCARGAS----------------\n" + lista + "\n- Conexión: ["+ getNombreConexion() + ", velocidad = "+
				getVelocidad() + " Mbps]\n- Tamaño Total de la descarga = " + calcularTamanoDescarga() + " Mbits\n"
						+ "- Tiempo descarga = " + calcularTiempoDescarga() + " minutos.";
	}
	
	private Double calcularTamanoDescarga () {
		Double suma = 0.0;
		for (int i = 0; i < listaDescarga.size(); i++) {
			suma += listaDescarga.get(i).getTamanoMegas();
		}
		return suma;		
	}
	private Double calcularTiempoDescarga () {
		Double tiempo;
		tiempo = calcularTamanoDescarga()/(getVelocidad()*60);//tiempo en minutos
		return tiempo;
	}
	
	public ListaDescargas (ArrayList<DescargableImpl> descargables, String nombreConexion, Double velocidad) {
		listaDescarga = descargables;
		this.nombreConexion = nombreConexion;
		velocidadConexion = velocidad;
	}


}