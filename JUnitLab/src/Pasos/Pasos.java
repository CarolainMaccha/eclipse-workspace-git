package Pasos;

public class Pasos {
	protected int numero;
	public Pasos(int num) {
			this.numero=num;
	}
	public String valoracion(){
		String res;
		
		if(this.numero<=1000) {
			res="Lleva una vida sedentaria";
		}
		else {
			if(this.numero<=2000) {
				res="Lleva una vida poco activa";
			}
			else {
				if(this.numero<=4000) {
					res="Se acerca el objetivo";
				}
				else {
					if(this.numero<=6000) {
						res="No está mal";
					}
					else {
						res="Así se hace";
					}
				}
			}
		}
		return res;
	}
	@Override
	public String toString() {
		return "Pasos [numero=" + numero + "]";
	}
}
