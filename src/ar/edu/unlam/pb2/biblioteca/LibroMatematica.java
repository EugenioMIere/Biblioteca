package ar.edu.unlam.pb2.biblioteca;

public class LibroMatematica extends Libro {
	private static final String FOTOCOPIABLE = "No Fotocopiable";

	public LibroMatematica(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}

	public String esFotocopiable() {
		return LibroMatematica.FOTOCOPIABLE;
	}

}
