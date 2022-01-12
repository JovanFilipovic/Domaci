package d10_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;

	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}

}
