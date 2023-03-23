
package comparador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//separar en palabras 
public class separar100char {

	public static void main(String[] args) {
		final int LETRAS_POR_LINEA = 100;
		String texto = "¿A estas alturas debes haberlo adivinado: vengo de otro planeta."
				+ " Pero nunca te diré llévame ante tus dirigentes. Ni siquiera yo, poco acostumbrada "
				+ "como estoy a vuestras maneras, cometería tal error. Nosotros también tenemos seres "
				+ "así entre nosotros, hechos de engranajes, trozos de papel, discos pequeños de metal"
				+ " brillante, retazos de telas de colores. No necesito conocer a ninguno más."
				+ "En cambio te diré: Llévame ante tus desayunos, tus puestas de sol, tus malos sueños, "
				+ "tus zapatos, tus sustantivos. Llévame ante tus dedos; ante tus muertes. ";
		ArrayList<String> palabras = new ArrayList<String>();
		String[] pals = texto.split("[^A-Za-áéíóúÁÉÍÓÚ]+");
		palabras.addAll(Arrays.asList(pals));
		// borrar todas las palabras vacias con for
		/*
		for(int pos=0;pos<palabras.size();pos++) {
			if(palabras.get(pos).isBlank()) {
				palabras.remove(pos);
				pos--;
			}
		}*/
		// borrar todas las palabras vacias con iterator
		Iterator<String> it=palabras.iterator();
		while(it.hasNext()) {
			String pal=it.next();
			if(pal.isBlank())it.remove();
		}
		//programacion funcional
		/*
		palabras = palabras.stream()
				.filter((a)-> (!a.isBlank()))
				.toList();*/
		
		// palabras.sort(new ComparadorPorLetras());//(String.CASE_INSENSITIVE_ORDER);//
		// IGNORAR LAS MAYUSCULAS Y MINUSCULAS Y ORDENARLO
		palabras.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int l1 = o1.length();
				int l2 = o2.length();
				if (l1 == l2)
					return o1.compareTo(o2);
				return l1 - l2;
			}
		});

		System.out.println(palabras);
		System.exit(0);

		/*
		 * usamos LinkedHashSet para insertar de la lista ordenada en orden inverso
		 * alfabetico y asi el conjunto recuerde ese orden (orden de insercion)
		 * 
		 * Set<String> noRepes = new LinkedHashSet<String>(); noRepes.addAll(palabras);
		 * System.out.println("Número de palabras: " + noRepes.size());
		 * ListIterator<String> it = palabras.listIterator(palabras.size()); String
		 * anterior = "";
		 * 
		 * while (it.hasPrevious()) { String actual = it.previous(); if
		 * (!actual.equals(anterior)) { System.out.println(actual + ","); } anterior =
		 * actual; }
		 */
		Set<String> noRepes = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER.reversed());
		noRepes.addAll(palabras);
		System.out.println("Número de palabras: " + noRepes.size());

		Iterator<String> cursor = noRepes.iterator();
		int contadorLetras = 0;
		while (cursor.hasNext()) {
			String palabra = cursor.next();
			contadorLetras += palabra.length();

			if (contadorLetras >= LETRAS_POR_LINEA) {
				System.out.println();
				contadorLetras = palabra.length();
			} // if
			System.out.print(palabra + ",");
		} // while

	}// main

}// separar100char
