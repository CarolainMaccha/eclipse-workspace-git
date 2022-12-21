package hlf;

public class Tablero {
	int espacioJuego;
	private char tablero[][];

	public Tablero(int espacio, char naruto) {
		tablero = new char[espacio][espacio];
		rellenaTablero(naruto);
	}

	private void rellenaTablero(char caracter) {
		for (int aux = 0; aux < tablero.length; aux++) {
			for (int aux2 = 0; aux2 < tablero[aux].length; aux2++) {
				tablero[aux][aux2] = caracter;
			}
		}
	}

	public char getCasilla(int ancho, int alto) {
		return tablero[ancho][ancho];
	}

	public void setCasilla(int ancho, int alto, char cambio) {
		tablero[ancho][alto] = cambio;
	}

	@Override
	public String toString() {
		String res = "";

		for (int aux = 0; aux < tablero.length; aux++) {
			for (int aux2 = 0; aux2 < tablero[aux].length; aux2++) {
				res += tablero[aux][aux2];
				if (aux2 != (tablero[aux].length - 1)) {
					res += " , ";
				}
			}
			res += "\n";
		}
		return res;
	}
}