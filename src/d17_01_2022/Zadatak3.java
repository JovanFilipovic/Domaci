package d17_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		Ringla goreLevo = new Ringla("ekspres", 1.5);
		Ringla goreDesno = new Ringla("ekspres", 1.5);
		Ringla doleLevo = new Ringla("obicna", 0.8);
		Ringla doleDesno = new Ringla("obicna", 0.8);

		ElektricniSporet sporet1 = new ElektricniSporet("Ferrari", 2, 3, goreLevo, goreDesno, doleLevo, doleDesno);

		sporet1.pojacaj(1);
		sporet1.pojacaj(1);
		sporet1.pojacaj(1);
		sporet1.pojacaj(1);
		sporet1.pojacaj(2);
		sporet1.pojacaj(2);
		sporet1.pojacaj(3);
		sporet1.pojacaj(4);
		sporet1.pojacaj(4);
		sporet1.pojacaj(2);
		sporet1.pojacaj(1);
		sporet1.pojacaj(4);
		sporet1.pojacaj(4);
		sporet1.pojacaj(4);

		sporet1.stampaj();
		System.out.println("\n" + sporet1.ukupnaPotrosnja(3) + "kW");
	}

}
