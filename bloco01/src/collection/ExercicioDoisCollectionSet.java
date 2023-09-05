package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioDoisCollectionSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer numeroDigitado;
		
		Set<Integer> setInteiros = new HashSet<Integer>();
		
		setInteiros.add(2);
		setInteiros.add(5);
		setInteiros.add(1);
		setInteiros.add(3);
		setInteiros.add(4);
		setInteiros.add(9);
		setInteiros.add(7);
		setInteiros.add(8);
		setInteiros.add(10);
		setInteiros.add(6);
		
		System.out.println("Digite um número: ");
		numeroDigitado = sc.nextInt();
		
		if (setInteiros.contains(numeroDigitado) == true) {
		
		System.out.println ("O número " + numeroDigitado + " foi encontrado! " );

		} else {
			System.out.println ("O número " + numeroDigitado + " não foi encontrado! " );

		}
	}

}
