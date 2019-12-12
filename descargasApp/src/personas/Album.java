package personas;
/*
 * quizas esta clase no haga falta.
 */
public class Album {
	
	private String album;
	private int anioAlbum;
	
	public Album (String album, int anioAlbum) {
		setAlbum(album);
		setAnioAlbum(anioAlbum);
	}
	public String mostrarAlbum() {
		return "Título álbum: "+getAlbum()+", (año " + getAnioAlbum()+ ").";
	}

	public String getAlbum() {
		return album;
	}

	private void setAlbum(String album) {
		this.album = album;
	}

	public int getAnioAlbum() {
		return anioAlbum;
	}

	private void setAnioAlbum(int anioAlbum) {
		this.anioAlbum = anioAlbum;
	}
	

}
