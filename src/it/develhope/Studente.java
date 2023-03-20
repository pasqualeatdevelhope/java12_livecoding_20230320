package it.develhope;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	private String codiceFiscale;

	
	
	public Studente(String nome, String cognome, String matricola, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.codiceFiscale = codiceFiscale;
	}

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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", codiceFiscale="
				+ codiceFiscale + "]";
	}

}
