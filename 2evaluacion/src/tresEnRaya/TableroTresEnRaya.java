package tresEnRaya;


public class TableroTresEnRaya {
	
	private char [][] tablero;
	
	public TableroTresEnRaya(){
		tablero=new char[3][3];
		rellenaTablero('*');
	}//constructor
	
	@Override
	public String toString() {
		StringBuilder res=new StringBuilder();
		for (int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				res.append(tablero[i][j]);
			}
			res.append("\n");
		}
		return res.toString();
	}
	public void rellenaTablero(char relleno) {
		for (int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j]=relleno;
			}
		}
	}//rellenaTablero
	
	
	
}
