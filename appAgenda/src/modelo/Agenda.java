package modelo;

import tad.ListaE;

public class Agenda {
	protected static final int TAMAÑO_POR_DEFECTO = 100;

	protected ListaE contactos;
	protected int numElementos;

	public Agenda(int tamaño) {
		contactos = new ListaE(tamaño);
		numElementos = 0;
	}

	public Agenda() {
		this(TAMAÑO_POR_DEFECTO);
	}

	public int numContactos() {
		return contactos.size();
	}

	public boolean vacía() {
		return contactos.isEmpty();
	}

	public String listaContactos() {
		return contactos.toString();
	}

	public boolean añadeContacto(Contacto c) {
		return contactos.add(c);
	}

	public boolean borraContacto(int posición) {
		return contactos.remove(posición);
	}

	public boolean reemplazaContacto(int posición, Contacto c) {
		return contactos.set(posición, c);
	}

	public ListaE getContacto(int posición) {
		return (ListaE) contactos.get(posición);
	}

	// busca contacto devolviendo la posición donde lo encuentra o -1
	public int buscaContacto(Contacto c) {
		return contactos.indexOf(c);
	}

}
