package Impares;
public class ListaD {
	public NodoObj inicio;
	public NodoObj fin;
	protected int tamanyo = 0;

	public ListaD() {
		inicio = fin = null;
	}

	public boolean add(Object obj) {
		NodoObj nuevo = new NodoObj(obj, null);
		if (fin == null) {// si la lista esta vacia crea el NodoObj nuevo
			inicio = fin = nuevo;
		} else {// pone como elto siguiente a NodoObj nuevo
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		tamanyo++;
		return true;
	}

	public String toStringOdds() {
		NodoObj aux = inicio;
		int contador = 1;
		String res = "";
		while (aux != null) {
			if (contador % 2 != 0) {
				res += aux.elemento + ",";
			}
			aux = aux.siguiente;
			contador++;
		}
		return res;
	}
}
