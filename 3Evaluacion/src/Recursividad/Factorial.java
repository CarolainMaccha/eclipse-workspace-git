package Recursividad;

public class Factorial {

	public static void main(String[] args) {
		int numero=5;
		System.out.println(factorial(numero));

	}
	public static int factorial(int n) {
	 if(n<2) return 1;
	 return n*factorial(n-1);
	}
	/*
	public static int factorial(int n) {
		int num=n;
		for (int i=n-1;i>0;i--) {
			num=num*i;
		}
		return num;
	}
	*/
}
