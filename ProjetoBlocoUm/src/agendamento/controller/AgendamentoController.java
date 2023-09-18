package agendamento.controller;

import java.util.ArrayList;

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
		for (var agendamento : listaAgendamento) {	
			agendamento.visualizar();		
		}	
	}

	@Override
	public void informacoesConsulta() {
		Especialidade.visualizar2();
	
	
	}

}

	
	
	
	


