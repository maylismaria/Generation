package heranca;

public class funcionario {
	
	
	private String nome;
	private String telefone;
	private double salario;
	private String cpf; 

	public funcionario(String nome, String telefone, double salario, String cpf) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.salario = salario;
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Salário: " +"R$ " + salario);
		System.out.println("CPF: " + cpf);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
