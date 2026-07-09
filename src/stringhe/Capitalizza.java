package stringhe;

public class Capitalizza {
	
	public String nome, cognome;
	
	public void inizialeMaiuscola() {
		//recupero le iniziali e le separo dal resto 
		String inizialeNome = nome.substring(0, 1); // estraggo dalla posizione 0 fino alla posizione 1 esclusa
		String restoNome = nome.substring(1); //estraggo dalla posizione 1 fino a fine String
		String inizialeCognome = cognome.substring(0, 1);
		String restoCognome = cognome.substring(1);
		
		//manipolazione delle String
		inizialeNome = inizialeNome.toUpperCase(); //iniziale nome trasformata in maiuscolo se necessario
		restoNome = restoNome.toLowerCase(); //resto del nome trasformato in minuscolo se necessario 
		inizialeCognome = inizialeCognome.toUpperCase();
		restoCognome = restoCognome.toLowerCase(); 
		nome = inizialeNome + restoNome;
		cognome = inizialeCognome + restoCognome;
		System.out.println("Ti chiami: " + nome + " " + cognome);
	}

}
