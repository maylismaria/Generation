package abstracao_interface_heranca_polimorfismo;

import java.util.Optional;

public class Funcionario extends Pessoa implements Gerente, Vendedor {

	
	private double salario;
	private String cpf;
	
	
	public Funcionario (String nome, String endereco, String telefone, int idade, double salario, String cpf) {
		
		super(nome, endereco,telefone, idade);
		this.salario = salario;
		this.cpf = cpf;
		
	}

	@Override
	public void Vendedor() {
		super.visualizar();
		System.out.println("Salario: " + salario);
		System.out.println("CPF: " + cpf);
		System.out.println("Cargo: Vendedor");
		
	}
	@Override
	public void Gerente() {
		super.visualizar();
		System.out.println("Salario: " + salario);
		System.out.println("CPF: " + cpf);
		System.out.println("Cargo: GERENTE");
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

	
	
}
