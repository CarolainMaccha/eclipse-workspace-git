package tad;

public class PruebaPilaE {

	public static void main(String[] args) {
		Pila<Character> pila=new PilaE<Character>();
		for(int i =0;i<10;i++) {
			pila.push(((char)('A'+i)));
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
}
