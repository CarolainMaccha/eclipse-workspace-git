package control;

import tad.ColaObjetos;
import tad.ColaObjetosE;
public class PruebaColaObjetos {

	public static void main(String[] args) {
		ColaObjetos cola= new ColaObjetosE(10);//crea un colaobjetose que
		//es una clase objeto de tipo
		//interface ColaObjetos
		for(int i=1;i<=10;i++) {
			cola.add("Elemento"+i);
		}
		while(!cola.isEmpty()) {
			System.out.println(cola.remove());
		}
	}

}
