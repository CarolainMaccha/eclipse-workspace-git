package ejresuelto_herencia_programador;

import java.util.Calendar;

public class TestHerencia2 {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33);
		profesor1.setIdProfesor("Prof 22-387-11");
		profesor1.mostrarNombreApellidosYCarnet();
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre
		ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
		System.out.println("El profesor interino 1 se incorporó en la fecha: " + fecha1.getTime().toString() );}

	}

}
