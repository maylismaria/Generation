package abstracao_interface_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import heranca.cliente;

public class TestaCliente {

	public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

		Scanner sc = new Scanner (System.in);
		
        Cliente Cliente1 = new Cliente ("Jose da Silva", "Rua alba", "(11) 934467068", 32, "023.456.787-00"  );
        clientes.add(Cliente1);
		Optional<Cliente> checaFun1 = Optional.ofNullable(Cliente1);
		
		if (checaFun1.isPresent()) {
			System.out.println("Cliente 1:");
			Cliente1.pf();
			System.out.println("************************************************************\n");

		} else {
			System.out.println("Cliente 1 está vazio");
	}
		
		Cliente Cliente2 = new Cliente ("Mario gomes", "Rua alfredo", "(11) 998902029", 66, "889.566.988-20"  );
        clientes.add(Cliente2);
		Optional<Cliente> checaFun2 = Optional.ofNullable(Cliente2);

        if (checaFun2.isPresent()) {
			System.out.println("Cliente 2:");
			Cliente2.pf();
			System.out.println("************************************************************\n");
			
		} else {
			System.out.println("Cliente 2 está vazio");
		}
        
        
		Cliente Cliente3 = new Cliente ("Maria costa", "Rua estrela", "(21) 965758599", 32, "12.345.678/0001-90"   );
        clientes.add(Cliente3);
		Optional<Cliente> checaFun3 = Optional.ofNullable(Cliente3);
		
		 if (checaFun3.isPresent()) {
				System.out.println("Cliente 3:");
				Cliente3.pj();
				System.out.println("************************************************************\n");
				
			} else {
				System.out.println("Cliente 3 está vazio");
			}


		Cliente Cliente4 = new Cliente("floriano peixoto", "Rua 25 de março", "(31) 97839308", 55, "98.655.876/0001-80"   );
        clientes.add(Cliente4);
		Optional<Cliente> checaFun4 = Optional.ofNullable(Cliente4);
		
		if (checaFun4.isPresent()) {
			System.out.println("Cliente 4:");
			Cliente4.pj();
			System.out.println("************************************************************\n");
			
		} else {
			System.out.println("Cliente 4 está vazio");
		}
		
		Cliente Cliente5  = null;
		Optional<Cliente> checaNullo = Optional.ofNullable(Cliente5);
		if (checaNullo.isPresent()) {
			 Cliente5.pj();
		} else 
			System.out.println("Cliente 5 está vazio");



			List<Cliente> clientefiltrado = clientes.stream()
					.filter(cliente -> cliente.getNome().startsWith("M"))
					.collect(Collectors.toList());
			
			System.out.println("\nCLIENTES CUJO NOME COMEÇA COM A LETRA M ");
	
			for (Cliente cliente : clientefiltrado) {
	            System.out.println("\n" + cliente.getNome());
	            
		    }
			
		}
}
