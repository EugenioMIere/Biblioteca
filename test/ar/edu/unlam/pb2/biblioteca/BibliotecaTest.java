package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queQuederegistradoUnPrestamoRealizado() {
		Integer id = 0345;
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombreEstudiante = "Eugenio";
		Estudiante estudiante1 = new Estudiante(dni, apellido, nombreEstudiante);
		Integer codigo = 123456;
		String nombre = "Algebra";
		String autor = "Baldur";
		LibroMatematica libro1 = new LibroMatematica(codigo, nombre, autor);

		Prestamo prestamo1 = new Prestamo(id, estudiante1, libro1);

		Biblioteca leopoldoMarechal = new Biblioteca();

		Boolean valorObtenido = leopoldoMarechal.registrarPrestamo(prestamo1);

		assertTrue(valorObtenido);

	}

	@Test
	public void queUnEstudiantePuedaSolicitarElPrestamoDeDosLibrosSimultaneamente() {
		Integer id = 0345;
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombreEstudiante = "Eugenio";
		Estudiante estudiante1 = new Estudiante(dni, apellido, nombreEstudiante);
		Integer codigo = 123456;
		String nombre = "Algebra";
		String autor = "Baldur";
		LibroMatematica libro1 = new LibroMatematica(codigo, nombre, autor);
		Integer codigo1 = 123465;
		String nombre1 = "HistoriaMundial";
		String autor1 = "LaMancha";
		LibroHistoria libro2 = new LibroHistoria(codigo1, nombre1, autor1);

		Prestamo prestamo1 = new Prestamo(id, estudiante1, libro1, libro2);

		Biblioteca leopoldoMarechal = new Biblioteca();

		leopoldoMarechal.registrarPrestamo(prestamo1);
		Integer valorObtenido = leopoldoMarechal.getCantidadDeLibrosEnElPrestamo(id);
		Integer valorEsperado = 2;

		assertEquals(valorObtenido, valorEsperado);

	}
	
	@Test
	public void queNoSepuedaPrestarUnLibroDosVeces() {
		Integer id = 0345;
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombreEstudiante = "Eugenio";
		Estudiante estudiante1 = new Estudiante(dni, apellido, nombreEstudiante);
		Integer codigo = 1234;
		String nombre = "Algebra";
		String autor = "Baldur";
		LibroMatematica libro1 = new LibroMatematica(codigo, nombre, autor);
		

		Prestamo prestamo1 = new Prestamo(id, estudiante1, libro1);
		Prestamo prestamo2 = new Prestamo(0346, estudiante1, libro1);

		Biblioteca leopoldoMarechal = new Biblioteca();

		leopoldoMarechal.registrarPrestamo(prestamo1);
		Boolean valorObtenido = leopoldoMarechal.registrarPrestamo(prestamo2);
		

		assertFalse(valorObtenido);

	}
	
	@Test
	public void queAlDevovlerUnLibroPuedaVolverAPrestarse() {
		Integer id = 0345;
		Integer dni = 12345678;
		String apellido = "Miere";
		String nombreEstudiante = "Eugenio";
		Estudiante estudiante1 = new Estudiante(dni, apellido, nombreEstudiante);
		Integer codigo = 1234;
		String nombre = "Algebra";
		String autor = "Baldur";
		LibroMatematica libro1 = new LibroMatematica(codigo, nombre, autor);
		

		Prestamo prestamo1 = new Prestamo(id, estudiante1, libro1);
		Prestamo prestamo2 = new Prestamo(0346, estudiante1, libro1);

		Biblioteca leopoldoMarechal = new Biblioteca();

		leopoldoMarechal.registrarPrestamo(prestamo1);
		leopoldoMarechal.devolverPrestamo(prestamo1);
		Boolean valorObtenido = leopoldoMarechal.registrarPrestamo(prestamo2);
		

		assertTrue(valorObtenido);

	}

}
