package Dias;

public enum DíaSemana {
	LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

	public static DíaSemana díaEnDías(DíaSemana día, int días) {
		int nuevo = (día.ordinal() + días) % 7;
		DíaSemana nuevoDía = DíaSemana.values()[nuevo];
		/*
		 * final int MAX=DíaSemana.values().length-1;//7 int nuevo=dia.ordinal();
		 * for(int n=1;n<=días;n++){ nuevo++;
		 * 
		 * }
		 * 
		 */
		return nuevoDía;
	}

}
