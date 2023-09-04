package arrays;

import java.util.Scanner;

public class ExercicioUmMatriz {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		
		int [] []  matriz = new int [3] [3];
		
		int somaDiagonalPrincipal =0;
		int SomaDiagonalSecundaria = 0;
		
		
		for (int indiceLinha = 0; indiceLinha < matriz.length; indiceLinha++) {
			for (int indiceColuna =0; indiceColuna < matriz.length; indiceColuna++) {
			
			System.out.println("Digite o valor a ser armazenado na posição [" + indiceLinha + "]" + "[" + indiceColuna + "]");
			matriz [indiceLinha] [indiceColuna] = sc.nextInt();
			}
		} 
		
		System.out.println("Elementos da Diagonal principal:");
              for (int i =0; i < matriz.length; i++) {	
            	  
  				System.out.print( matriz[i][i] + " " );
              }
              
         System.out.println("\nElementos da Diagonal secundária: ");
         for (int i =0; i < matriz.length; i++) {
        	 
				System.out.print( matriz[i] [ 2 -i] + " ");  	     	 
         }          
         
         for (int i =0; i < matriz.length; i++) {
        	 
        	 somaDiagonalPrincipal += matriz[i][i];
         }System.out.println("\nA soma dos elementos da digonal principal é:  " + somaDiagonalPrincipal); 
         
           for (int i =0; i < matriz.length; i++) {
            	
            	SomaDiagonalSecundaria += matriz[i] [ 2 - i];
            	
            } System.out.println("A soma dos elementos da digonal secundária é:  " + SomaDiagonalSecundaria); 
            
		sc.close();
		
		
	}

}
