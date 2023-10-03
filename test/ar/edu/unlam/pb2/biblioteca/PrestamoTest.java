package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrestamoTest {

	@Test
	public void queSePuedaGenerarUnPrestamo() {
		Integer id = 0123;
		Integer codigo = 123456;
		String nombre = "Historia Mundial";
		String autor = "Pepito";
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombreEstudiante = "Eugenio";

		Estudiante estudiante1 = new Estudiante(dni, apellido, nombreEstudiante);
		Libro libro1 = new Libro(codigo, nombre, autor);
		Prestamo prestamo1 = new Prestamo(id, estudiante1, libro1);

		Integer valorObtenido = prestamo1.getId();
		Integer valorEsperado = id;

		assertEquals(valorEsperado, valorObtenido);

	}

}
