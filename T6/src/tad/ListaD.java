package tad;

public class ListaD implements ListaObjetos {
	protected NodoObj inicio;
	protected NodoObj fin;
	protected int tamanyo = 0;

	public ListaD() {
		inicio = fin = null;
	}

	@Override
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

	@Override
	public boolean add(int index, Object obj) {
		if (index < 0 || index >= size())
			return false;
		NodoObj nuevo = new NodoObj(obj, null);
		if(index==0) {
			nuevo.siguiente=inicio;
			inicio=nuevo;
			tamanyo++;
			return true;
		}
		NodoObj aux = inicio;
		for (int i = 0; i < index-1; i++) {
			aux = aux.siguiente;
		}

		nuevo.siguiente = aux.siguiente;
		aux.siguiente = nuevo;
		tamanyo++;
		return true;
	}

	@Override
	public Object get(int index) {
		if (isEmpty())
			return null;
		NodoObj aux = inicio;
		for (int i = 0; i < index; i++) {
			if (aux.siguiente == null)
				return null;// si el nodo elemento siguiente es nulo no devuelve nada
			aux = aux.siguiente;// va al siguiente nodo
		}
		return aux.elemento;
	}

	@Override
	public boolean set(int index, Object o) {
		if (isEmpty())
			return false;
		NodoObj aux = inicio;
		for (int i = 0; i < index; i++) {// recorre los nodos
			if (aux.siguiente == null)
				return false;// si el nodo elemento siguiente es nulo no devuelve nada
			aux = aux.siguiente;// va al siguiente nodo
		}
		aux.elemento = o;// sustituye el elemento
		return true;
	}

	@Override
	public boolean remove(int index) {
		//comprobamos que la posicion es válida
		if(index<0||index>=size())return false;
	
		//caso de borrar el 1er elemento
		if(index==0) {
		inicio=inicio.siguiente;
		if(inicio==null)fin=inicio;
		tamanyo--;
		return true;
		}
		//caso de borrar un elemento cualquiera
		NodoObj aux = inicio;
		for (int i = 0; i < index-1; i++) {//recorre hasta el anterior a quitar
			aux=aux.siguiente;
		}
		aux.siguiente=aux.siguiente.siguiente;//apunta al elemento sgte del que se quita
		if(aux.siguiente==null)fin=aux;//si el elemento puenteado .siguiente es null entonces es el fin
		tamanyo--;//se compacta
		return true;
	}

	@Override
	public boolean isEmpty() {
		return (inicio == null);
	}

	@Override
	public int size() {
		return tamanyo;
	}

	@Override
	public String toString() {
		String res = "[";
		NodoObj aux = inicio;
		while (aux != null) {
			res += aux.elemento;
			if (aux.siguiente != null) {
				res += ",";
			}
			aux = aux.siguiente;
		}
		return res + "]";

	}

}
