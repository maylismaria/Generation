package abstracao_interface_heranca_polimorfismo;

import java.util.Scanner;

public class Cliente extends Pessoa implements PessoaFisica, PessoaJuridica{

	private String ID;
	
	Scanner sc = new Scanner(System.in);
	
	public Cliente (String nome, String endereco, String telefone, int idade, String ID ) {
		super(nome,endereco, telefone, idade);
		this.ID = ID;	
		
	
	}
	
	@Override
	public void pj() {
		super.visualizar();
		System.out.println("CNPJ: " + ID);
	}
	@Override
	public void pf() {
		super.visualizar();
		System.out.println("CPF: " + ID);
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
}
