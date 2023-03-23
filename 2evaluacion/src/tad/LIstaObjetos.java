package tad;

public interface LIstaObjetos {
	public boolean add(Object obj);
	public boolean add(int index,Object obj);
	public Object get(int index);
	public boolean remove(int index);  
	public boolean isEmpty();
}