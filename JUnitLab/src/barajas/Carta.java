package barajas;

import java.util.Objects;

public class Carta {

	private Numero numero;
	private Palo palo;
	
	public Carta(Numero numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return numero == other.numero && palo == other.palo;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	
}
