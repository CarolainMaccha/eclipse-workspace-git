package barajas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baraja {

	private ArrayList<Carta> cartas;
	private int indice=0;
	
	public Baraja() {
	
		cartas = new ArrayList<Carta> ();
		for(Palo palo:Palo.values())
			for(Numero numero:Numero.values()) {
				Carta carta = new Carta(numero,palo);
				cartas.add(carta);
			}
		
	}
	public void barajar() {
		Collections.shuffle(cartas);
		mostrar();
		 
	}
	public String siguienteCarta() {
		if(cartas.isEmpty()||indice >= cartas.size())return "No hay cartas";
		Carta carta= cartas.get(indice);
		indice++;
		return carta.toString();
		 
	}
	public String cartasDisponibles() {
		return "Quedan: " + (cartas.size() - indice) + " cartas";
		}
	
	
	public void mostrar() {
		for(Carta carta:cartas)
			System.out.println(carta);
	}
	
	public static void main(String [] args) {
		Baraja baraja = new Baraja();
		baraja.mostrar();
		//baraja.barajar();
		System.out.println(baraja.siguienteCarta());
	}
}
