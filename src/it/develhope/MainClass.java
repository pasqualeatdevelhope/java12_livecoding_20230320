package it.develhope;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scuola scuola = new Scuola();
		
		Scanner scanner = new Scanner(System.in);
		String action = null;
		do {
			action = scanner.next();
			switch (action) {
			case "add-class":
				Classe classe = new Classe();
				System.out.println("Id:");
				String id = scanner.next();
				classe.setId(Integer.parseInt(id));
				scuola.creaClasse(classe);
				break;
			case "add-student":
				System.out.println("Nome:");
				String nome = scanner.next();
				System.out.println("Cognome:");
				String cognome = scanner.next();
				System.out.println("Codice fiscale:");
				String codiceFiscale = scanner.next();
				System.out.println("Matricola:");
				String matricola = scanner.next();
				System.out.println("ID Scuola:");
				String scuolaId = scanner.next();
				Studente studente1 = new Studente(nome, cognome, matricola, codiceFiscale);
				for(Classe c : scuola.classi) {
					if(c.getId().equals(Integer.parseInt(scuolaId))) {
						c.addStudente(studente1);
					}
				}
				break;
			case "print-all":
				scuola.stampaClassi();
				break;
			default:
				if(!"stop".equals(action)) {
					System.out.println("Scrivi add-class per aggiungere una classe, add-student per aggiungere uno studente, print-all per stampare tutto");					
				}
				break;
			}
		} while(!"stop".equals(action));
	}
	
}