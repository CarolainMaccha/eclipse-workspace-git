package Tema5OOPAvanzado;

public class Circulo  extends Figura  {
	private int radio;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	public double perimetro(){
		return 0;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
