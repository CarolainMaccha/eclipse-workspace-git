package ejercicio5_6_7_8_9_u3cm;

public abstract class Vehículo{
	protected int velocidadActual;

	public Vehículo(int velocidadActual) {
		super();
		this.velocidadActual = velocidadActual;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public void acelerar() {
		velocidadActual *= 2;
	}

	public void frenar() {
		velocidadActual /= 2;
	}
	
}
