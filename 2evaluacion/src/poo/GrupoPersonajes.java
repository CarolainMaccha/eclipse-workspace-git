package poo;

import java.util.Arrays;

public class GrupoPersonajes {
	private final static int DEFAULT = 20;
	private Personaje[] grupo;

	public GrupoPersonajes(int n) {
		grupo = new Personaje[n];
	}

	public GrupoPersonajes() {
		this(DEFAULT);
	}

	public boolean addPersonaje(Personaje P) {
		for (int aux = 0; aux < grupo.length; aux++) {
			if (grupo[aux] == null) {
				grupo[aux] = P;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(grupo);
	}
}
