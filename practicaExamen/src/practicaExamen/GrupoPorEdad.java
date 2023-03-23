package practicaExamen;

import java.util.Arrays;

public class GrupoPorEdad {
	private SerVivo[] seres;
	public int size;

	public GrupoPorEdad(int max) {
		setSeres(new SerVivo[max]);
		size = 0;
	}

	public SerVivo[] getSeres() {
		return seres;
	}

	public void setSeres(SerVivo[] seres) {
		this.seres = seres;
	}

	@Override
	public String toString() {
		return "GrupoPorEdad [seres=" + Arrays.toString(seres) + ", size=" + size + "]";
	}
	
}
