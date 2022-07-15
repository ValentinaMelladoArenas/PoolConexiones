package cl.talentoDigital.modelo;

public class Libro {

	private int numLibro;
	private String nomLibro;
	private String autorLibro;
	
	public Libro() {
	}

	public Libro(int numLibro, String nomLibro, String autorLibro) {
		super();
		this.numLibro = numLibro;
		this.nomLibro = nomLibro;
		this.autorLibro = autorLibro;
	}

	public int getNumLibro() {
		return numLibro;
	}

	public void setNumLibro(int numLibro) {
		this.numLibro = numLibro;
	}

	public String getNomLibro() {
		return nomLibro;
	}

	public void setNomLibro(String nomLibro) {
		this.nomLibro = nomLibro;
	}

	public String getAutorLibro() {
		return autorLibro;
	}

	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}
}
