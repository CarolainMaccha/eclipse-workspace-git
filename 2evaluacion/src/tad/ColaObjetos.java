package tad;
// Interfaz para una cola FIFO
public interface ColaObjetos {
	//añade un elemento al final de la cola
	public boolean add(Object obj);
	//extrae el primer elemento de la cola
	public Object remove();

	public boolean isEmpty();
	
}
