package part1;

//public enum Pubblicazione {
//	Giornaliera, 
//	Settimanale,
//	Mensile;
//}

public class Magazine extends Catalogue{

	Pubblicazione periodicita;
	
	
	public Magazine(String titolo, int anno, int pagine, Pubblicazione periodicita) {
		super();
		super.titolo = titolo;
		super.anno = anno;
		super.pagine = pagine;
		this.periodicita = periodicita;
	}

	public String toString() {
		return  "Titolo: " + this.titolo +  
				", Anno di pubblicazione: " + this.anno + 
				", Pagine: " + this.pagine +
				", Periodicità: " + this.periodicita +
				", codice ISBN: " + this.ISBN;
	}
}


