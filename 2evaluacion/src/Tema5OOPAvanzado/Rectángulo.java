package Tema5OOPAvanzado;

public class Rectángulo extends Figura {
	protected int base;
	protected int altura;

	public Rectángulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectángulo [base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public double perímetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double aréa() {
		// TODO Auto-generated method stub
		return 0;
	}

}
