package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Racun racun1 = new Racun("141-12-44214","Milo Lukovic", 100000);
		Racun racun2 = new Racun("141-12-44215","Rale Mukovic ", 250500);

		Transakcija transakcija1 = new Transakcija("12354156", racun1, racun2);
		
		transakcija1.izvrsiTransakciju(4000);
		
		transakcija1.stampaj();
		
		racun1.stampaj();
		racun2.stampaj();
		
	}
}
