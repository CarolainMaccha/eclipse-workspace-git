package ejercicio5_6_7_8_9_u3cm;

public class BicicletaMontaña extends Bicicleta {
	protected int suspension;

	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}

	public void acelerar() {
		velocidadActual *= 3;
	}

	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return super.toString() + ",suspension=" + suspension + "]";

	}

}
