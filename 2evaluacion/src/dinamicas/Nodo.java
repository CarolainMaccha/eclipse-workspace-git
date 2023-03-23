package dinamicas;

public class Nodo<E> {
	protected E contenido;
	protected Nodo<E> siguiente;
	
	public Nodo(E elemento,Nodo<E>siguiente){
		super();
		this.contenido=elemento;
		this.siguiente=siguiente;
	}
	public E getContenido() {
		return contenido;
	}
	public void setContenido(E elemento){
		this.contenido=elemento;
	}
	public Nodo<E> getSiguiente(){
		return siguiente;
	}
	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente=siguiente;
	}
	//recursividad
	@Override
	public String toString() {
		return "|"+contenido+"|\n"+siguiente;
		
	}//toString

}//Nodo
