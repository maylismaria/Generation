package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDoisCollectionList {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner (System.in); 
		
		Integer numeroDigitado;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite um número:");
		numeroDigitado = sc.nextInt();
		
		System.out.println ("O número " + numeroDigitado + " Está localizado na posição: " +  numeros.indexOf(numeroDigitado) );










		
		
		
		
		
		
		sc.close();

		
		
	}

}
