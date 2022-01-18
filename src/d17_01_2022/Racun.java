package d17_01_2022;

public class Racun {

	private String broj;
	private String imeIPrezime;
	private double trenutnoStanje;

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public Racun(String broj, String imeIPrezime, double trenutnoStanje) {
		super();
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.trenutnoStanje = trenutnoStanje;
	}

	public void stanjePromena(double vrednost) {
		if (vrednost + this.trenutnoStanje > 0)
			this.trenutnoStanje = this.trenutnoStanje + vrednost;
	}

	public void stampaj() {
		System.out.println(
				this.imeIPrezime + " - " + this.broj + "\nstanje na racunu je " + this.trenutnoStanje + " rsd");
	}

}
