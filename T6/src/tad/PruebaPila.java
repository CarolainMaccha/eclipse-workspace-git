package tad;

public class PruebaPila {

	public static void main(String[] args) {
		PilaObjetos pila=new PilaEstatica();
		for(int i =1;i<=10;i++) {
			pila.push(((char)(('A'+i)-1)));
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
	/*con for
	public void meter(int inicio,int fin) {
		
	}
	public void sacar(int inicio,int fin) {
		
	}
	*/

}
