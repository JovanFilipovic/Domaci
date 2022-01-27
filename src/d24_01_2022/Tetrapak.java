package d24_01_2022;

public class Tetrapak extends Ambalaza {

	private boolean mozeRecikliranje;
	protected double osnovnaCena;

	public boolean isMozeRecikliranje() {
		return mozeRecikliranje;
	}

	public void setMozeRecikliranje(boolean mozeRecikliranje) {
		this.mozeRecikliranje = mozeRecikliranje;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeRecikliranje,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.mozeRecikliranje = mozeRecikliranje;
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		return this.mozeRecikliranje ? this.tezinaPakovanja() * 1.5 + this.osnovnaCena : this.osnovnaCena;
	}

	@Override
	public void stampaj() {
		System.out.println(this.nazivArtikla + ", " + this.barkod + ", " + this.brutoTezina + ", " + this.netoTezina
				+ ", " + this.osnovnaCena + ", " + this.cenaArtikla());
	}

}
