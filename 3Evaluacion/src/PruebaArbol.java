
public class PruebaArbol {

	public static void main(String[] args) {
		Arbol<Integer> miArbol=new Arbol<Integer>(10,null,null);
		int[] nums= {5,3,1,10,6,7,2};
		for(int n:nums) {
			miArbol.add(n);
		}
		System.out.println(miArbol);
		System.out.println(miArbol.find(8));
		System.out.println(miArbol.find(6));
		System.out.println(miArbol.depth());
	}
}
