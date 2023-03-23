package ejemploU3CM;
/**
 * Una clase para crear bicicletas con atributos en comun.
 * cada bicicleta a su vez puede ser de montaña o tandem.
 * @version 1.1,23/01/2022
 * @author Carolain Giselle
 */
public class Bicicleta {
	protected int velocidadActual;
	protected int platoActual;
	protected int piñonActual;
	/**
	 * Crea una bicicleta con los parametros:
	 * @param velocidadActual valor de su velocidad
	 * @param platoActual	valor de su plato
	 * @param piñonActual	valor de su piñon
	 */
	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super();
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
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
	/**
	 * Cálculo de acelerar velocidadActual transfoma el valor *2
	 */
	public void acelerar() {
		velocidadActual *= 2;
	}
	/**
	 * Cálculo de frenar velocidadActual transfomar el valor /2
	 */
	public void frenar() {
		velocidadActual /= 2;
	}
	/**
	 *  @param plato es el valor del platoActual
	 */
	public void cambiarPlato(int plato) {
		platoActual = plato;
	}
	/**
	 *  @param piñon es el valor del piñonActual
	 */
	public void cambiarPiñon(int piñon) {
		piñonActual = piñon;
	}
	/**
	 * @return La clase Bicicleta en texto con todos sus atributos.
	 */
	@Override
	public String toString() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}

}
