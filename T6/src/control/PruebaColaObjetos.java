package control;

import tad.ColaCircular;
import tad.ColaObjetos;
//import tad.ColaObjetosE;

public class PruebaColaObjetos {

	public static void main(String[] args) {
		ColaObjetos cola=new ColaCircular(10);
		//meto 19 elementos
		for(int i=1;i<=19;i++) {
			cola.add(i); 
		}
		//saco 5 elementos
		for(int i=1;i<=5;i++) {
			System.out.println(cola.remove());  
		}
		System.out.println(cola);
		//meto 9
		for(int i=11;i<=19;i++) {
			cola.add(i); 
		}
		//saco todos
		while(!cola.isEmpty()) {
			System.out.println(cola.remove());
			System.out.println(cola);
		}

	}

}
