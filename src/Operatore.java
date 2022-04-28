
public class Operatore {
	private int codice;
	private String cognome;
	private String nome;
	
	public Operatore(int codice, String cognome, String nome) {
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return codice + ", " + cognome + ", " + nome;
	}
	
	
}
