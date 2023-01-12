package Tema5OOPAvanzado;

public abstract class PruebaFiguras  extends Figura  {

	public static void main(String[] args) {
		Rectángulo r = new Rectángulo(10,5);
		Triángulo t = new Triángulo(5,7);
		Circulo c = new Circulo(4);
		Figura[] figuras= {c,t,r};

		System.out.printf("%s%n%s%n%s", r, c, t);
		for(Figura f:figuras) {
			System.out.println(f.perímetro());
		}
	}



}
