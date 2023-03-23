package ejemploU3CM;
/**
 * Una clase heredada de la clase Bicicleta
 * comparte atributos en común más los suyos propios.
 * @version 1.1,23/01/2022
 * @author Carolain Giselle
 */
public class BicicletaMontaña extends Bicicleta {
	protected int suspension;
/**
 * parametros en común con clase Bicicleta:
 * @param velocidadActual
 * @param platoActual
 * @param piñonActual
 * parametro propio de BicicletaMontaña:
 * @param suspension
 */
	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}
/**
 * Cálculo de cambiar el valor de suspension.
 * @param suspension valor que se cambia a suspension
 */
	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}
/**
 * @return Devuelve la clase BicicletaMontaña a texto
 */
	@Override
	public String toString() {
		return  super.toString()+"suspension="+suspension;
				
	}
	
}
