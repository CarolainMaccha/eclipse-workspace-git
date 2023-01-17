package ejercicio5_6_7_8_9_u3cm;

public class BicicletaTandem extends Bicicleta {
	protected int numAsientos;

	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}

	public void acelerar() {
		velocidadActual *= 4;
	}

	@Override
	public String toString() {
		return super.toString() + ",numAsientos=" + numAsientos + "]";

	}

}
