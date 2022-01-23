package d_20_01_2022;

public class Igrac extends Osoba {

	private int broj;
	private String pozicija;
	private boolean jeKapiten;

	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean jeKapiten) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}

	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja) {
		super(imeIPrezime, jmbg, godinaRodjenja);
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isJeKapiten() {
		return jeKapiten;
	}

	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}
	
	private String jeKapitenToString() {
		return this.jeKapiten ? "kapiten" : "regularan";
	}

	public void stampaj() {
		super.stampaj();
		System.out.println(this.broj + ", " + this.pozicija + ", " + this.jeKapitenToString());
	}
}
