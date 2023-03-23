import java.util.ArrayList;
import java.util.ListIterator;

public class ejemplolistiterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		ListIterator<String> it = al.listIterator(al.size());

		while (it.hasPrevious()) {
			System.out.println(it.previous() + ",");

		}

	}

}
