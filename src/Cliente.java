import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private int codice;
	private String cognome;
	private String nome;
	private String numero;

	public Cliente(int codice, String cognome, String nome, String numero) {
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.numero = numero;
	}

	public Cliente() {

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
		return codice + ", " + cognome + ", " + nome + ", " + numero;
	}

}
