package tad;

public class PilaE<T> implements Pila<T> {
	protected T [] pila;
	private final static int TAMAÑO_POR_DEFECTO = 10;
	protected int numElementos;
	
	public PilaE(int n) {
		pila=(T[])new Object[n];
		//numElementos=0;
	}
	
	public PilaE() {
		this(TAMAÑO_POR_DEFECTO);
	}
	
	@Override
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		else {
			numElementos--;
			T res= pila[numElementos];
			pila[numElementos]=null;
			return res;
		}
	}
	
	@Override
	public boolean push(T o) {
		if(numElementos==pila.length) {
			return false;
		}
		else {
			pila[numElementos]=o;
			numElementos++;
			return true;	
		}
	}

	@Override
	public boolean isEmpty() {
		return (numElementos==0);
	}

}
