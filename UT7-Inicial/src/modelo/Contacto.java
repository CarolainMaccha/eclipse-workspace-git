package modelo;

import java.util.Objects;
import java.util.Scanner;

public class Contacto implements Comparable{
	protected String nombre;
	protected String teléfono;
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public int compareTo(Object o) {

		return this.nombre.compareTo(o.nombre);
	}
	public Contacto(String nombre, String teléfono) {
		super();
		this.nombre = nombre;
		this.teléfono = teléfono;
	}
	
	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", teléfono: " + teléfono;
	}
	
	// Lee un nuevo Contacto desde teclado.
	// Devuelve null si se dejan vacíos el nombre o el teléfono
	public static Contacto deTeclado(Scanner entrada) {
		System.out.print("Dame el nombre: ");
		String nombre = entrada.nextLine();
		if (nombre.isBlank()) return null;
		System.out.print("Dame el teléfono: ");
		String teléfono = entrada.nextLine();
		if (teléfono.isBlank()) return null;
		return new Contacto(nombre,teléfono);
	}

	

}
