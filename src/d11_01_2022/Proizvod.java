package d11_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;

	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}

	public void povecajCenu(int povecanje) {
		this.cena += povecanje;
	}

	public double vratiCenuSaPopustom(int popust) {
		return this.cena - ((this.cena / 100) * popust);
	}

	public double racunajPostarinu() {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina >= 101 && this.tezina <= 500) {
			return 400;
		}
		return 1000;
	}

}
