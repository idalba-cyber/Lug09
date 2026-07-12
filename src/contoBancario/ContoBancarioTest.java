package contoBancario;

public class ContoBancarioTest {

	public static void main(String[] args) {
		ContoBancario cliente1 = new ContoBancario();
		ContoBancario cliente2 = new ContoBancario();
		

		System.out.println("ESTRATTO CONTO BANCARIO CLIENTE 1:");
		cliente1.saldo = 100;
		System.out.println("Saldo iniziale: " + cliente1.saldo + " euro");
		cliente1.importo = 200;
		System.out.println("Versamento: " + cliente1.importo + " euro");
		cliente1.versamenti();
		cliente1.importo = 50;
		System.out.println("Prelievo: " + cliente1.importo + " euro");
		cliente1.interesse = 2;
		cliente1.prelievi();
		cliente1.saldoInteresse();
		System.out.println("Saldo con interesse del " + cliente1.interesse + "% : " + cliente1.saldo+ " euro");
		
		System.out.println("\nESTRATTO CONTO BANCARIO CLIENTE 2:");
		cliente2.saldo = 300;
		System.out.println("Saldo iniziale: " + cliente2.saldo + " euro");
		cliente2.importo = 80;
		System.out.println("Prelievo: " + cliente2.importo + " euro");
		cliente2.prelievi();
		cliente2.importo = 100;
		System.out.println("Versamento: " + cliente2.importo + " euro");
		cliente2.versamenti();
		cliente2.interesse = 5;
		cliente2.saldoInteresse();
		System.out.println("Saldo con interesse del " + cliente2.interesse + "% : " + cliente2.saldo + " euro");
		
	}

}