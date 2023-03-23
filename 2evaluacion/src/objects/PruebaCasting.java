package objects;

public class PruebaCasting {

	public static void main(String[] args) {
		Object [] cosas= new Object[10];
		cosas[0]="hola";
		cosas[1]=4;
		cosas[2]=5.4;
		cosas[3]='a';
		cosas[4]=new StringBuilder("pepa");
		for(int i=0;i<cosas.length;i++) {
			if(cosas[i] instanceof String) {
			cosas[i]=(((String) cosas[i]).toUpperCase());
			}
			System.out.println(cosas[i]);
		}
		
	}

}
