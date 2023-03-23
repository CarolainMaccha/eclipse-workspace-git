package dinamicas;

public class PilaDinámica<E> implements Pila<E>{
    protected Nodo<E> cima;
    public PilaDinámica() {
    	cima=null;
    }
	@Override
	public E push(E obj) {
		// creamos un nuevo nodo para E
		Nodo<E> nuevo= new Nodo<E>(obj,cima);
		cima=nuevo;
		return obj;
	}//push
	@Override
	public E pop() {
		// caso especial pila vacía
		if(cima==null)return null;
		E resultado=cima.getContenido();
		cima=cima.getSiguiente();
		return resultado;
	}
	@Override
	public boolean isEmpty() {
		return (cima==null);
	}
	@Override 
	public String toString() {
		String res="";
		Nodo<E> cursor=cima;
		while(cursor!=null) {
			res+="|"+cursor.getContenido()+"|\n";
			cursor=cursor.siguiente;
		}
		return res;
		
	}//toString

}//class
