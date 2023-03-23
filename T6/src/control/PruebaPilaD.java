package control;

import tad.PilaD;
import tad.PilaObjetos;

public class PruebaPilaD {

	public static void main(String[] args) {
		PilaObjetos pila=new PilaD();//PilaDinámica
		for(int i =1;i<=10;i++) {
			pila.push(((char)(('A'+i)-1)));
		}
		/*while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}*/
		System.out.println(pila);
	}
	/*con for
	public void meter(int inicio,int fin) {
		
	}
	public void sacar(int inicio,int fin) {
		
	}
	*/

}
