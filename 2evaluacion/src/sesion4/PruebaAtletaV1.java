package sesion4;

import java.util.Arrays;

public class PruebaAtletaV1 {
	
	public static void main(String[] args) {
		//crea el atleta con sus valores y los saca en pantalla
		Atleta uno=Atleta.deTeclado();
		System.out.println("uno es: "+uno.toString());
		Atleta dos=Atleta.deTeclado();
		System.out.println(dos.toString());
		
	//	Club daw1=new Club();
	//	daw1.addAtleta(Atleta.deTeclado());
	//	daw1.addAtleta(new Atleta(asdsa))
	//	System.out.println(daw1);
		System.out.println(Atleta.numatleta);
		
		
	}//main
}//class
