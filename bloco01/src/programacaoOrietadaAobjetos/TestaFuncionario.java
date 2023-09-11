package programacaoOrietadaAobjetos;

import programacaoOrietadaAobjetos.funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		
		funcionario f1 = new funcionario ("Lucas", "Gerente", "(11) 96567282", 1200f, "782.902.020-99");
		funcionario f2 = new funcionario ("Fabiana", "Gerçom", "(11) 96636363", 1200f, "762.626.267-29");

		
		System.out.println("Funcionário 1: " );
		f1.visualizar();
		
		System.out.println("\nFuncionário 2: " );
		f2.visualizar();
		
		
		
		

		
		
		
		
		
	}

}
