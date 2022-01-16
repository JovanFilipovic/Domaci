package d14_01_2022;

public class Knjiga {

	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;

	public void print() {
		System.out.print("(" + this.isbn + ")" + "\n(" + this.naziv + ") - (" + this.godinaIzdanja + ")\n" + "autor: ");
		autor.print();
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public Knjiga(String naziv, int godinaIzdanja, Autor autor) {
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

}
