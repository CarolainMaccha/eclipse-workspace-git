package Club_atletas;

public interface Lista {
	public int size();
	public Object insert(int pos,Object obj);
	public Object get(int pos);
	
	public Object remove(int pos);  
	public Object append(Object obj);
}