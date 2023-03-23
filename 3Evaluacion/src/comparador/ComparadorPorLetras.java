package comparador;

import java.util.Comparator;

public class ComparadorPorLetras implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		int l1=o1.length();
		int l2=o2.length();
		if(l1==l2)return o1.compareTo(o2);
		return l1-l2;
	}
	
}
