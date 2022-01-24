package Makao;

import java.util.ArrayList;

public class Igrac {

	private String imeIPrezime;
	private ArrayList<Karta> karteURuci = new ArrayList<Karta>();

	public Igrac(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Karta> getKarteURuci() {
		return karteURuci;
	}

	public void dodajKartu(Karta karta) {
		this.karteURuci.add(karta);
	}

	public boolean daLiPostojiKarta(int broj, String znak) {
		for (int i = 0; i < this.karteURuci.size(); i++) {
			if (this.karteURuci.get(i).getBroj() == broj || this.karteURuci.get(i).getZnak().equals(znak))
				return true;
		}
		return false;
	}

	public Karta odigrajKartu(int broj, String znak) {
		for (int i = 0; i < this.karteURuci.size(); i++) {
			if (this.karteURuci.get(i).getBroj() == broj && this.karteURuci.get(i).getZnak().equals(znak)) {
				Karta karta = this.karteURuci.get(i);
				this.karteURuci.remove(i);
				return karta;
			}
		}
		return null;
	}

	public void print() {
		System.out.println(this.imeIPrezime);
		for (int i = 0; i < this.karteURuci.size(); i++) {
			this.karteURuci.get(i).print();
		}
	}
}
