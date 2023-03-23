package tad;

public class ColaObjetosE implements ColaObjetos{
	protected Object [] cola;
	protected int numElementos;
	
	public ColaObjetosE(int tamaño) {
		cola=new Object[tamaño];
	}

	@Override
	public boolean add(Object obj) {
		if(numElementos==cola.length) return false;
		cola[numElementos]=obj;
		numElementos++;
		return true;
	}

	@Override
	public Object remove() {
		if(isEmpty()) return null;
		Object res=cola[0];
		for(int i=1;i<numElementos;i++) {
			cola[i-1]=cola[i];
		}
		cola[numElementos-1]=null;
		numElementos--;
		return res;
	}

	@Override
	public boolean isEmpty() {
		return(numElementos==0);
	}

}
