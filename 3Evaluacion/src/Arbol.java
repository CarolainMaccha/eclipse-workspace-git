
public class Arbol<E extends Comparable<E>> {
	public E elemento;
	public Arbol<E> izquierda;
	public Arbol<E> derecha;

	public Arbol(E elemento, Arbol<E> izquierda, Arbol<E> derecha) {
		super();
		this.elemento = elemento;
		this.izquierda = izquierda;
		this.derecha = derecha;
	}

	public int depth() {
		if (derecha == null && izquierda == null)
			return 1;
		int depthDerecha;
		int depthIzquierda;
		if (derecha == null)
			depthDerecha = 0;
		else
			depthDerecha = derecha.depth();
		if (izquierda == null)
			depthIzquierda = 0;
		else
			depthIzquierda = izquierda.depth();
		return 1 + (Math.max(depthDerecha, depthIzquierda));
		// return (depthDerecha>depthIzquierda)? depthDerecha : depthIzquierda; OTRA
		// MANERA DE PONER ESE RETURN
	}

	public boolean find(E elemento) {
		int comparacion = this.elemento.compareTo(elemento);
		if (comparacion == 0)
			return true;
		if (comparacion > 0) {
			if (izquierda == null)
				return false;
			return izquierda.find(elemento);
		} else {
			if (derecha == null)
				return false;
			return derecha.find(elemento);
		}
	}

	public boolean add(E elemento) {
		if (this.elemento.compareTo(elemento) == 0)
			return false;// si esta repetido el elemento no se inserta.
		if (this.elemento.compareTo(elemento) > 0) {// toca ir por la rama izquierda
			if (izquierda == null) {
				izquierda = new Arbol<E>(elemento, null, null);
				return true;
			}
			return izquierda.add(elemento);// recursividad
		} else {// toca ir por la rama derecha
			if (derecha == null) {
				derecha = new Arbol<E>(elemento, null, null);
				return true;
			}
			return derecha.add(elemento);
		}
	}// add

	public String toString() {
		// return izquierda+" "+elemento+","+ derecha;

		// recorrido pre-order
		String izquierdaStr;
		String derechaStr;
		// rama izquierda
		if (izquierda == null)
			izquierdaStr = ",";
		else
			izquierdaStr = izquierda.toString();
		// rama derecha
		if (derecha == null)
			derechaStr = ",";
		else
			derechaStr = derecha.toString();
		return izquierdaStr + elemento + derechaStr;

	}

}
