package abstracao_interface_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestaFuncionario {

	public static void main(String[] args) {
		
        List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario Funcionario1 = new Funcionario ("Lucas", "Rua camppos", "(11) 96567282", 55,  1200f, "782.902.020-99");
        funcionarios.add(Funcionario1);
		Optional<Funcionario> checaFun1 = Optional.ofNullable(Funcionario1);
		if (checaFun1.isPresent()) {
			 Funcionario1.Gerente();
			System.out.println("************************************************************\n");

		} else {
			System.out.println("Funcionário 1 está vazio");
	}
		Funcionario Funcionario2 = new Funcionario ("Pedro", "Rua alba", "(11) 983748949", 30, 1200f, "987.873.657-88");
		funcionarios.add(Funcionario2);
		Optional<Funcionario> checaFun2 = Optional.ofNullable(Funcionario2);
		if (checaFun2.isPresent()) {
		System.out.println("FUNCIONÁRIO 2: ");
		Funcionario2.Gerente();
		System.out.println("************************************************************\n");
		} else {
			System.out.println("Funcionário 2 está vazio");
		}
		

		Funcionario Funcionario3 = new Funcionario ("Marcia", "Rua balades", "(11) 965383002",20, 1500f, "987.942.900-09");
		funcionarios.add(Funcionario3);
		Optional<Funcionario> checaFun3 = Optional.ofNullable(Funcionario3);
		if (checaFun3.isPresent()) {
		System.out.println("FUNCIONÁRIO 3: ");
		Funcionario3.Vendedor();
		System.out.println("************************************************************\n");
		} else {
			System.out.println("Funcionário 3 está vazio");
		}
		
		Funcionario Funcionario4 = new Funcionario ("Maria", "Rua 25 de março", "(11) 95262290", 23, 1500f, "780.672.469-77");
		funcionarios.add(Funcionario4);
		Optional<Funcionario> checaFun4 = Optional.ofNullable(Funcionario4);
		if (checaFun4.isPresent()) {
		System.out.println("FUNCIONÁRIO 4: ");
		Funcionario4.Vendedor();
		System.out.println("************************************************************\n");
		}

		Funcionario Funcionario5  = null;
		Optional<Funcionario> checaNullo = Optional.ofNullable(Funcionario5);
		if (checaNullo.isPresent()) {
			 Funcionario5.Vendedor();
		} else 
			System.out.println("Funcionário 5 está vazio");
		
		
		List<Funcionario> funcionariosFiltrados = funcionarios.stream()
	            .filter(funcionario -> funcionario.getIdade() > 25)
	            .collect(Collectors.toList());
		
		System.out.println("\nFUNCIONÁRIOS COM IDADE MAIOR QUE 25 ANOS:");

		for (Funcionario funcionario : funcionariosFiltrados) {
	        System.out.println("\n" +funcionario.getNome() + " " + funcionario.getIdade() + " anos");
	    }
	}

	
}

