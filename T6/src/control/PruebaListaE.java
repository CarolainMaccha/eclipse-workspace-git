package control;

import tad.ListaE;
import tad.ListaObjetos;

public class PruebaListaE {

	public static void main(String[] args) {
		ListaObjetos l=new ListaE(10);
		/*l.add("uno");
		System.out.println(l);
		l.add(0,"dos");
		System.out.println(l);
		System.out.println(l.add(1,"Tres"));//l.add(1,"Tres")
		System.out.println(l)*/
		for(int i=1;i<12;i++) {
			l.add(i);
		}
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		while(!l.isEmpty()) {
			System.out.println(l.size()+":"+l);
			//l.remove(l.size()/2);
			//l.remove(0); like cola
			l.remove(l.size()-1);//like pila
		}
	}

}
