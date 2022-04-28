import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CallCenter {

	HashMap<Integer, Cliente> clienti = new HashMap<>();
	HashMap<Integer, Operatore> operatori = new HashMap<>();
	List<Telefonata> registroChiamate = new ArrayList<>();

	public CallCenter() {

	}

	public CallCenter(HashMap<Integer, Cliente> clienti, HashMap<Integer, Operatore> operatori,
			List<Telefonata> registroChiamate) {
		clienti = clienti;
		operatori = operatori;
		this.registroChiamate = registroChiamate;
	}

	public void aggiungiCliente(Cliente c) {
		clienti.put(c.getCodice(), c);
	}

	public void aggiungiOperatore(Operatore o) {
		operatori.put(o.getCodice(), o);
	}

	public void aggiungiTelefonata(Telefonata t) {
		registroChiamate.add(t);
	}

	public Cliente ricercaCliente(int codice) {
		if (clienti.containsKey(codice))
			return clienti.get(codice);
		else
			return null;
	}

	public Operatore ricercaOperatore(int codice) {
		if (operatori.containsKey(codice))
			return operatori.get(codice);
		else
			return null;
	}

	public void ricercaTelefonate(int codOperatore) {
		for (Telefonata t : registroChiamate) {
			if (t.getO().getCodice() == codOperatore) {
				System.out.println(t.toString());
			}
		}

	}

	public void eliminaOperatore(int cod) {
		operatori.remove(cod);
	}

	private String cercaChiamataEffettuata(Cliente c) {
		for (Telefonata t : registroChiamate) {
			if (t.getC().equals(c))
				return t.toStringDateOperatore();
		}
		return "nessuna chiamata precedente";
	}

	public Cliente chiamata(String numeroChiamante) {
		for (Cliente cl : clienti.values()) {
			if (cl.getNumero().equals(numeroChiamante)) {
				System.out.println(cl.toString());
				System.out.println(cercaChiamataEffettuata(cl));
				return cl;
			}
		}
		return null;
	}

	public void filtraChiamate(int cod) {
		for (Telefonata t : registroChiamate) {
			if(t.getO().getCodice() == cod)
				System.out.println(t.toString());
		}
	}
}
