package UML;

public class Persona {
	private String nombre;
	private String apellidos;
	protected String fechaNacimiento;
	
	public Persona(String nombre, String apellidos, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

}
