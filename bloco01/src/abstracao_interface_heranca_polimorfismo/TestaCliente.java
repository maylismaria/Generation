package abstracao_interface_heranca_polimorfismo;


public class TestaCliente {

	public static void main(String[] args) {

		
        Cliente Cliente1 = new Cliente ("Jose da Silva", "Rua alba", "(11) 934467068", 32, "023.456.787-00"  );
		System.out.println("Cliente 1:");
		Cliente1.pf();
		
        System.out.println("\n*******************************************************************");
		
		Cliente Cliente2 = new Cliente ("Mario gomes", "Rua alfredo", "(11) 998902029", 66, "889.566.988-20"  );
		System.out.println("Cliente 2:");
		Cliente2.pf();

		
		System.out.println("\n*******************************************************************");

		Cliente Cliente3 = new Cliente ("Maria costa", "Rua estrela", "(21) 965758599", 32, "12.345.678/0001-90"   );
		System.out.println("\nCliente 3:");
		Cliente3.pj();
		
		System.out.println("\n*******************************************************************");
		
		Cliente Cliente4 = new Cliente("floriano peixoto", "Rua 25 de março", "(31) 97839308", 55, "98.655.876/0001-80"   );
		System.out.println("\nCliente 4:");
		Cliente4.pj();
	
		
		
	}

}
