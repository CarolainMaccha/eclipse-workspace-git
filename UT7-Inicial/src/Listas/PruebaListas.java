package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class PruebaListas {
	public static void main(String[] args) {
		String texto = "El bien y el mal se plantean en esta novela desde casi el principio, donde el terror y la intriga vienen a dosis igual de generosas";
		ArrayList<String> palabras = new ArrayList<String>();
		// String [] pals=texto.split("\\W+");
		// palabras.addAll(Arrays.asList(pals));

		palabras.addAll(Arrays.asList(texto.split("[^A-Za-áéíóúÁÉÍÓÚ]+")));// SEPARAR EL TEXTO EN PALABRAS Y ADD A LA
																			// LISTA
		palabras.sort(String.CASE_INSENSITIVE_ORDER);// IGNORAR LAS MAYUSCULAS Y MINUSCULAS Y ORDENARLO

		Set<String> noRepes = new LinkedHashSet<String>();
		noRepes.addAll(palabras);
		/*
		 * for(String pal:palabras) { System.out.println(noRepes.add(pal)+":"+pal); }
		 */ // ver las palabras una a una cual mete cual no TRUE/FALSE

		/*
		 * int i=1; for(String palabra: noRepes) { System.out.println(i++ +
		 * ":"+palabra); }
		 * 
		 * System.out.println(noRepes);
		 */

		/*
		 * for(int i=0;i<palabras.size();i++) {
		 * System.out.println((i+1)+":"+palabras.get(i));//OBTENER ESAS PALABRAS, aviso=
		 * un conjunto no tiene posiciones }
		 */

		
		  System.out.println("Número de palabras: "+palabras.size()); Iterator<String>
		  cursor=noRepes.iterator(); while(cursor.hasNext()) {
		  System.out.println(cursor.next()); }
		 
		ListIterator<String> it = palabras.listIterator(palabras.size());
		String anterior = "";
		while (it.hasPrevious()) {
			String actual = it.previous();
			if (!actual.equals(anterior)) {
				System.out.println(actual + ",");
			}
			anterior = actual;
		}

	}
}
