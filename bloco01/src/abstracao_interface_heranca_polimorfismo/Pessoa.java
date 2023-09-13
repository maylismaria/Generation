package abstracao_interface_heranca_polimorfismo;

public abstract class Pessoa {
	
	
	private String nome;
	private String telefone;
	private String endereco;
	private int idade;
	
	
	public Pessoa(String nome, String endereco, String telefone, int idade ){
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		
	}
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);


		
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
	
	
	

}
