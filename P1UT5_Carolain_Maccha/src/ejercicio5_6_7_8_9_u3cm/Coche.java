package ejercicio5_6_7_8_9_u3cm;

public class Coche extends Vehículo {
	protected int numRuedas;
	protected int numAsientos;

	public Coche(int velocidadActual, int numRuedas, int numAsientos) {
		super(velocidadActual);
		this.numRuedas = numRuedas;
		this.numAsientos = numAsientos;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return "Coche [numRuedas=" + numRuedas + ", numAsientos=" + numAsientos + ", velocidadActual=" + velocidadActual
				+ "]";
	}
}
