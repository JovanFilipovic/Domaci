package d18_01_2022;

import java.util.ArrayList;

public class Listic {

	private ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();

	public void dodajKombinaciju(Kombinacija kombinacija) {
		this.kombinacije.add(kombinacija);
	}

	public boolean daLiJeDobitnaKombinacija(Kombinacija kombinacija) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			if (this.kombinacije.get(i).daLiJeIstaKombinacija(kombinacija) != true) {
				return false;
			}
		}
		return true;
	}

	public void stampaj() {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			this.kombinacije.get(i).stampa();
		}
	}
}
