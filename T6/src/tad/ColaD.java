package tad;

public class ColaD implements ColaObjetos{
	protected NodoObj inicio;
	protected NodoObj fin;
	public ColaD() {
		//inicio=null;
		//fin=null;
		//inicio=fin=null;
	}
	@Override
	public boolean add(Object obj) {
		NodoObj nuevo= new NodoObj(obj, null);
		if(isEmpty()) {
			inicio=fin=nuevo;
		}
		else {
			//el último nodo pasa a apuntar al nuevo.
			fin.siguiente=nuevo;
			//el nuevo nodo es el nuevo final de cola.
			fin=nuevo;
		}
		
		return true;
	}
	@Override
	public String toString() {
		String res="";
		NodoObj cursor=inicio;
		res+="[";
		while(cursor!=null) {
			res+=cursor.elemento+" ";
			cursor=cursor.siguiente;
		}
		res+="]";
		return res;
		
	}

	@Override
	public Object remove() {
		if(isEmpty()) return null;
		Object res=inicio.elemento;
		inicio=inicio.siguiente;
		if(inicio==null) fin=null;
		return res;
	}

	@Override
	public boolean isEmpty() {
		return (inicio==null);
	}

}