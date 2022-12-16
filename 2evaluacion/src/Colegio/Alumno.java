package Colegio;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	//constructor
	public Alumno(String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	//constructor vacío
	public Alumno() {
		nombre=" ";
		apellidos=" ";
		edad=0;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
}
