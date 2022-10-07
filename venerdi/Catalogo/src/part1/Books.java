package part1;

public class Books extends Catalogue{

	Genere genere;
	String autore;
	
	public Books(String titolo, Genere genere, String autore, int anno, int pagine) {
		super();
		super.titolo = titolo;
		super.anno = anno;
		super.pagine = pagine;
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return this.autore;
	}
	
	public String toString() {
		return  "Titolo: " + this.titolo + 
				", Autore: " + this.autore + 
				", Anno di pubblicazione: " + this.anno + 
				", Genere letterario: " + this.genere +
				", Pagine: " + this.pagine +
				", codice ISBN: " + this.ISBN;
	}
}
