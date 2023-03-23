package GrupoAlumnos;
import java.util.Arrays;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona[] grupo = new Persona[3];
		Alumno clara = new Alumno("5080F", 2323);
		Persona carlos = new Alumno("5040S", 789);
		Alumno carol = new Alumno("2030F", 323);
		grupo[0] = clara;
		grupo[1] = carlos;
		grupo[2] = carol;
		/* evaluar()
		for (int i = 0; i < grupo.length; i++) {
			System.out.println(((Alumno) grupo[i]).evaluar());
		}
		*/
		System.out.println("Orden sin aplicar Arrays.sort");
		for (int i = 0; i < grupo.length; i++) {
			System.out.println(((Alumno) grupo[i]));
		}

		Arrays.sort(grupo);
		System.out.println("\n");
		System.out.println("Orden aplicando Arrays.sort");
		for (int i = 0; i < grupo.length; i++) {
			System.out.println((Alumno) grupo[i]);
		}
	}

}
