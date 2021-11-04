package Utenti;

public class Elettore {
	private String nome, cognome;
	private String docIdent;
	private String tessElett;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getDocIdent() {
		return docIdent;
	}
	public void setDocIdent(String docIdent) {
		this.docIdent = docIdent;
	}
	public String getTessElett() {
		return tessElett;
	}
	public void setTessElett(String tessElett) {
		this.tessElett = tessElett;
	}
	public void visualizzaCandidati(){
		//todo l'elettore deve poter visualizzare la lista di candidati
	}
	public void visualizzaQuesito(){
		//todo l'elettore deve poter visualizzare il quesito del referendum
	}
	public void VotoCategorico(){
		//todo l'elettore deve poter inserire un voto, ma anche restituire scheda bianca
	}
	public void votoOrdinale(){
		//todo l'elettore deve poter riordinare la lista di candidati, ma anche restituire scheda bianca
	}
	public void votoCategoricoPreferenze(){
		//todo l'elettore deve poter fino a due voti secondo i requisiti, ma anche restituire scheda bianca
	}
	public void referendum(){
		//todo l'elettore deve poter inserire un voto positivo o negativo al quesito, ma anche restituire scheda bianca
	}
	public void confermaScelta(){
		//todo l'elettore deve poter confermare il proprio voto oppure rifarlo
	}
	public void modalitaVittoria(){
		//todo l'elettore deve poter visualizzare la modalità di calcolo del vincitore / della decisione
	}
	public void visualizzaRisultato(){
		//todo l'elettore deve poter visualizzare il vincitore / la decisione vincente
	}
}
