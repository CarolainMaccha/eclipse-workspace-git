package sesion4;

public  class Atleta {
	private String dni;
	private String nombre;
	private int añonacimiento;
	private float altura;/*en cm*/
	private int peso;/*en kg*/
	private boolean estudia;
	private Genero genero;
	//private static Scanner;
	public Atleta () {
		
	}
	
	public Atleta(String dni, String nombre, int añonacimiento, float altura, int peso, boolean estudia,
			Genero genero) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.añonacimiento = añonacimiento;
		this.altura = altura;
		this.peso = peso;
		this.estudia = estudia;
		this.genero = genero;
	}

	public Atleta (String dni,String nombre,int añonacimiento,Genero genero) {
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAñonacimiento() {
		return añonacimiento;
	}
	public void setAñonacimiento(int añonacimiento) {
		this.añonacimiento = añonacimiento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isEstudia() {
		return estudia;
	}
	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", añonacimiento=" + añonacimiento + ", altura=" + altura
				+ ", peso=" + peso + ", estudia=" + estudia + ", genero=" + genero + "]";
	}
	
	
}
