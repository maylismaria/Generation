package heranca;


public class TestaCliente {

	public static void main(String[] args) {

		PessoaFisica C1 = new PessoaFisica ("Jose da Silva", "Rua alba", "(11) 934467068", 32, "023.456.787-00"  );
		
		System.out.println("Cliente 1:");
		C1.visualizar();
		
		
		System.out.println("\n*******************************************************************");
		
		PessoaFisica C2 = new PessoaFisica ("Mario gomes", "Rua alfredo", "(11) 998902029", 66, "889.566.988-20"  );
		
		System.out.println("Cliente 2:");
		C2.visualizar();
		
		System.out.println("\n*******************************************************************");

		PessoaJuridica C3 = new PessoaJuridica ("Maria costa", "Rua estrela", "(21) 965758599", 32, "12.345.678/0001-90"   );

		System.out.println("\nCliente 3:");
		C3.visualizar();
		
		System.out.println("\n*******************************************************************");
		
		PessoaJuridica C4 = new PessoaJuridica ("floriano peixoto", "Rua 25 de março", "(31) 97839308", 55, "98.655.876/0001-80"   );

		System.out.println("\nCliente 4:");
		C4.visualizar();

	}

}
