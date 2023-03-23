package dato;

public class Conductor extends Persona {
	private String tipoPermiso;

	public Conductor(String nombre, int edad, String tipoP) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.tipoPermiso = tipoP;
	}

	public String getTipoPermiso() {
		return tipoPermiso;
	}

	public void setTipoPermiso(String tipoPermiso) {
		this.tipoPermiso = tipoPermiso;
	}
	
	public void conducir(Coche c) {
		c.setConductor(this);
	}
}
