package Makao;

public class Karta {

	private int broj;
	private String znak;

	public Karta(int broj, String znak) {
		super();
		this.broj = broj;
		this.znak = znak;
	}

	public int getBroj() {
		return broj;
	}

	public String getZnak() {
		return znak;
	}

	private String izgledKarteBroj() {
		if (this.broj == 11) {
			return "A";
		} else if (this.broj == 12) {
			return "J";
		} else if (this.broj == 13) {
			return "Q";
		} else if (this.broj == 14) {
			return "K";
		}
		return "";
	}

	private String izgledKarteZnak() {
		if (this.znak.toLowerCase().equals("srce")) {
			return "<3";
		} else if (this.znak.toLowerCase().equals("list")) {
			return "/\\";
		} else if (this.znak.toLowerCase().equals("kocka")) {
			return "<>";
		}
		return "***";
	}

	public void print() {
		if (this.broj > 10) {
			System.out.print("[" + this.izgledKarteBroj() + " " + this.izgledKarteZnak() + "] ");
		} else {
			System.out.print("[" + this.broj + " " + this.izgledKarteZnak() + "] ");

		}
	}

	public boolean daLiJeMogucePoklopiti(int broj, String znak) {
		return this.broj == broj || this.znak.equals(znak);
	}

}
