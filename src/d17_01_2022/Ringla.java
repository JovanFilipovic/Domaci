package d17_01_2022;

public class Ringla {

	private String tip;
	private int jacina;
	private double jacinaGrejaca;

	public Ringla(String tip, double jacinaGrejaca) {
		this.tip = tip;
		this.jacinaGrejaca = jacinaGrejaca;
		this.jacina = 0;
	}

	public int getJacina() {
		return this.jacina;
	}

	private int maxPojacavanje() {
		return this.tip.equals("obicna") ? 3 : 12;
	}

	public void pojacajRinglu() {
		if (this.jacina < maxPojacavanje()) {
			this.jacina++;
		}
	}

	public void iskljuciRinglu() {
		this.jacina = 0;
	}

	public boolean jeUkljucena() {
		return this.jacina > 0;
	}

	public String jeUkljucenaString() {
		return this.jeUkljucena() == true ? "ukljucena" : "iskljucena";
	}

	public double potrosnjaEl(int brojSati) {
		return 100 / this.maxPojacavanje() * this.jacina * this.jacinaGrejaca * brojSati;
	}

	public void print() {
		System.out.println("Ringla je " + this.jeUkljucenaString());
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
	}
}
