package d24_01_2022;

public class SuperKartica {

	private String brojKartice;
	private String imeIPrezimeVlasnika;
	private int popustDinara;

	public SuperKartica(String brojKartice, String imeIPrezimeVlasnika, int popustDinara) {
		super();
		this.brojKartice = brojKartice;
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
		this.popustDinara = popustDinara;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImeIPrezimeVlasnika() {
		return imeIPrezimeVlasnika;
	}

	public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	}

	public int getPopustDinara() {
		return popustDinara;
	}

	public void setPopustDinara(int popustDinara) {
		this.popustDinara = popustDinara;
	}

	public void stampaj() {
		System.out.println(this.brojKartice + ", " + this.imeIPrezimeVlasnika);
	}
}
