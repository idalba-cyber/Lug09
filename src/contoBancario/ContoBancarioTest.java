package contoBancario;

public class ContoBancarioTest {

	public static void main(String[] args) {
		ContoBancario cliente1 = new ContoBancario();
		ContoBancario cliente2 = new ContoBancario();
		

		System.out.println("ESTRATTO CONTO BANCARIO CLIENTE 1:");
		cliente1.saldoIniziale = 100;
		System.out.println("Saldo iniziale: " + cliente1.saldoIniziale + " euro");
		cliente1.versamento = 200;
		System.out.println("Versamento: " + cliente1.versamento + " euro");
		cliente1.versamenti();
		cliente1.prelievo = 50;
		System.out.println("Prelievo: " + cliente1.prelievo + " euro");
		cliente1.interesse = 2;
		cliente1.prelievi();
		cliente1.saldoInteresse();
		System.out.println("Saldo con interesse del " + cliente1.interesse + "% : " + cliente1.saldoInteresse + " euro");
		
		System.out.println("\nESTRATTO CONTO BANCARIO CLIENTE 2:");
		cliente2.saldoIniziale = 300;
		System.out.println("Saldo iniziale: " + cliente2.saldoIniziale + " euro");
		cliente2.versamento = 50;
		System.out.println("Versamento: " + cliente2.versamento + " euro");
		cliente2.versamenti();
		cliente2.prelievo = 100;
		System.out.println("Prelievo: " + cliente2.prelievo + " euro");
		cliente2.prelievi();
		cliente2.interesse = 5;
		cliente2.saldoInteresse();
		System.out.println("Saldo con interesse del " + cliente2.interesse + "% : " + cliente2.saldoInteresse + " euro");
		
	}

}
