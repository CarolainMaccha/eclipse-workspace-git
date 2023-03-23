package generico;

public interface Lista<E>{
	public boolean add(E obj);
	public boolean add(int index,E obj);
	public E get(int index);
	public boolean set(int index,E o);
	public boolean remove(int index);
	public boolean isEmpty();
	public int size();
}
