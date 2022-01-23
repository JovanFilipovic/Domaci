package d21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double plataRadnika() {
		double suma = 0;
		for (int i = 0; i < this.getSektoriUKojimaRadi().size(); i++) {
			suma = suma + this.getSektoriUKojimaRadi().get(i).getPlata();
		}
		return suma;
	}
}
