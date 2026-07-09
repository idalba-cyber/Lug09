package esercizio1;

public class ClienteTest {
	
	public static void main (String args[]) {
		
		Cliente mioCliente = new Cliente();

		mioCliente.ID = 16;
		mioCliente.nuovoCliente = false;
		mioCliente.totAcquisti = 80.50; 
		
		mioCliente.displayInfoCliente();

		}
}