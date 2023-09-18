package clinica.model;

import clinica.util.Cores;
import java.time.LocalDate;

public class Agendamento {
	
	public Agendamento(int senha, String nome, String cpf, int idade, int tipo, float taxaConsulta) {
		super();
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.tipo = tipo;
		this.taxaConsulta = taxaConsulta;
		
	}
	private int senha;
	private String nome;
	private String cpf;
	private int idade;
	private int tipo;
	public float taxaConsulta;
	
	LocalDate dataAtual = LocalDate.now();
	
	
	public int getNumero() {
		return senha;
	}
	public void setNumero() {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getTaxaConsulta() {
		return taxaConsulta;
	}
	public void setTaxaConsulta(float taxaConsulta) {
		this.taxaConsulta = taxaConsulta;
	}
	
public void visualizar() {
	
	String tipo = "";

	switch (this.tipo) {
	
	case 1: 
		tipo = "Clínico geral";
		taxaConsulta = 100;
	break;
	
	case 2: 
		tipo = "Pediatria";
		taxaConsulta = 80;
	break;


	}
    
	    System.out.println("..........................................................");
		System.out.println("              Dados do agendamento do dia: " + dataAtual);
		System.out.println(".........................................................");
		System.out.println(" PACIENTE SENHA: " + senha);
		System.out.println("              NOME: " + this.nome + "                    ");
		System.out.println("              CPF:" + this.cpf + "                       ");
		System.out.println("              IDADE:" +this.idade + "                 ");
		System.out.println("              ESPECIALIDADE: " + tipo + "                ");
		System.out.println("              VALOR CONSULTA R$:" + taxaConsulta + "        ");
	    System.out.println(".........................................................");
	    
    }

}
