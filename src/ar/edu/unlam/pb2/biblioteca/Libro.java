package ar.edu.unlam.pb2.biblioteca;

public class Libro {

	private Integer codigo;
	private String nombre;
	private String autor;

	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

}
