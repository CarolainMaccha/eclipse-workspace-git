package Impares;
public class PruebaImpares {

	public static void main(String[] args) {
		ListaD lista=new ListaD();
		for(int i=1;i<=10;i++) {
			lista.add(i);
		}
		System.out.println(lista.toStringOdds());
	}

}
