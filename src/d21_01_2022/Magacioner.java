package d21_01_2022;

public class Magacioner extends Radnik {

	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
	}

	private double procecnaPlata() {
		double suma = 0;
		for (int i = 0; i < this.getSektoriUKojimaRadi().size(); i++) {
			suma = suma + this.getSektoriUKojimaRadi().get(i).getPlata();
		}
		return suma / this.getSektoriUKojimaRadi().size() * 0.5;
	}

	@Override
	public double plataRadnika() {
		return this.procecnaPlata() * this.getSektoriUKojimaRadi().size();
	}

}
