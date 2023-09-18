package agendamento.controller;

import java.util.ArrayList;
import java.util.stream.Collectors;

import clinica.Menu;
import clinica.model.Especialidade;
import clinica.model.Agendamento;
import clinica.repository.ClinicaRepository;
import clinica.util.Cores;

public class AgendamentoController implements ClinicaRepository{
	
	
	private ArrayList<Agendamento> listaAgendamento = new ArrayList<Agendamento>();
	
	@Override
	public void agendamento(Agendamento agendamento) {
		listaAgendamento.add(agendamento);
		System.out.print( Cores.TEXT_GREEN + "Paciente agendado com sucesso! \n" );
	}

	@Override
	public void listarAgendamento() {
		
		if (listaAgendamento.isEmpty()) {
			System.out.println(Cores.TEXT_YELLOW + "\n      Nenhum agendamento do tipo selecionado");
			System.out.println("\n");
		} else {
		
		for (var agendamento : listaAgendamento) {	
			agendamento.visualizar();		
		  }	
		}
	}
	
	
	@Override
	public void informacoesConsulta() {
		Especialidade.visualizar2();
	}

	@Override
	public void listarAgendamento(int tipo) {
	
		ArrayList<Agendamento> listaFiltrada = new ArrayList<>();
	   
			for (var agendamento : listaAgendamento) {
				if (agendamento.getTipo() == tipo) {
					listaFiltrada.add(agendamento);
				}
			}
			if (listaFiltrada.isEmpty()) {
				System.out.println(Cores.TEXT_YELLOW + "\n        Nenhum agendamento do tipo selecionado");
				System.out.println("\n");
			
			}else {
				for (var agendamento : listaFiltrada) {
					agendamento.visualizar();
				}
			}
		
		} 
			
			
		}	
		
		
			
	

		
	



	
	
	
	


