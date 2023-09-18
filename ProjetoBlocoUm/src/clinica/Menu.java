package clinica;

import java.util.ArrayList;
import java.util.Scanner;

import agendamento.controller.AgendamentoController;
import clinica.model.Especialidade;
import clinica.model.Agendamento;
import clinica.util.Cores;

public abstract class Menu {

	public static void main(String[] args) {
		
		AgendamentoController paciente = new AgendamentoController();
		
		Scanner sc = new Scanner (System.in);
		
		
		int opcao = 0, idade = 0, tipo = 0;
		String nome, cpf;
		float taxaConsulta;
		int senha = 1;

		while (true) {
			
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE);

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               CLÍNICA BEM-ESTAR                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Agendamento consulta                 ");
			System.out.println("            2 - Listar agendamentos                  ");
			System.out.println("            3 - Consultar especialidades e valores   ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.print("*****************************************************");
			try {
			System.out.print("\nEntre com a opção desejada:" + "                          ");
			System.out.println(Cores.TEXT_RESET);
			opcao = sc.nextInt(); 
			
			}catch (java.util.InputMismatchException erro1) {
	   			System.out.println(Cores.TEXT_RED + "\nFoi inseridO letras no opção! " + erro1 );
	   			break;
			}
		
		if (opcao == 5) {
			System.out.println("Você saiu do sistema");
			sc.close();
			System.exit(0);
		}
		
		switch (opcao) {
	      
	       case 1:
	    	sc.nextLine();   
	    	System.out.println("\nAGENDAMENTO DA CONSULTA: ");
	        System.out.print("\nNome:" );
	        nome = sc.nextLine();
	   		System.out.print("\nCPF: ");
	   		cpf = sc.next();
	   		
	   		try {
	   		System.out.print("\nIDADE: ");
	   		idade = sc.nextInt();
	   		} catch (java.util.InputMismatchException erro2) {
	   			System.out.println(Cores.TEXT_RED + "AGENDAMENTO NÃO CONCLUIDO" );
	   			System.out.println("Foi inserido letras no campo idade " + erro2 );
				sc.nextLine();
	   			break;
	   		}
	   		
	   		do {
	   			try {
	   			System.out.println("\nDIGITE A ESPECIALIDADE DO PACIENTE (1 - CLÍNICO/ 2 - PEDIATRA)");
	   			tipo = sc.nextInt(); 
	   			} catch ( java.util.InputMismatchException erro3) {
	   				System.out.println(Cores.TEXT_RED + "AGENDAMENTO NÃO CONCLUIDO" );
		   			System.out.println("Foi inserido letras no campo especialidade " + erro3 );
					sc.nextLine();
		   			break;
	   			}
	   			

	   		}while (tipo <1 && tipo >2);
	   		
	   		switch (tipo) {
	   		case 1 : {
	   			paciente.agendamento(new Agendamento(senha++, nome,cpf,idade,tipo,taxaConsulta=0));
	   			break;
	   		}	
	   		 case 2: {
		   			paciente.agendamento(new Agendamento(senha++,nome,cpf,idade,tipo,taxaConsulta=0));
		   			break;
	   		}
	   		 default: 
	   			 System.out.println(Cores.TEXT_RED + "\nOpção inválida! ");
	   		}
	   		break;
		
		case 2:
        	paciente.listarAgendamento();
        	break; 
    	   
       case 3: 
    	   System.out.println("\nINFORMAÇÕES DE ESPECIALIDADES: ");
    	   paciente.informacoesConsulta();
    	   
    	   break;
    	   
    	default:
    		System.out.println(Cores.TEXT_RED + "\nOpção inválida! \n");
		}

		}
		
	}

}
