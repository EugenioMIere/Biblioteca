package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Prestamo> registroDePrestamos = new ArrayList<Prestamo>();

	public Boolean registrarPrestamo(Prestamo prestamo1) {
		if (!this.comprobarDuplicado(prestamo1)) {
			return this.registroDePrestamos.add(prestamo1);
		}
		return false;
	}

	public Integer getCantidadDeLibrosEnElPrestamo(Integer id) {
		Integer cantidad = 0;

		for (Prestamo prestamo : registroDePrestamos) {
			if (prestamo.getId() == id) {
				cantidad = prestamo.getCantidadDeLibros();
			}
		}
		return cantidad;
	}
	
	public Boolean comprobarDuplicado(Prestamo prestamo1){
		
		Boolean duplicado = false;
		
		for (Prestamo prestamo : registroDePrestamos) {
			if (prestamo.getCantidadDeLibros()==2&&prestamo1.getCantidadDeLibros()==2) {
				if (prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro1()
					||prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro2()
					||prestamo.getCodigoLibro2()==prestamo1.getCodigoLibro1()
					||prestamo.getCodigoLibro2()==prestamo1.getCodigoLibro2()) {
					
					duplicado = true;
				}
				
			}
			if(prestamo.getCantidadDeLibros()==2&&prestamo1.getCantidadDeLibros()==1){
				if (prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro1()
					||prestamo.getCodigoLibro2()==prestamo1.getCodigoLibro1()) {
						
						duplicado = true;
					}
			}
			if(prestamo.getCantidadDeLibros()==1&&prestamo1.getCantidadDeLibros()==2){
				if (prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro1()
					||prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro2()) {
						
						duplicado = true;
					}
			}
			if(prestamo.getCantidadDeLibros()==1&&prestamo1.getCantidadDeLibros()==1){
				if (prestamo.getCodigoLibro1()==prestamo1.getCodigoLibro1()) {
						
						duplicado = true;
					}
			}
		}
		return duplicado;
		
	}

	public void devolverPrestamo(Prestamo prestamo1) {
		this.registroDePrestamos.remove(prestamo1);
		
	}

}
