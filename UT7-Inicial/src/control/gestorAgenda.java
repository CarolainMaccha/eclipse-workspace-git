package control;

import java.util.Scanner;

import modelo.Agenda;
import modelo.Contacto;

public class gestorAgenda {
	private static Scanner entrada = new Scanner(System.in);
	private static Scanner entrada2 = new Scanner(System.in);
	private static Scanner entrada3 = new Scanner(System.in);
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
	
		int opción;
		while ( (opción=menúPrincipal(!agenda.vacía()))!= 0) {
			switch (opción) {
			case 1:
				System.out.println(agenda.listaContactos());
				break;
			case 2:
				Contacto nuevo = Contacto.deTeclado(entrada);
				if (nuevo!=null) agenda.añadeContacto(nuevo);
				break;
		
			case 3: 
				System.out.println("Dime el nombre del contacto a reemplazar:");
				String nomantiguo=entrada2.nextLine();
				Contacto metenuevo = Contacto.deTeclado(entrada);
				agenda.reemplazaContacto(nomantiguo, metenuevo);
				break;
			case 4:
				System.out.println("Dime el nombre del contacto a borrar:");
				String nombre=entrada3.nextLine();
				agenda.borraContacto(nombre); 
			    break;
			}	
		}
		System.out.println("Bye bye ...");
	} // main
	
	public static int menúPosición(int maxPosición) {
		int pos;
		do {
			pos = dameEntero("Dime posición entre 1 y " + maxPosición + ": ");
		} while (pos<=0 || pos > maxPosición);
		return pos;
	} // menúPosición
	
	public static int menúPrincipal(boolean opciónBorrar) {
		final int MAX_OPTION = 4;
		int opción;
		String textoMenú = "MENÚ PRINCIPAL:\n"
				+ "0. SALIR\n"
				+ "1. LISTAR CONTACTOS\n"
				+ "2. NUEVO CONTACTO\n"
				+ "3. REEMPLAZAR CONTACTOS\n";
		if (opciónBorrar) {
			textoMenú += "4. BORRAR CONTACTO\n";
		}
		// Pide opción hasta que de una válida:
		do {
			System.out.println(textoMenú);
			opción = dameEntero("Entre opción: ");
		} while( opción<0 || opción > MAX_OPTION);
		return opción;
	} // menúPrincipal
	
	public static int dameEntero(String prompt) {
		int opción;
		String input;
		do {
			System.out.print(prompt);
			input = entrada.nextLine();
			try {
				opción = Integer.parseInt(input);
			}
			catch(Exception e) {
				opción = -1;
			}
		} while (opción<0);
		return opción;
	} // dameEntero

} // class
