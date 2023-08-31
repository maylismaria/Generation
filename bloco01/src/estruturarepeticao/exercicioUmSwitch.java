package estruturarepeticao;

import java.util.Scanner;

public class exercicioUmSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double valorTotal, preco;
		
		
		System.out.println("      TABELA DE PREÇOS E CÓDIGO       \n");
		System.out.println("Código 1 - Cachorro quente VALOR R$10,00 ");
		System.out.println("Código 2 - X-Salada VALOR R$15,00  ");
		System.out.println("Código 3 - X-Bacon VALOR R$18,00  ");
		System.out.println("Código 4 - Bauru VALOR R$12,00  ");
		System.out.println("Código 5 - Refrigerante VALOR R$8,00");
		System.out.println("Código 6 - Suco de laranja VALOR R$13,00");

		
		System.out.println(" \nDigite o código do produto desejado: ");
		codigo = sc.nextInt();
		if ((codigo <1) || (codigo >6 )) {
			System.out.println(" \nOpçao inválida ");
		} else {
		
		System.out.println(" \nDigite a quantidade do produto desejado: ");
		quantidade = sc.nextInt();
		
		
		switch (codigo) { 
		
		case 1: 
			preco = 10;
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: Cachorro quente" + " VALOR R$ " + valorTotal );	
			break;
			
			
		case 2: 
			preco = 15.00;
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: X-Salada" + " VALOR R$ " + valorTotal );		
			break;
			
		case 3: 
			preco = 18.00; 
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: X-Bacon" + " VALOR R$ " + valorTotal );	
			break;
			
		case 4: 
			preco = 12.00; 
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: Bauru" + " VALOR R$ " + valorTotal );	
			break;	
			
		case 5: 
			preco = 8.00; 
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: Refrigerante" + " VALOR R$ " + valorTotal );	
			break;		
			
		case 6: 
			preco = 13.00; 
			valorTotal = preco * quantidade;
			System.out.println("\n PRODUTO: Suco de laranja" + " VALOR R$ " + valorTotal );	
			break;			
			
		}
		
		}
		
		
		sc.close();
		

		
		
	}

}
