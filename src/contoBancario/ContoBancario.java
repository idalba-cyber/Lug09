package contoBancario;

public class ContoBancario {
	/* public double saldoIniziale;
	public double versamento; 
	public double saldoVersamento;
	public double prelievo, saldoPrelievo;
	public int interesse;
	public double saldoInteresse;
	
	public void versamenti() {
		saldoVersamento = saldoIniziale + versamento;
		System.out.println("Saldo aggiornato: " + saldoVersamento);
		
	}
	
	public void prelievi() {
		saldoPrelievo = saldoVersamento - prelievo;
		System.out.println("Saldo aggiornato: " + saldoPrelievo);
	}
	
	public void saldoInteresse() {
		saldoInteresse = saldoPrelievo+(saldoPrelievo * interesse /100);
	} */
	// AGGIORNATO CON MENO VARIABILI
	public double saldo;
	public double importo;
	public int interesse;
	
	public void versamenti() {
		saldo = saldo  + importo;
		System.out.println("Saldo aggiornato: " + saldo );
		
	}
	
	public void prelievi() {
		saldo  = saldo - importo;
		System.out.println("Saldo aggiornato: " + saldo );
	}
	
	public void saldoInteresse() {
		saldo = saldo +(saldo * interesse /100);
	}
}