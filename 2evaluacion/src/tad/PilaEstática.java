package tad;

public class PilaEstática implements PilaDeObjetos{
	protected final static int TAMAÑO_POR_DEFECTO=10;
	protected Object[] pila;
	protected int numElementos;
	public PilaEstática(int tamaño) {
		pila=new Object[tamaño];
		numElementos=0;
	}
	public PilaEstática() {
		this(TAMAÑO_POR_DEFECTO);
	}
	@Override
	public boolean push(Object o) {
		if(numElementos ==pila.length)return false;
		pila[numElementos]=o;
		numElementos++;
		return true;
	}
	@Override
	public Object pop() {
		if(isEmpty())return null;
		numElementos--;
		Object res=pila[numElementos];
		pila[numElementos]=null;
		return res;
	}
	@Override
	public boolean isEmpty() {
		return (numElementos==0);
	}
	
	
}
