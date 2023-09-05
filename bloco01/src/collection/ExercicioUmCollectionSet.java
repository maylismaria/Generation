package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioUmCollectionSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();

		
		
		for (int i =0; i< 10; i++) {
			System.out.println("Digite o °" + (i + 1) + " Número");
			setNumeros.add(sc.nextInt());
		}
		
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		while(isetNumeros.hasNext()) {
			System.out.println("Listar dados do Set" + isetNumeros.next());
		}

		sc.close();
		
	}

}
