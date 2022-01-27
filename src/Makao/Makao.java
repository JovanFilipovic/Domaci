package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Makao {

	private Spil spilKarata;
	private ArrayList<Igrac> igraci = new ArrayList<Igrac>();
	private ArrayList<Karta> odigraneKarte = new ArrayList<Karta>();
	private int index;

	public Makao(Spil spilKarata) {
		this.spilKarata = spilKarata;
		this.index = 0;
	}

	public ArrayList<Karta> getOdigraneKarte() {
		return this.odigraneKarte;
	}

	public void zameniOdigraneKarte() {

		for (int j = 0; j < this.odigraneKarte.size(); j++) {
			this.spilKarata.karte.add(this.odigraneKarte.get(j));
		}
		this.odigraneKarte.clear();
	}

	public Spil getSpil() {
		return this.spilKarata;
	}

	public void pristupiStolu(Igrac igrac) {
		this.igraci.add(igrac);
	}

	public void preseciSpil() {
		this.odigraneKarte.add(0, this.spilKarata.izvuciRandom());
	}

	public void odigrajKartu(int broj, String znak) {
		if (this.igraci.get(this.index).daLiPostojiKarta(broj, znak)) {
			if (this.odigraneKarte.get(odigraneKarte.size() - 1).daLiJeMogucePoklopiti(broj, znak)) {
				this.odigraneKarte.add(this.igraci.get(index).odigrajKartu(broj, znak));
				if (broj == 7) {
					this.izvucenBrojSedam();
				} else if (broj == 8) {
					this.sledeci();
					this.sledeci();
				} else if (broj == 11) {
					boolean imaKartu = false;
					while (imaKartu == false)
						if (this.igraci.get(index).daLiPostojiKarta(broj, znak)) {
							this.igraci.get(index).odigrajKartu(broj, znak);
							imaKartu = true;
						} else {
							this.igraci.get(index).dodajKartu(this.spilKarata.izvuciRandom());
						}
				} else if (broj == 2 && znak.equals("detelina")) {
					this.izvucenaDvojkaDetelina();
					this.sledeci();

				} else {
					this.sledeci();
				}
			}

		} else {
			System.out.println("\nGreska, igrac nema tu kartu u ruci");
		}

	}

	private void izvucenaDvojkaDetelina() {
		if (this.index >= 1) {
			this.igraci.get(index - 1).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(index - 1).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(index - 1).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(index - 1).dodajKartu(this.spilKarata.izvuciRandom());
		} else {
			this.igraci.get(3).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(3).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(3).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(3).dodajKartu(this.spilKarata.izvuciRandom());

		}
	}

	private void izvucenBrojSedam() {
		if (this.index < 3) {
			this.igraci.get(this.index + 1).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(this.index + 1).dodajKartu(this.spilKarata.izvuciRandom());
			this.sledeci();
		} else {
			this.igraci.get(0).dodajKartu(this.spilKarata.izvuciRandom());
			this.igraci.get(0).dodajKartu(this.spilKarata.izvuciRandom());
			this.sledeci();
		}
	}

	public void izvuciKartu() {
		this.igraci.get(this.index).dodajKartu(this.spilKarata.izvuciRandom());
	}

	public Igrac pobednikIgre() {
		for (int i = 0; i < this.igraci.size(); i++) {
			if (this.igraci.get(i).getKarteURuci().isEmpty())
				return this.igraci.get(i);
		}
		return null;
	}

	public void podeliKarte() {
		for (int i = 0; i < this.igraci.size(); i++) {
			for (int j = 0; j < 6; j++) {
				igraci.get(i).dodajKartu(this.spilKarata.izvuciRandom());
			}
		}
	}

	public boolean krajIgre() {
		for (int i = 0; i < this.igraci.size(); i++) {
			if (this.igraci.get(i).getKarteURuci().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public void sledeci() {
		if (this.index == 0) {
			this.index = 1;
		} else if (this.index == 1) {
			this.index = 2;
		} else if (this.index == 2) {
			this.index = 3;
		} else if (this.index == 3) {
			this.index = 0;
		}
	}

	public void printTrenutnoStanjeNaStolu() {
		System.out.println();
		for (int i = 0; i < this.igraci.size(); i++) {
			if (this.index == i) {
				System.out.println("...............................................");
				this.igraci.get(i).print();
				System.out.println();
				System.out.println("***********************************************");
			} else {
				this.igraci.get(i).print();
				System.out.println();
			}
		}
		System.out.println("\n");
		System.out.print("Zadnja karta na stolu je ");
		if (this.odigraneKarte.size() == 1) {
			this.odigraneKarte.get(0).print();
		} else if (this.odigraneKarte.size() > 1) {
			this.odigraneKarte.get(odigraneKarte.size() - 1).print();
		}
		System.out.println();
	}

}
