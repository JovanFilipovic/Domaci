package d_20_01_2022;

public class Trener extends Osoba {

	private int godineIskustva;
	private String tipTrenera;

	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja) {
		super(imeIPrezime, jmbg, godinaRodjenja);
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampaj() {
		super.stampaj();
		System.out.println(this.godineIskustva + ", " + this.tipTrenera);
	}

}
