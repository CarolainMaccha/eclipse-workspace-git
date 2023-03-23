package Recursividad;

public class Laberinto {
	protected int[][] tab;

	public Laberinto(int[][] tab) {
		this.tab = tab;
	}

	public String salida(int x, int y) {
		if (x < 0 || y < 0 || x >= tab.length || y>=tab.length)
			return null;
		if (tab[x][y] == 1)
			return null;
		if (tab[x][y] == 5)
			return null;
		if (tab[x][y] == 9)
			return "->(" + x + "," + y + ")";
		String arriba,abajo, derecha, izquierda;
		tab[x][y]=5;
		arriba = salida(y-1,x);
		if (arriba != null)
			return "->(" + x + "," + y + ")" + arriba;

		abajo = salida(y+1,x);
		if (abajo != null)
			return "->(" + x + "," + y + ")" + abajo;

		derecha = salida(y,x-1);
		if (derecha != null)
			return "->(" + x + "," + y + ")" + derecha;

		izquierda = salida(y,x+1);
		if (izquierda != null)
			return "->(" + x + "," + y + ")" + izquierda;
		return null;
	}

	public static void main(String[] arg) {
		int[][] miLaberinto = { 
				{ 0, 0, 0, 0, 0, 1 },
				{ 0, 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0 }, 
				{ 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 1, 0 }, 
				{ 1, 0, 0, 0, 0, 9 }, 
								};
		Laberinto lab = new Laberinto(miLaberinto);
		System.out.println(lab.salida(0, 0));

	}
}
