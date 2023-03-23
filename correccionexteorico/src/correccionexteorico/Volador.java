package correccionexteorico;

public interface Volador {

	 default void volar() { System.out.println("vuelo"); }

	  void aterrizar();

	}