package ejercicio5_6_7_8_9_u3cm;

public class PruebaBicicleta {

	public static void main(String[] args) {
		Bicicleta miBicicleta = new Bicicleta(60, 8, 6);
		Bicicleta tuBicicleta = new Bicicleta(20, 7, 9);
		miBicicleta.acelerar();
		tuBicicleta.acelerar();
		System.out.println(miBicicleta);
		System.out.println(tuBicicleta.imprime() + "\n");

		Bicicleta Bici1 = new BicicletaMontaña(25, 2, 2, 0);
		Bicicleta Bici2 = new BicicletaTandem(35, 2, 2, 5);
		Bici2.acelerar();
		Bici1.acelerar();
		System.out.println(Bici1 + "\n" + Bici2);
		System.out.println("\n");
		Vehículo lamborghini = new Coche(200, 4, 2);
		Vehículo camiónmercancías = new Camión(140, 2);
		System.out.println(lamborghini);
		System.out.println(camiónmercancías);
	}

}
