package d24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Korpa korpa1 = new Korpa();
		
		Tetrapak tetrapak1 = new Tetrapak("1231-1421","Sok jagoda", 120, 150, true, 122);
		Tetrapak tetrapak2 = new Tetrapak("1231-1422","Sok borovnica", 120, 150, true, 122);
	
		StaklenaAmbalaza staklena1 = new StaklenaAmbalaza("dasd1-3213", "KokaKola", 120, 170, 40, true, 80);
		StaklenaAmbalaza staklena2 = new StaklenaAmbalaza("dasd1-3214", "Sprite", 120, 170, 40, false, 70);
		
		SuperKartica superKartica = new SuperKartica("124214-2", "Pera Peric", 200);
		
		korpa1.dodajAmbalazu(tetrapak1);
		korpa1.dodajAmbalazu(tetrapak2);
		korpa1.dodajAmbalazu(staklena1);
		korpa1.dodajAmbalazu(staklena2);
		
		System.out.println((korpa1.ukupnaCenaKorpe(superKartica)));
		
		staklena1.stampaj();
		tetrapak1.stampaj();
	}

}
