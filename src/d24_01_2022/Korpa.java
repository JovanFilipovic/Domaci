package d24_01_2022;

import java.util.ArrayList;

public class Korpa {
	
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkodAmbalaze) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if(this.ambalaze.get(i).barkod.equals(barkodAmbalaze)) {
				this.ambalaze.remove(i);
			}
		}
	}
	
	private double cenaSvihAmbalazaSaPopustom(int popust) {
		double suma = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			suma = suma + (this.ambalaze.get(i).cenaArtikla() - popust);
		}
		return suma;
	}
	
	public double ukupnaCenaKorpe(SuperKartica superKartica) {
		return this.cenaSvihAmbalazaSaPopustom(superKartica.getPopustDinara());
	}
}
