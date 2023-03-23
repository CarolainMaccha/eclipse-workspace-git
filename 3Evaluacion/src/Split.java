import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String s1 = "Welcome to Baeldung";
		String [] arr1 =s1.split("");
		System.out.print(Arrays.toString(arr1));
		System.out.println();
		
		String s2 = "Welcome to Baeldung";
		String [] arr2 =s2.split(" ",2);
		System.out.print(Arrays.toString(arr2));
	}
}
