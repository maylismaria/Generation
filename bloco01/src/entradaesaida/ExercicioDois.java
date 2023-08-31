package entradaesaida;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digita a primeira nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Digita a segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Digita a terceira nota: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Digita a quarta nota: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		System.out.printf("Média final: %.2f  " , media);

		
		
	
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

		
	}

}
