package Tema5OOPAvanzado;

public class PruebaFiguras  extends Figura  {

	public static void main(String[] args) {
		Rectángulo r = new Rectángulo(10,5);
		Triángulo t = new Triángulo(5,7);
		Circulo c = new Circulo(4);
		Figura[] figuras= {c,t,r};
		
		for(Figura f:figuras) {
			System.out.println(f.perímetro());
		}

		System.out.printf("%s%n%s%n%s", r, c, t);

	}

}
