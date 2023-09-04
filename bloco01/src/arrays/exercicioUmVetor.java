package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioUmVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		int vetorInteiro [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		int num;	
		Arrays.sort(vetorInteiro);

		
		System.out.println("Digite o número que voce deseja encontrar:");
		num = sc.nextInt();
		
		
        int posicao = Arrays.binarySearch(vetorInteiro , num);
        
        
        if (posicao >= 0 ) {
        	System.out.println("O número " + num + "Foi encontrado na posicao: "+ posicao);
        	
        } else {
    		System.out.println("Número nao encontrado");
        	
        }

		sc.close();
		
		}
		
	}


