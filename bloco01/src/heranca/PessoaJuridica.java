package heranca;

public class PessoaJuridica extends cliente {

	private String CNPJ;
	
	public PessoaJuridica(String nome, String endereco, String telefone, int idade, String CNPJ) {
		super(nome, endereco, telefone, idade);
		this.CNPJ = CNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + CNPJ);
	}
}
