package poo;

public class PruebaPersonaje {

	public static void main(String[] args) {
		final int Num_Personajes = 13;
		Personaje[] piña = new Personaje[Num_Personajes];
		
		piña[0]= new Personaje("Arenita Mejillas","Arenita");
		piña[1] = new Personaje("Calamardo Tentáculos","Calamardo");
		piña[2] = new Personaje();
		piña[2].setNombre("Bob Esponja Pantalones Cuadrados");
		piña[2].setApodo("Bob");
		
		for(Personaje p : piña) {
			if(p==null)break;
			System.out.println(p);
		}
	}

}
