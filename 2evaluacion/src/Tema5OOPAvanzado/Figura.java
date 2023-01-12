package Tema5OOPAvanzado;

public abstract class Figura {
	private int posX,posY;
	public Figura() {
		
	}
	public Figura(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public abstract double perímetro();

	public abstract double aréa();

	@Override
	public String toString() {
		return "Soy una figura";
	}

}
