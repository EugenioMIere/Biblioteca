package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void queSePuedaDarAltaDeLibro() {
		Integer codigo = 123456;
		String nombre = "Historia Mundial";
		String autor = "Pepito";
		Libro libro1 = new Libro(codigo,nombre,autor);
		assertEquals(libro1.getCodigo(),codigo);
	}

}
