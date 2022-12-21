package poo;

public class Personaje {
	private String apodo;
	private String nombre;

	public Personaje() {
		apodo = "sin apodo";
		nombre = "sin nombre";
	}

	public Personaje(String nombre, String apodo) {
		this.nombre = nombre;
		this.apodo = apodo;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personaje [apodo=" + apodo + ", nombre=" + nombre + "]";
	}

}
