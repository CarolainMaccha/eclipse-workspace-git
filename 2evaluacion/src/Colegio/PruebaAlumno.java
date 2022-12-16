package Colegio;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno Carol =new Alumno();//constructor vacio
		Carol.setNombre("Carolain");
		Carol.setApellidos("Maccha");
		Carol.setEdad(26);
		Alumno Carolain=new Alumno("Carolain","Maccha",26);
		Alumno Israel=new Alumno("Israel","Trujillo",30);
		System.out.println("Los datos del primer alumno(a): "+Carol);
		System.out.println("Los datos del segundo alumno(a):"+Israel.toString());
		System.out.println("La alumna Carol y Carolain son la misma persona?");
		System.out.println(Carol.equals(Carolain));
		System.out.println("La alumna Carol e Israel son la misma persona?");
		System.out.println(Carol.equals(Israel));
		System.out.println("La alumna Carol y Carolain tienen el mismo hashcode?");
		System.out.println((Carol.hashCode())==(Carolain.hashCode()));
		System.out.println("La alumna Carol e Israel tienen el mismo hashcode?");
		System.out.println((Carol.hashCode())==(Israel.hashCode()));
		
	}//main

}//class
