package ar.edu.unlam.pb2.biblioteca;

public class Prestamo {

	private Integer id;
	private Estudiante estudiante;
	private Libro libro1;
	private Libro libro2;

	public Prestamo(Integer id, Estudiante estudiante1, Libro libro1) {
		this.id = id;
		this.estudiante = estudiante1;
		this.libro1 = libro1;
	}

	public Prestamo(Integer id, Estudiante estudiante1, Libro libro1, Libro libro2) {
		this.id = id;
		this.estudiante = estudiante1;
		this.libro1 = libro1;
		this.libro2 = libro2;
	}

	public Libro getCodigoLibro1() {
		return this.libro1;
	}

	public Libro getCodigoLibro2() {
		return this.libro2;
	}

	public Estudiante getDniAlumno() {
		return this.estudiante;
	}

	public Integer getId() {
		return id;
	}

	public Integer getCantidadDeLibros() {
		Integer cantidadDeLibrosPrestadoAUnestudiante = 1;

		if (libro2 != null) {
//			if (libro2.getCodigo() != 0000) {
				return 2;
//			}
		}

		return cantidadDeLibrosPrestadoAUnestudiante;
	}

}
