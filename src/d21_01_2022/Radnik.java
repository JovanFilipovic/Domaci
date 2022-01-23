package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {

	private String imeIPrezime;

	private ArrayList<Sektor> sektoriUKojimaRadi = new ArrayList<Sektor>();

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public ArrayList<Sektor> getSektoriUKojimaRadi() {
		return sektoriUKojimaRadi;
	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public abstract double plataRadnika();

	public void zaposliUSektor(Sektor sektor) {
		this.sektoriUKojimaRadi.add(sektor);
	}
}
