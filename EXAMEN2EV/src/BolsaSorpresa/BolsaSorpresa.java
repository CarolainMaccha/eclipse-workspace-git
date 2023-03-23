package BolsaSorpresa;

public class BolsaSorpresa<T> {
	protected T[] objetos;
	protected int tamaño;
	
	@SuppressWarnings("unchecked")
	public BolsaSorpresa(int maxSize) {
		objetos =((T[])new Object[maxSize]);
		tamaño = 0;
	}

	public boolean isEmpty() {
		return (tamaño == 0);
	}

	public boolean isFull() {
		return (tamaño == objetos.length);
	}

	public T getRandom() {
		if(isEmpty())return null;
		int pos = (int) Math.floor(Math.random() * tamaño);
		if (pos < 0 || pos == tamaño)return null;
		else {
			T res =objetos[pos];
			for (int i = pos; i < tamaño-1; i++) {
				objetos[i] = objetos[i + 1];
			}
			objetos[tamaño-1] = null;
			tamaño--;
			return res;
		}
	}

	public boolean put(T obj) {
		if (isFull()) {
			return false;
		} else {
			objetos[tamaño] = obj;
			tamaño++;
			return true;
		}
	}
	public T get(int pos) {
		return objetos[pos];
	}
}
