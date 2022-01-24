package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Spil {

	private Random random = new Random();
	ArrayList<Karta> karte = new ArrayList<Karta>();

	public Spil() {
		String[] znakovi = { "srce", "kocka", "list", "detelina" };

		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				this.karte.add(new Karta(j, znakovi[i]));
			}
		}
	}

	public Karta izvuciRandom() {
		if (this.karte.isEmpty()) {
			return null;
		} else {
			int index = random.nextInt(karte.size());
			Karta karta = karte.get(index);
			karte.remove(index);
			return karta;
		}
	}

}
