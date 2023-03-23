package Recursividad;

public class Fibonacci {

	public static void main(String[] args) {
		int num=11;
	
		System.out.println(fibonacciIterativa(num));
		System.out.println(fibonacciRecursiva(num));
	
	}
	public static long fibonacciIterativa(int n) {
		if(n==1)return 0;
		if(n==2)return 1;
		long penul=0;
		long ultimo=1;
		long aux;
		for(int cuenta=3;cuenta<=n;cuenta++) {
			aux=penul+ultimo;
			penul=ultimo;
			ultimo=aux;
		}
		return ultimo;
	}
	public static long fibonacciRecursiva(int n) {
		
		
		if(n<3) return n-1;
		return fibonacciRecursiva(n-1)+fibonacciRecursiva(n-2);
	}
}
