package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstudianteTest {

	@Test
	public void queSePuedaDarDeAltaUnEstudiante() {
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombre = "Eugenio";
		Estudiante estudiante1 = new Estudiante(dni,apellido,nombre);
		
		assertEquals(estudiante1.getDni(),dni);
		
	}

}
