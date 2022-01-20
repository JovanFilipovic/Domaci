package d17_01_2022;

public class ElektricniSporet {

	private String marka;
	private int garancija;
	private int maksimalniBrojRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;

	public ElektricniSporet(String marka, int garancija, int maksimalniBrojRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		this.marka = marka;
		this.garancija = garancija;
		this.maksimalniBrojRingli = maksimalniBrojRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaksimalniBrojRingli() {
		return maksimalniBrojRingli;
	}

	public Ringla getGoreLevo() {
		return goreLevo;
	}

	public Ringla getGoreDesno() {
		return goreDesno;
	}

	public Ringla getDoleLevo() {
		return doleLevo;
	}

	public Ringla getDoleDesno() {
		return doleDesno;
	}

	public void pojacaj(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.pojacajRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.pojacajRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.pojacajRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.pojacajRinglu();
		}

		if (this.maksimalniBrojRingli < this.kolikoRingliRade()) {
			this.iskljuciRinglu(5);
			this.pojacaj(pozicija);
		}
	}

	public void iskljuciRinglu(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.iskljuciRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.iskljuciRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.iskljuciRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.iskljuciRinglu();
		} else {
			this.goreLevo.iskljuciRinglu();
			this.goreDesno.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		}
	}

	public int kolikoRingliRade() {
		int suma = 0;
		if (this.doleDesno.jeUkljucena() == true)
			suma++;
		if (this.doleLevo.jeUkljucena() == true)
			suma++;
		if (this.goreDesno.jeUkljucena() == true)
			suma++;
		if (this.goreLevo.jeUkljucena() == true)
			suma++;
		return suma;
	}

	public double ukupnaPotrosnja(int brojSati) {
		return this.doleLevo.potrosnjaEl(brojSati) + this.doleDesno.potrosnjaEl(brojSati)
				+ this.goreDesno.potrosnjaEl(brojSati) + this.goreLevo.potrosnjaEl(brojSati);
	}

	public void stampaj() {
		System.out.println("Marka: " + this.marka + " " + this.garancija);
		System.out.println("Ringle: \n");

		System.out.println("Gore levo: ");
		this.goreLevo.print();
		System.out.println();

		System.out.println("Gore desno: ");
		this.goreDesno.print();
		System.out.println();

		System.out.println("Dole levo: ");
		this.doleLevo.print();
		System.out.println();

		System.out.println("Dole desno: ");
		this.doleDesno.print();
		System.out.println();

	}
}
