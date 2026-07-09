package esercizio2;

public class Persona {
	public int giorni;
	public long secondi;
	public int anni;

	public void calcolaEta() {

		giorni = anni * 365;
		secondi = (long)anni * 24 * 60 * 60;
		System.out.println("La tua età è di: " + anni + " anni \nEd equivale a " + giorni + " giorni e " + secondi + " secondi");

	}
}