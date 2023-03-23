package Factoria;

public class Persona {
	
	private int edad;
	
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public boolean esMayorEdad() {
		assert edad >= 0;
		return edad >= 18;
	}

}
