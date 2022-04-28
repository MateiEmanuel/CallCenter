import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);

	private static int menu() {
		int risposta;
		System.out.println("Menù:");
		System.out.println("1) inserisci operatore");
		System.out.println("2) elimina operatore");
		System.out.println("3) inserisci cliente");
		System.out.println("4) ricevi chiamata");
		System.out.println("5) mostra chiamate ricevute per codice operatore");
		System.out.println("0) fine programma.");
		System.out.println("cosa vuoi fare?");
		risposta = input.nextInt();
		return risposta;
	}

	private static Cliente nuovoCliente(int n) {
		int cod;
		String cognome, nome, numero;
		cod = n;
		System.out.println("codice: " + cod);
		System.out.print("cognome: ");
		cognome = input.next();
		System.out.print("nome: ");
		nome = input.next();
		System.out.print("numero: ");
		numero = input.next();

		return new Cliente(cod, cognome, nome, numero);
	}

	private static Operatore nuovoOperatore(int n) {
		int cod;
		String cognome, nome;
		cod = n;
		System.out.println("codice: " + cod);
		System.out.print("cognome: ");
		cognome = input.next();
		System.out.print("nome: ");
		nome = input.next();

		return new Operatore(cod, cognome, nome);
	}

	private static LocalDateTime inserisciDataInizio() {
		int giorno, mese, anno, ore, minuti;

		System.out.println("Data inizio: ");
		System.out.print("giorno: ");
		giorno = input.nextInt();
		System.out.print("mese: ");
		mese = input.nextInt();
		System.out.print("anno: ");
		anno = input.nextInt();
		System.out.print("ore: ");
		ore = input.nextInt();
		System.out.print("minuti: ");
		minuti = input.nextInt();

		return LocalDateTime.of(anno, mese, giorno, ore, minuti);
	}

	private static LocalDateTime inserisciDataFine() {
		int giorno, mese, anno, ore, minuti;

		System.out.println("Data fine: ");
		System.out.print("giorno: ");
		giorno = input.nextInt();
		System.out.print("mese: ");
		mese = input.nextInt();
		System.out.print("anno: ");
		anno = input.nextInt();
		System.out.print("ore: ");
		ore = input.nextInt();
		System.out.print("minuti: ");
		minuti = input.nextInt();

		return LocalDateTime.of(anno, mese, giorno, ore, minuti);
	}

	
	public static void main(String[] args) {
		CallCenter cc = new CallCenter();
		int ris, nCl=0, nOp=0;

		do {
			ris = menu();
			switch (ris) {
			case 1:
				nOp++;
				cc.aggiungiOperatore(nuovoOperatore(nOp));
				break;

			case 2:
				int cod;
				System.out.println("codice: ");
				cod= input.nextInt();
				cc.eliminaOperatore(cod);
				break;
			case 3:
				nCl++;
				cc.aggiungiCliente(nuovoCliente(nCl));
				break;
			case 4:
				Cliente c;
				String numero;
				System.out.print("numero chiamante: ");
				numero = input.next();
				c = cc.chiamata(numero);
				System.out.println("codice dell'operatore: ");
				cod= input.nextInt();
				cc.aggiungiTelefonata(new Telefonata(inserisciDataInizio(), inserisciDataFine(), c, cc.ricercaOperatore(cod)));
				break;
			case 5:
				System.out.println("codice dell'operatore: ");
				cod= input.nextInt();
				cc.filtraChiamate(cod);
				break;
			}	
		} while (ris != 0);

	}
}
