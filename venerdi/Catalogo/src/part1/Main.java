package part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	static ArrayList<Catalogue> Catalogo = new ArrayList<Catalogue>();
	static Pubblicazione tempo;

	public static void main(String[] args) {
		// scanner per chiedere il criterio di ricerca
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Inserire il criterio di ricerca");
//		String input = s.nextLine();
//		int n = Integer.valueOf(input);
		// creare un array contenente libri e riviste
		
		
//		ArrayList<Books> libri = new ArrayList<Books>(); 
		
		
//		public static aggiungi() {
//			come
//		}
		
		System.out.println("Quanti elementi vuoi aggiungere?");
		String input = s.nextLine();
		int n = Integer.valueOf(input);
		
		for (int i = 0; i < n; i ++) {
			System.out.println("Che Cosa vuoi aggiungere?");
			System.out.println("""
					1.Libro \r
					2.Rivista \r
					""");
			int tipo = Integer.parseInt(s.nextLine());
			
			System.out.println("Indica il codice ISBN");
			int ISBN = Integer.parseInt(s.nextLine());
			
			System.out.println("Scrivi il titolo");
			String titolo = s.nextLine();
			
			System.out.println("Anno di pubblicazione");
			int anno = Integer.valueOf(s.nextLine());	
					
			System.out.println("Numero di pagine");
			int pagine = Integer.valueOf(s.nextLine());
			
			if(tipo == 1) {
				System.out.println("Indica il nome dell'autore");
				String autore = s.nextLine();
				
				System.out.println("Inserisci il genere");
				String g = s.nextLine();
				Genere gen;
				switch(g.toLowerCase()) {
				case "fantasy":
					gen = Genere.Fantasy;
					break;
				case "horror":
					gen = Genere.Horror;
					break;
				case "rosa":
					gen = Genere.Rosa;
					break;
				case "giallo":
					gen = Genere.Giallo;
					break;
				default: 
					gen= Genere.GenereNonDefinito;
					break;
					
				}
				
//				Genere gen = Genere.valueOf(g.toLowerCase());
				
				Catalogo.add (new Books (titolo, gen, autore, anno, pagine));
				//String Genere g= s.nextLine();
				//Catalogo[i] = new Book (titolo, anno);
				
				
			}else if(tipo == 2) {
				System.out.println("Indica la periodicità: ");
				String p = s.nextLine();
				Pubblicazione per;
				switch(p.toLowerCase()) {
				case "giornaliera":
					per = Pubblicazione.Giornaliera;
					break;
				case "settimanale":
					per = Pubblicazione.Settimanale;
					break;
				case "mensile":
					per = Pubblicazione.Mensile;
					break;
				case "semestrale":
					per = Pubblicazione.Semestrale;
					break;
				default: 
					per= Pubblicazione.NonDefinito;
					break;
					
				}
				
				Catalogo.add (new Magazine (titolo, anno, pagine, per));
				
			};
			
			
		}
		
		System.out.println(Catalogo);
		
		System.out.println("che azione vuoi compiere?");
		System.out.println("""
				1.Aggiungi \r
				2.Rimuovi	\r
				3.Cerca	anno\r
				4.Cerca autore
				5.Cerca ISBN
				""");
		
		int azione = Integer.parseInt(s.nextLine());
		// richiamare i metodi dopo averli completati 
		// in vari if
		
		switch(azione) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			ricercaAnno();
			break;
		case 4: 
			ricercaAutore();
			break;
		case 5:
			ricercaISBN();
		}
		
		
		

	}

	public Catalogue ricercaISBN(long ISBN){
		List <Catalogue> l = Catalogo.stream().filter(c -> c.getISBN() == ISBN).collect(Collectors.toList());
		return l.get(0);
	}
	
	public List<Catalogue> ricercaAnno(int anno){
		List <Catalogue> l = Catalogo.stream().filter(c -> c.getAnno() == anno).collect(Collectors.toList());
		return l;
	}
	
	public List<Catalogue> ricercaAutore(String autore){
		List <Catalogue> l = Catalogo.stream().filter(c -> c.autore == autore).collect(Collectors.toList());
		return l;
	}
	
}




//1.chiedere all'utente che tipo di ricerca vuole fare (secondo quale criterio)
//2.creare un metodo di ricerca per ogni opzione
//3.richiamare il metodo
//4. restituire gli elementi corrispondenti
