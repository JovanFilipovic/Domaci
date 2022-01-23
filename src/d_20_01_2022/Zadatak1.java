package d_20_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<Osoba> osobe = new ArrayList<Osoba>();
		
		Igrac igrac1 = new Igrac("Jovan Filipovic", "123149124812", 5000 , 97, "napadac", true);
		Igrac igrac2 = new Igrac("Marko Filipovic", "123149124813", 5001 , 98, "napadac", false);
		Igrac igrac3 = new Igrac("Kosta Filipovic", "123149124814", 5002 , 99, "napadac", false);
		
		Trener trener1 = new Trener("Goran Filipovic", "1231231232132", 4987, 23, "Glavni");
		
		osobe.add(igrac1);
		osobe.add(igrac2);
		osobe.add(igrac3);
		osobe.add(trener1);
		
		for (int i = 0; i < osobe.size(); i++) {
			osobe.get(i).stampaj();
		}
	}

}
