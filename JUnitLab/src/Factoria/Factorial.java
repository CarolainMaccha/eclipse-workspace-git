package Factoria;

public class Factorial {
	
	public long factorial(int numero) {
		long resultado = 1;
		for(int i = 2; i <= numero; i++)
			resultado = resultado * i;
		return resultado;
	}

	public static void  main(String []args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorial(21));
	}
}
