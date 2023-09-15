package abstracao_interface_heranca_polimorfismo;

import java.util.Optional;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario Funcionario1 = new Funcionario ("Lucas", "Rua camppos", "(11) 96567282", 55,  1200f, "782.902.020-99");
		System.out.println("FUNCIONÁRIO 1: ");
		Funcionario1.Gerente();
		
		System.out.println("************************************************************");
		
		Funcionario Funcionario2 = new Funcionario ("Pedro", "Rua alba", "(11) 983748949", 30, 1200f, "987.873.657-88");
		System.out.println("FUNCIONÁRIO 2: ");
		Funcionario2.Gerente();

		System.out.println("************************************************************");

		Funcionario Funcionario3 = new Funcionario ("Luisa", "Rua balades", "(11) 965383002",20, 1500f, "987.942.900-09");
		System.out.println("FUNCIONÁRIO 3: ");
		Funcionario3.Vendedor();
		
		System.out.println("************************************************************");
		
		
		Funcionario Funcionario4 = new Funcionario ("Maria", "Rua 25 de março", "(11) 95262290", 23, 1500f, "780.672.469-77");
		System.out.println("FUNCIONÁRIO 4: ");
		Funcionario4.Vendedor();
		
		System.out.println("************************************************************");

		// Exercicio com Optional
		
		Funcionario Funcionario5  = null;
		
		Optional<Funcionario> checaNullo = Optional.ofNullable(Funcionario5);
		if (checaNullo.isPresent()) {
			 Funcionario5.Vendedor();
		} else 
			System.out.println("Funcionário 5 está vazio");

	}

}
