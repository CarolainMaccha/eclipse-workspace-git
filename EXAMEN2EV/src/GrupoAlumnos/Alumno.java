package GrupoAlumnos;

public class Alumno extends Persona implements Evaluable,Comparable<Alumno>{
	protected int nia;

	public Alumno(String nif, int nia) {
		super(nif);
		this.nia = nia;
	}

	@Override
	public String toString() {
		return "Alumno [nif:" + getNif() + " nia=" + nia + "]";
	}

	@Override
	public double evaluar() {
		return 0;
	}

	@Override
	public int compareTo(Alumno o) {
		return this.nia-o.nia;
	}

}
