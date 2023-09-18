package clinica.repository;

import clinica.model.Especialidade;
import clinica.model.Agendamento;

public interface ClinicaRepository {
	
	public void listarAgendamento();
	public void agendamento(Agendamento agendamento);
	public void informacoesConsulta();
	
}
