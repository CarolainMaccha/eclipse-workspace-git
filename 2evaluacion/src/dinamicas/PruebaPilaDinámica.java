package dinamicas;

public class PruebaPilaDinámica {

	public static void main(String[] args) {
		Pila<String> pila=new PilaDinámica<String>();
		pila.push("Mercurio");
		pila.push("Venus");
		pila.push("La Tierra");
		pila.push("Marte");
		pila.push("Jupiter");
		//System.out.println(pila);
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		System.out.println(pila.pop());

	}//main

}//
