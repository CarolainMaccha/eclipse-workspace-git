package ejemploU3CM;

public class PruebaBicicleta {

	public static void main(String[] args) {
		Bicicleta miBicicleta = new Bicicleta(50, 8, 6);
		Bicicleta tuBicicleta = new Bicicleta(50, 7, 9);
		miBicicleta.acelerar();
		tuBicicleta.frenar();
		System.out.println(miBicicleta);
		Bicicleta Bici1=new BicicletaMontaña(15,2,2,0);
		Bicicleta Bici2=new BicicletaTandem(15,2,2,5);
		System.out.println(Bici1+"\n"+Bici2);
	}

}
