package modelo;
import java.util.LinkedHashSet;
import java.util.Set;

public class Agenda {
	protected Set<Contacto> contactos;
	//protected int numElementos;

	public Agenda() {
		contactos = new LinkedHashSet<Contacto>();
		//numElementos = 0;
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

	public boolean borraContacto(String nombre) {
		Contacto c1=new Contacto(nombre,null);
		return contactos.remove(c1);
	}

	public boolean reemplazaContacto(String nomantiguo, Contacto c2) {
		Contacto c1=new Contacto(nomantiguo,null);
		return  contactos.remove(c1) && contactos.add(c2);
	}
    /* con un objeto no podemos hacer un get porque contains devuelve booleano
	public Contacto getContacto(int posición) {
		return contactos.get(posición);
	}
     */

}
