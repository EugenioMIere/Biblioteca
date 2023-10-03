package ar.edu.unlam.pb2.biblioteca;

public class LibroGeografia extends Libro {
	private static final String FOTOCOPIABLE = "Fotocopiable";

	public LibroGeografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);

	}

	public String esFotocopiable() {
		return LibroGeografia.FOTOCOPIABLE;
	}
}
