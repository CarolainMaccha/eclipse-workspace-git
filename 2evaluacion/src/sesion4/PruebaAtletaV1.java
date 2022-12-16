package sesion4;

import java.util.Scanner;

public class PruebaAtletaV1 {
	
	public static void main(String[] args) {
		//crea el atleta con sus valores y los saca en pantalla
		Scanner sc=new Scanner(System.in);
		System.out.print("Dame DNI: ");
		String dni=sc.nextLine();
		System.out.print("Dame nombre: ");
		String nombre=sc.nextLine();
		System.out.print("dime la edad:");
		int añonacimiento=sc.nextInt();  sc.nextLine();
		System.out.print("dime la altura: ");
		float altura=sc.nextFloat(); sc.nextLine(); 
		System.out.print("dime: el peso: ");
		int peso=sc.nextInt(); sc.nextLine(); 
		System.out.print("dime si estudia (S/N): ");
		String siONo = sc.nextLine();
		boolean estudia;
		if (siONo.toUpperCase().equals("S")) estudia = true;
		else estudia = false;
		System.out.print("dime: tu género (M/F/X): ");
		String generodado=sc.nextLine();
		Genero genero;
		if (generodado.toUpperCase().equals("M")) {genero =Genero.M;}
		else { if (generodado.toUpperCase().equals("F")) {genero = Genero.F;} else {genero=Genero.X;}}
		sc.close();
		Atleta uno = new Atleta(dni,nombre,añonacimiento,altura,peso,estudia,genero);
		System.out.println("uno es: "+uno.toString());

		
	
	}//main
}//class
