package es.mdef.acing;


public class Identificador {
	private int identificador;
	private static int identificadorActual = 0;

	public Identificador() {
		identificador = identificadorActual + 1;
		identificadorActual++;
	}

	public int getValor() {
		return identificador;
	}	
}