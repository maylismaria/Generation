package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioUmFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();

		
		System.out.println("          OPÇÕES         "); 
		System.out.println("\n1 - Adicionar cliente à fila. "); 
		System.out.println("\n2- Listar todos os Clientes. "); 
		System.out.println("\n3 - Retirar cliente da fila. ");
		System.out.println("\n0 - Sair. "); 
		
		int opcao;
		
		String nome;
		
		while(true) {
		
			System.out.println("\nEntre com a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();

			
			if (opcao != 0) {
			
			} if (opcao == 1)  {
				System.out.println("\nDigite o nome");
				nome = sc.nextLine();
				fila.add(nome); 
				System.out.println("FILA" + fila);
				System.out.println("\n    Cliente adicionado!    ");	
				
			} else if (opcao == 2) {
				System.out.println("Lista de clientes na fila:" + "\n" + fila  );
				
			} else if (opcao == 3 && fila.isEmpty() == true) {
				System.out.println("\n a lista esta vazia! ");
				
			 } else if (opcao == 3) {	
				fila.remove();
				System.out.println("FILA:" + "\n" + fila  );
				System.out.println("\n   Cliente foi chamado!    ");
				
			} else {
				System.out.println("\n Programa finalizado! ");
				break;
			}
			
		}
		}

	
	

		


		
		
		
	}


