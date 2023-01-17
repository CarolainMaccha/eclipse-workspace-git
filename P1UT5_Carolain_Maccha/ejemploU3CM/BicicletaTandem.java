package ejemploU3CM;

public class BicicletaTandem extends Bicicleta {
	protected int numAsientos;

	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}
	@Override
	public String toString() {
		return  super.toString()+"numAsientos="+numAsientos;
				
	}
	
}
