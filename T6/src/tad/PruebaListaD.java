package tad;

public class PruebaListaD {

	public static void main(String[] args) {
		ListaObjetos lista = new ListaD();
		//lista.add(10);
		for(int i=1;i<=5;i++) {
			lista.add(i);
			//lista.add(lista.size()/2,i);
			//System.out.println(lista.toString()+lista.size());
		}
		//System.out.println(lista);
		/*for(int pos=0;pos<lista.size();pos++) {
			System.out.println(lista.get(pos));
		}*/
		//System.out.println();
		
		//comprobacion del metodo remove
		lista.remove(0);
		System.out.println(lista);
		lista.remove(lista.size()-1);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		lista.remove(lista.size()-1);
		System.out.println(lista);
		lista.remove(lista.size()-1);
		System.out.println(lista);
		
	
	}

}
