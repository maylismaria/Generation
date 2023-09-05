package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class exercicioUmPilha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Stack<String> pilha = new Stack<String>();

		
		System.out.println("          OPÇÕES         "); 
		System.out.println("\n1 - Adicionar o livro na pilha. "); 
		System.out.println("\n2- Listar todos os livros. "); 
		System.out.println("\n3 - Retirar o livro da pilha. ");
		System.out.println("\n0 - Sair. "); 
		
		int opcao;
		String nomeLivro;
		
		
		while (true) {	
			System.out.println("\nEntre com a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao != 0) {	
				
			} if (opcao == 1) {
			System.out.println("\nDigite o nome do livro: ");

			nomeLivro = sc.nextLine();
			pilha.push(nomeLivro);
			System.out.println("\nPilha: \n " + pilha);
			System.out.println("\nLivro adicionado! ");
			
			} else if (opcao == 2) {
			System.out.println("\nLista de livros na pilha: ");
			System.out.println("\n" + pilha);

			} else if (opcao == 3 && pilha.isEmpty() == true) {
			System.out.println("\nA pilha está vazia! ");

			} else if (opcao == 3) {
			pilha.pop();
			System.out.println("Pilha \n" + pilha);
			System.out.println("\n Um livro foi retirado! ");

			} else {
				System.out.println("\nPrograma finalizado!");
				break;

			}
			
		}

	}
		
	}


