package tad;

public class PilaEstatica implements PilaObjetos {
	protected Object [] pila;
	private final static int TAMAÑO_POR_DEFECTO = 10;
	protected int numElementos;
	
	public PilaEstatica(int n) {
		pila=new Object[n];
		//numElementos=0;
	}
	
	public PilaEstatica() {
		this(TAMAÑO_POR_DEFECTO);
	}
	
	@Override
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		else {
			numElementos--;
			Object res= pila[numElementos];
			pila[numElementos]=null;
			return res;
		}
	}
	
	@Override
	public boolean push(Object o) {
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
