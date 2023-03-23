package ejemploU3CM;
/**
 * Una clase heredada de la clase Bicicleta
 * comparte atributos en común más los suyos propios.
 * @version 1.1,23/01/2022
 * @author Carolain Giselle
 */
public class BicicletaTandem extends Bicicleta {
	protected int numAsientos;
/**
 * parametros en común con clase Bicicleta:
 * @param velocidadActual
 * @param platoActual
 * @param piñonActual
 * parametro propio de BicicletaMontaña:
 * @param numAsientos
 */
	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}
	/**
	 * @return Devuelve la clase BicicletaTandem a texto
	 */
	@Override
	public String toString() {
		return  super.toString()+"numAsientos="+numAsientos;
				
	}
	
}
