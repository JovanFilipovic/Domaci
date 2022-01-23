package d21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Magacioner magacioner = new Magacioner("Pera Peric");
		Menadzer menadzer = new Menadzer("Marko Maric");

		Sektor sektor1 = new Sektor("Sektor1", 50050);
		Sektor sektor2 = new Sektor("Sektor2", 60060);
		Sektor sektor3 = new Sektor("Sektor3", 70700);
		Sektor sektor4 = new Sektor("Sektor4", 80000);
		Sektor sektor5 = new Sektor("Sektor5", 99990);

		magacioner.zaposliUSektor(sektor5);
		magacioner.zaposliUSektor(sektor2);
		magacioner.zaposliUSektor(sektor1);

		menadzer.zaposliUSektor(sektor5);
		menadzer.zaposliUSektor(sektor4);
		menadzer.zaposliUSektor(sektor3);
		menadzer.zaposliUSektor(sektor2);
		menadzer.zaposliUSektor(sektor1);

		System.out.println(menadzer.getImeIPrezime() + " je menadzer sa platom: " + menadzer.plataRadnika());
		System.out.println(magacioner.getImeIPrezime() + " je: magacioner sa platom: " + magacioner.plataRadnika());
	}

}
