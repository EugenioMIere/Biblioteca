package ar.edu.unlam.pb2.biblioteca;

public class Estudiante {

	private Integer dni;
	private String apelido;
	private String nombre;

	public Estudiante(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apelido = apellido;
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public String getApelido() {
		return apelido;
	}

	public String getNombre() {
		return nombre;
	}

}
