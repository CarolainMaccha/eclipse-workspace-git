package generics;

public class PruebaGenericos {

	public static void main(String[] args) {
		//Pair pareja;
		Pareja<Integer> par1=new Pareja<Integer>(3,3);
		Pareja<String> par2=new Pareja<String>("hola","buenas");
		Pareja<String> par3=new Pareja<String> ("hola","buenas");
		
		/*par1.a=3;
		par1.b=5;
		par2.a="hola";
		par2.b="buenas";*/ 
		
		System.out.println(par1);
		System.out.println(par2);
		System.out.println(par3);
	}

}
