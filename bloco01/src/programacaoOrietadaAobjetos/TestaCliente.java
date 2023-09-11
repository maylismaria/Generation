package programacaoOrietadaAobjetos;

import programacaoOrietadaAobjetos.Cliente;

public class TestaCliente {

	public static void main(String[] args) {

		
		
		Cliente C1 = new Cliente ("Jose da Silva", "Rua alba", "(11) 934467068", 32, "023.456.787-00"  );
		
		Cliente C2 = new Cliente ("Maria costa", "Rua estrela", "(21) 965758599", 32, "752.578.652-99"  );


		
		System.out.println("Cliente 1:");

		C1.visualizar();
		
		System.out.println("\nCliente 2:");
		C2.visualizar();

		
		
	}

}
