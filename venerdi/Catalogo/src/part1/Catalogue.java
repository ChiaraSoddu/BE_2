package part1;

public abstract class Catalogue {
	
	protected long ISBN;
	protected String titolo;
	protected int anno;
	protected int pagine;
	protected String autore ;
	
	
	static long codISBN= 1000001;
	protected Catalogue() {
		this.ISBN = codISBN;
		codISBN++;
	}
	
	public long getISBN() {
		return this.ISBN;
	}

	public int getAnno() {
		return this.anno;
	}

	public String getAutore() {
		return this.autore;
	}

}
