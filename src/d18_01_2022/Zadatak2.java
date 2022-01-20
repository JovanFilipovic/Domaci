package d18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		Kombinacija kombinacija1 = new Kombinacija("123asd496", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija kombinacija2 = new Kombinacija("123aada87", 1, 2, 3, 4, 5, 6, 15);
		Kombinacija kombinacija3 = new Kombinacija("123asd418", 1, 2, 3, 4, 5, 6, 25);
		Kombinacija kombinacija4 = new Kombinacija("123asd429", 1, 2, 3, 4, 5, 6, 35);
		Kombinacija kombinacija5 = new Kombinacija("123asd440", 1, 2, 3, 4, 5, 6, 42);
		Kombinacija kombinacija6 = new Kombinacija("123asd451", 1, 2, 3, 4, 5, 6, 52);
		Kombinacija kombinacija7 = new Kombinacija("123asd402", 1, 2, 3, 4, 5, 6, 32);
		
		Listic listic1 = new Listic();
		
		
		listic1.dodajKombinaciju(kombinacija1);
		listic1.dodajKombinaciju(kombinacija2);
		listic1.dodajKombinaciju(kombinacija3);
		listic1.dodajKombinaciju(kombinacija4);
		listic1.dodajKombinaciju(kombinacija5);
		listic1.dodajKombinaciju(kombinacija6);
		listic1.dodajKombinaciju(kombinacija7);
		
		listic1.daLiJeDobitnaKombinacija(kombinacija1);
		kombinacija1.stampa();
		
		listic1.stampaj();
	}

}
