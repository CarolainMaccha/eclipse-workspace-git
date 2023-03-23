package tad;

import java.util.Arrays;

public class ListaE implements ListaObjetos{
	protected Object lista[];
	protected int numElementos;
	public ListaE(int tamaño) {
		lista=new Object[tamaño];
		//numElementos=0;
	}
	@Override
	public boolean add(Object obj) {
		if(isFull()) return false;
		lista[numElementos]=obj;
		numElementos++;
		return true;
	}

	@Override
	public boolean add(int index, Object obj) {
		if(isFull()) return false;
		if(!(index>=0&&index<numElementos)) return false;
		//mover todos los elementos desde index hacia arriba.
		//bucle que  empiece en numElementos y termine en index+1.
		for(int i=numElementos;i>index;i--) {
			lista[i]=lista[i-1];
		}
		lista[index]=obj;
		numElementos++;
		return true;
	}//add

	@Override
	public Object get(int index) {
		if(index>=0&&index<numElementos)
			return lista[index];
		return null;//false
	}
	public boolean set(int index,Object o) {
		if(index>=0&&index<numElementos) {
			lista[index]=o;
			return true;
		}	
		return false;
	}

	@Override
	public boolean remove(int index) {
		//if(!(index>=0&&index<numElementos)) return false; es lo mismo
		if(index<0||index>=numElementos) return false;
		//desplaza todos los elementos desde index+1 hacia abajo
		//Me desplazo hacia arriba pero 
		for(int i=index+1;i<numElementos;i++) {
			lista[i-1]=lista[i];
		}
		numElementos--;
		lista[numElementos]=null;
		return false;
	}
	public boolean isEmpty() {
		return (numElementos==0);
	}
	public boolean isFull() {
		return (numElementos==lista.length);
	}
	@Override
	public String toString() {
		return Arrays.toString(lista).replace("[", "INICIO >>>").replace("]", ">>> FIN");
	}
	@Override
	public int size() {
		return numElementos;
	}
	
}
