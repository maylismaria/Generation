package heranca;


public class TestaFuncionario {

	public static void main(String[] args) {

		
		vendedor f1 = new vendedor ("Lucas", "(11) 96567282", 1200f, "782.902.020-99", "");
		System.out.println("FUNCIONÁRIO 1: ");
		f1.visualizar();

		System.out.println("************************************************************");
		
		vendedor f2 = new vendedor ("Pedro", "(11) 983748949", 1200f, "987.873.657-88", "");
		System.out.println("FUNCIONÁRIO 2: ");
		f2.visualizar();

		System.out.println("************************************************************");

		gerente f3 = new gerente ("Luisa", "(11) 965383002", 1500f, "987.942.900-09", "");
		System.out.println("FUNCIONÁRIO 3: ");
		f3.visualizar();
		
		System.out.println("************************************************************");
		
		gerente f4 = new gerente ("Maria", "(11) 95262290", 1500f, "780.672.469-77", "");
		System.out.println("FUNCIONÁRIO 4: ");
		f4.visualizar();
		

	}

}
