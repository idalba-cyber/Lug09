package contoBancario;

public class ContoBancario {
	public double saldoIniziale;
	public double versamento; 
	public double saldoVersamento;
	public double prelievo, saldoPrelievo;
	public double interesse, saldoInteresse;
	
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
	}
}
