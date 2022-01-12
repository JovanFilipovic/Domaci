package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod lopta = new Proizvod();
		Proizvod snowboard = new Proizvod();

		lopta.cena = 2500;
		lopta.naziv = "Lopta";
		lopta.tezina = 330;

		snowboard.cena = 24000;
		snowboard.naziv = "Snowboard";
		snowboard.tezina = 3158;

		lopta.stampaj();
		lopta.povecajCenu(150);
		lopta.racunajPostarinu();
		lopta.vratiCenuSaPopustom(44);

		snowboard.stampaj();
		snowboard.povecajCenu(250);
		snowboard.racunajPostarinu();
		snowboard.vratiCenuSaPopustom(44);
	}

}
