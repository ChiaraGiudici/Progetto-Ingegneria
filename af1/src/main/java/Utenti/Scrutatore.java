package Utenti;

public class Scrutatore {
	private String nome, cognome;
	private String docIdent;

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
	
	public void apriVotazione() {
		//todo lo scrutatore deve poter aprire una sessione di votazione
	}

	public void sceltaModalita() {
		//todo lo scrutatore deve poter scegliere la modalità di votazione
	}
	
	public void inserimentoListe() {
		//todo lo scrutatore deve poter inserire le liste dei candidati
	}

	public void inserimentoQuesito() {
		//todo lo scrutatore deve poter inserire il quesito del referendum
	}

	public void chiudiVotazione() {
		//todo lo scrutatore deve poter chiudere una sessione di votazione
	}
	
	public void apriScrutinio() {
		//todo lo scrutatore deve poter aprire una sessione di scrutinio
	}
	
	public void modalitaVittoria() {
		//todo lo scrutatore deve poter inserire la modalità di vittoria
	}

	public void visualizzaNumeroVoti() {
		//todo lo scrutatore deve poter visualizzare il numero degli elettori che hanno votato
	}	
	
	public void visualizzaSchede() {
		//todo lo scrutatore deve poter visualizzare le schede elettorali
	}	
	
	public void chiudiScrutinio() {
		//todo lo scrutatore deve poter chiudere una sessione di scrutinio
	}

	public void apriRisultato() {
		//todo lo scrutatore deve poter aprire una sessione di visualizzazione del vincitore
	}
	
	public void inserisciRisultato() {
		//todo lo scrutatore deve poter inserire il candidato/risultato vincitore
	}	
	
	public void chiudiRisultato() {
		//todo lo scrutatore deve poter chiudere una sessione di visualizzazione del vincitore
	}
}
