package heranca;

public class PessoaFisica extends cliente {
	
	
	private String CPF;

	
	public PessoaFisica(String nome, String endereco, String telefone, int idade, String CPF) {
		super(nome, endereco,telefone,idade);
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	
	@Override
	public void visualizar() {
		
		super.visualizar();
		System.out.println("CPF: " + CPF);
		
	}
}
