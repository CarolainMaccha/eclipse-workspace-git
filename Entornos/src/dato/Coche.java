package dato;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	private String matricula;
	private Conductor conductor;
	private List<Neumatico> ruedas;
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
		this.ruedas = new ArrayList<Neumatico>();
		for (int i = 0; i < 4; i++) {
			Neumatico n = new Neumatico(i);
			this.ruedas.add(n);
		}
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
}
