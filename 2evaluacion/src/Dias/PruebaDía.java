package Dias;

public class PruebaDía {

	public static void main(String[] args) {
		DíaSemana hoy= DíaSemana.MIÉRCOLES;
		
		//Paso a entero
		System.out.println(hoy.ordinal());
		//¿Cómo paso de entero a enum?
		
		DíaSemana futuro=DíaSemana.díaEnDías(hoy,100);
		System.out.println(futuro);
		int numDías=100;
		System.out.printf("Dentro de %d días es:%s",numDías,futuro);
		
		
	}//main

}//class
