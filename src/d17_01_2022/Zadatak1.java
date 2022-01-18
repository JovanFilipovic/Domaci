package d17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();
		double prosecnaOcena = 0;
		int brojPolozenihIspita = 0;

		zeleniKartoni.add(new ZeleniKarton("Jovan", "2000", "Fizika", "Milan", 10));
		zeleniKartoni.add(new ZeleniKarton("Milan", "2001", "Fizika", "Pera", 8));
		zeleniKartoni.add(new ZeleniKarton("Marko", "2002", "Fizika", "Milan", 8));
		zeleniKartoni.add(new ZeleniKarton("Mile", "2003", "Fizika", "Zika", 6));
		zeleniKartoni.add(new ZeleniKarton("Vlada", "2004", "Fizika", "Mladen", 6));
		zeleniKartoni.add(new ZeleniKarton("Andjela", "2005", "Fizika", "Vlada", 10));
		zeleniKartoni.add(new ZeleniKarton("Aleksandra", "2006", "Fizika", "Zika", 10));
		zeleniKartoni.add(new ZeleniKarton("Marija", "2007", "Fizika", "Ana", 9));
		zeleniKartoni.add(new ZeleniKarton("Zika", "2008", "Fizika", "Vlada", 5));
		zeleniKartoni.add(new ZeleniKarton("Pera", "2009", "Fizika", "Milan", 8));

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			zeleniKartoni.get(i).stampaj();
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			prosecnaOcena = prosecnaOcena + zeleniKartoni.get(i).getOcena();
		}

		System.out.println("Prosecna ocena je: " + prosecnaOcena / zeleniKartoni.size());

		prosecnaOcena = 0;
		for (int i = 0; i < zeleniKartoni.size(); i++) {

			if (zeleniKartoni.get(i).polozenIspit() == true) {
				prosecnaOcena = prosecnaOcena + zeleniKartoni.get(i).getOcena();
				brojPolozenihIspita ++;
			}
		}

		System.out.println("Prosecna ocena svih polozenih ispita je: " + prosecnaOcena / brojPolozenihIspita);

	}

}
