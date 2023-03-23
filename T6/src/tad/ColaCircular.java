package tad;

import java.util.Arrays;

public class ColaCircular implements ColaObjetos{
	protected Object[] cola;
	protected int inicio,fin,numElementos;
	public ColaCircular(int tamaño) {
		cola=new Object[tamaño];
		/*numElementos=0;inicio=0;fin=0;*/
	}
	@Override
	public String toString() {
		return Arrays.toString(cola);
	}

	@Override
	public boolean add(Object obj) {
		if(isFull()) return false;
		cola[fin]=obj;
		numElementos++;
		//fin++;
		//if(fin==cola.length) fin=0;
		fin=(fin+1)%cola.length;
		return true;
	}

	@Override
	public Object remove() {
		if(isEmpty()) return null;
		Object res =cola[inicio];
		cola[inicio]=null;
		inicio++;
		if(inicio==cola.length) inicio=0;
		//inicio=(inicio+1)%cola.length;
		numElementos--;
		return res;
	
	}

	@Override
	public boolean isEmpty() {
		return(numElementos==0);
		//return numElementos==0? true : false;
	}
	public boolean isFull() {
		return (numElementos==cola.length);
	}

}
