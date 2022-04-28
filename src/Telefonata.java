import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telefonata {

	private LocalDateTime inizio;
	private LocalDateTime fine;
	private Cliente c;
	private Operatore o;

	public Telefonata(LocalDateTime inizio, LocalDateTime fine, Cliente c, Operatore o) {
		this.inizio = inizio;
		this.fine = fine;
		this.c = c;
		this.o = o;
	}
	

	public LocalDateTime getInizio() {
		return inizio;
	}

	public void setInizio(LocalDateTime inizio) {
		this.inizio = inizio;
	}

	public LocalDateTime getFine() {
		return fine;
	}

	public void setFine(LocalDateTime fine) {
		this.fine = fine;
	}

	public Cliente getC() {
		return c;
	}

	public Operatore getO() {
		return o;
	}

	private String toStringDateTime(LocalDateTime ldt) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateTime = ldt.format(formatter);
		return formattedDateTime;
	}

	
	public String toString() {
		return toStringDateTime(inizio) + ", " + toStringDateTime(fine) + "\nCliente:\n" + c.toString() + "\nOperatore:\n" + o.toString();
	}
	
	public String toStringDateOperatore() {
		return toStringDateTime(inizio) + ", " + toStringDateTime(fine) + "\n" + "\nOperatore\n" + o.toString();	
	}
	

}
