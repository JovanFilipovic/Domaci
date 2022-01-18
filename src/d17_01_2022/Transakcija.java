package d17_01_2022;

public class Transakcija {
	private String id;
	private Racun racunSa;
	private Racun racunNa;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunSa() {
		return racunSa;
	}

	public void setRacunSa(Racun racunSa) {
		this.racunSa = racunSa;
	}

	public Racun getRacunNa() {
		return racunNa;
	}

	public void setRacunNa(Racun racunNa) {
		this.racunNa = racunNa;
	}

	public Transakcija(String id, Racun racunSa, Racun racunNa) {
		this.id = id;
		this.racunSa = racunSa;
		this.racunNa = racunNa;
	}

	private double provizijaTransakcije(int vrednostTransakcije) {
		return vrednostTransakcije < 4500 ? 45 : vrednostTransakcije * 0.01;
	}

	public void izvrsiTransakciju(int vrednostTransakcije) {
		if (this.racunSa.getTrenutnoStanje() - (vrednostTransakcije + provizijaTransakcije(vrednostTransakcije)) >= 0) {
			this.racunSa.stanjePromena(-(vrednostTransakcije + provizijaTransakcije(vrednostTransakcije)));
			this.racunNa.stanjePromena(vrednostTransakcije);

		} else {
			System.out.println("Nema dovoljno sredstava");
		}
	}

	public void stampaj() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.racunSa.getImeIPrezime() + " - " + this.racunSa.getBroj());
		System.out.println("Racun na: " + this.racunNa.getImeIPrezime() + " - " + this.racunNa.getBroj());
	}

}
