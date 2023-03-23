package tad;

public class ListaE implements ListaObjetos {

	protected static final int DEFAULT_SIZE = 100;
	protected Object[] lista;
	protected int numElementos;
	
	public ListaE(int maxSize) {
		lista = new Object[maxSize];
		numElementos = 0;
	}
	
	public ListaE() {
		this(DEFAULT_SIZE);
	}
	
	@Override
	public String toString() {
		// return Arrays.toString(lista);
		String res = "[";
		for (int i=0; i<numElementos;i++) {
			res+=lista[i];
			if (i!=(size()-1)) {
				res+=",";
			}
		}
		res += "]";
		return res;
	} // toString
	
	@Override
	public int size() {
		return numElementos;
	}

	@Override
	public boolean add(int pos, Object obj) {
		if (size() == lista.length) return false;
		if (pos<0 || pos>size()) return false;
		for (int i=size(); i>=pos+1; i--) {
			lista[i] = lista[i-1];
		}
		lista[pos] = obj;
		numElementos++;
		return true;
	} // insert

	@Override
	public Object get(int pos) {
		if (pos<0 || pos>=size()) return null;
		return lista[pos];
	} // get

	@Override
	public boolean remove(int pos) {
		if (pos<0 || pos>=size()) return false;
		for (int i=pos; i<(numElementos-1);i++) {
			lista[i] = lista[i+1];
		}
		numElementos--;
		lista[numElementos] = null;
		return true;
	} // remove

	@Override
	public boolean add(Object obj) {
		return add(size(),obj);
	}

	@Override
	public boolean set(int pos, Object obj) {
		if (pos<0 || pos>=size()) return false;
		lista[pos] = obj;
		return true;
	} // set

	@Override
	public boolean isEmpty() {
		return (numElementos==0);
	}
	
	public int indexOf(Object obj) {
		for (int i=0; i<numElementos; i++) {
			if (obj.equals(lista[i])) return i;
		}
		return -1;
	}

} // ListaEstática
