package tad;

/**
 * @author daniel
 *
 */
public class PilaD implements PilaObjetos {
	
	protected NodoObj cima;
	
	@Override
	public Object pop() {
		if(isEmpty()) return null;
		Object res=cima.elemento;
		cima=cima.siguiente;
		return res;
	}

	@Override
	public boolean push(Object o) {
		NodoObj nuevo=new NodoObj(o, cima);
		//nuevo.siguiente=cima;
		cima=nuevo;
		return true;
	}

	@Override
	public boolean isEmpty() {
		return (cima==null);
	}

	@Override
	public String toString() {
		return cima.toString().replaceAll("null", "---");
		/*if(isEmpty()) return "pila vacia";
		String res="";
		NodoObj cursor=cima;
		while(cursor!=null) {
			res+="|"+cursor.elemento+"|\n";
			cursor=cursor.siguiente;
		}
		res+="___";
		return res;*/
	}
	

}
