package estruturarepeticao;

import java.util.Scanner;

public class exercicioDoisSwitch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String nomeColaborador;
		int codigo;
		float salario, novoSalario, reajuste;
		
		
		
		System.out.println("      TABELA DE CARGOS       \n");
		System.out.println("Código 1 - Gerente ");
		System.out.println("Código 2 - Vendedor ");
		System.out.println("Código 3 - Supervisor ");
		System.out.println("Código 4 - Motorista  ");
		System.out.println("Código 5 - Estoquista");
		System.out.println("Código 6 - Técnico de TI");
		
		System.out.println(" \nDigite o nome do colaborador: ");
		nomeColaborador = sc.nextLine();
				
		System.out.println(" \nDigite o código do colaborador: ");
		codigo = sc.nextInt();
		if ((codigo <1) || (codigo >6 )) {
			System.out.println(" \nOpçao inválida ");
		} else {
			System.out.println(" \nDigite o salario do colaborador: ");
			salario = sc.nextFloat();
			
			
			switch (codigo) { 
			
			case 1: 
				reajuste =  (float) 0.10 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + "\n Cargo: Gerente" + " \n Novo Sálario R$" + novoSalario );	
				break;
				
			case 2: 
				reajuste =  (float) 0.07 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + "\n Cargo: Vendedor" + "\n Novo Sálario R$" + novoSalario );	
				break;	
				
				
			case 3: 
				reajuste =  (float) 0.09 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + "\n Cargo: Supervisor" + "\n Novo Sálario R$" + novoSalario );	
				break;		
				
			case 4: 
				reajuste =  (float) 0.06 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + " \n Cargo: Motorista" + " \n Novo Sálario R$" + novoSalario );	
				break;		
				
			case 5: 
				reajuste =  (float) 0.05 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + "\n Cargo: Estoquista" + "\n Novo Sálario R$" + novoSalario );	
				break;		
					
			case 6: 
				reajuste =  (float) 0.08 * salario;
				novoSalario = salario + reajuste;
				System.out.println("\n Nome do colaborador: " + nomeColaborador + " Cargo: Técnico" + " Novo Sálario R$" + novoSalario );	
				break;				
				
			}
	
		}
		sc.close();
		}
	}


