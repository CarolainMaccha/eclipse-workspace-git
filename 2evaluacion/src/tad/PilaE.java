package tad;

public class PilaE<T> implements Pila<T>{
		protected final static int TAMAÑO_POR_DEFECTO=10;
		protected T[] pila;
		protected int numElementos;
		public PilaE(int tamaño) {
			pila=(T[])new Object[tamaño];
			numElementos=0;
		}
		public PilaE() {
			this(TAMAÑO_POR_DEFECTO);
		}
		@Override
		public boolean push(T o) {
			if(numElementos ==pila.length)return false;
			pila[numElementos]=o;
			numElementos++;
			return true;
		}
		@Override
		public T pop() {
			if(isEmpty())return null;
			numElementos--;
			T res=pila[numElementos];
			pila[numElementos]=null;
			return res;
		}
		@Override
		public boolean isEmpty() {
			return (numElementos==0);
		}
		
		
}


