package heranca;

public class vendedor extends funcionario{
	
	
	private String cargo;
	
	public vendedor(String nome, String telefone, double salario, String cpf, String cargo) {
		super(nome, telefone, salario, cpf);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo: VENDEDOR");
	
	}
	

	
	
	

}
