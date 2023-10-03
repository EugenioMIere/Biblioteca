package ar.edu.unlam.pb2.biblioteca;

public class LibroHistoria extends Libro{
	
	private static final String FOTOCOPIABLE = "Fotocopiable"; 

	public LibroHistoria(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}
	
	public String esFotocopiable() {
		return LibroHistoria.FOTOCOPIABLE;
	}

}
