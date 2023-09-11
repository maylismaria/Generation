package programacaoOrietadaAobjetos;

public class funcionario {
	
	
	private String nome;
	private String cargo;
	private String telefone;
	private double salario;
	private String cpf; 
	
	public funcionario(String nome, String cargo, String telefone, double salario, String cpf) {
		this.nome = nome;
		this.cargo = cargo;
		this.telefone = telefone;
		this.salario = salario;
		this.cpf = cpf;
		
	}
	
	public void visualizar() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
