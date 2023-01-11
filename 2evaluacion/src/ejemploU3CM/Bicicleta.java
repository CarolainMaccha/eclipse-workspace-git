package ejemploU3CM;

public class Bicicleta {
 private int velocidadActual;
 private int platoActual;
 private int piñonActual;
 
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

public void acelerar() {
	 velocidadActual*=2;
 }
 public void frenar() {
	velocidadActual/=2;
 }
 public void cambiarPlato(int plato) {
	 platoActual=plato;
 }
 public void cambiarPiñon(int piñon) {
 	piñonActual=piñon;
 }

@Override
public String toString() {
	return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
			+ piñonActual + "]";
}
 
}
