package clinica.repository;

import clinica.model.Especialidade;
import clinica.model.Agendamento;

public interface ClinicaRepository {
	
	public void listarAgendamento();
	public void listarAgendamento(int tipo);
	public void agendamento(Agendamento agendamento);
	public void informacoesConsulta();
	
}
