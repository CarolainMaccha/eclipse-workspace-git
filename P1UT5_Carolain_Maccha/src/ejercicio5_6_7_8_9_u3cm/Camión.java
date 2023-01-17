package ejercicio5_6_7_8_9_u3cm;

public class Camión extends Vehículo {
	protected int numCabinas;
	public Camión(int velocidadActual,int numCabinas) {
		super(velocidadActual);
		this.numCabinas=numCabinas;
	}
	
	public int getNumCabinas() {
		return numCabinas;
	}
	public void setNumCabinas(int numCabinas) {
		this.numCabinas = numCabinas;
	}
	@Override
	public String toString() {
		return "Camión [numCabinas=" + numCabinas + ", velocidadActual=" + velocidadActual + "]";
	}
}
