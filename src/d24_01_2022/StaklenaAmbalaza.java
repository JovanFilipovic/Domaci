package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucijaZaFlasu;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
			double kaucijaZaFlasu, boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		return this.placaSeKaucija ? this.osnovnaCena * 1.2 + this.kaucijaZaFlasu : this.osnovnaCena * 1.2;
	}

	@Override
	public void stampaj() {
		System.out.println(this.nazivArtikla + ", " + this.barkod + ", " + this.brutoTezina + ", " + this.netoTezina
				+ ", " + this.osnovnaCena + ", " + this.cenaArtikla());
	}

}
