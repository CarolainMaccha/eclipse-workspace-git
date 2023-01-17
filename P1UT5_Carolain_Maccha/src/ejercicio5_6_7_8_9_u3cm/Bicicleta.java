package ejercicio5_6_7_8_9_u3cm;

public class Bicicleta extends Vehículo implements Imprimible {
	protected int platoActual;
	protected int piñonActual;

	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super(velocidadActual);
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}

	public int getPlatoActual() {
		return platoActual;
	}

	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	public int getPiñonActual() {
		return piñonActual;
	}

	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}

	public void cambiarPlato(int plato) {
		platoActual = plato;
	}

	public void cambiarPiñon(int piñon) {
		piñonActual = piñon;
	}

	@Override
	public String toString() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}

	@Override
	public String imprime() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}

}
