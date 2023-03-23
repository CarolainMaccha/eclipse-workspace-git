package GrupoAlumnos;

public class Persona {
	private String nif;

	public Persona(String nif) {
		super();
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Persona con nif: " + nif;
	}

}
