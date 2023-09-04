package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioUmCollectionList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i =0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "°" +  " cor: " );
			cores.add(sc.next());
		}
		
		System.out.println("\nListar todas as cores: " + cores);
		
		Collections.sort(cores);
		
		System.out.println("\nOrdernar todas as cores: " + cores);

		
		sc.close();
		
		

	}

}
