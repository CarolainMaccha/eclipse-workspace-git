package tad;

public interface ListaObjetos {
	public boolean add(int pos, Object obj);
	public boolean add(Object obj);
	public boolean remove(int pos);
	public Object get(int pos);
	public boolean set(int pos, Object obj);
	public int size();
	public boolean isEmpty();
}
