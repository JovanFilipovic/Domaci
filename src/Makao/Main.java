package Makao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Spil spil = new Spil();
		Makao makao = new Makao(spil);

		Igrac igrac1 = new Igrac("Marko Perovic");
		Igrac igrac2 = new Igrac("Jovan Jovanovic");
		Igrac igrac3 = new Igrac("Zarko Murovic");
		Igrac igrac4 = new Igrac("Gusar MOreplovic");

		makao.pristupiStolu(igrac1);
		makao.pristupiStolu(igrac2);
		makao.pristupiStolu(igrac3);
		makao.pristupiStolu(igrac4);

		makao.preseciSpil();

		makao.podeliKarte();
		makao.printTrenutnoStanjeNaStolu();

		while (makao.krajIgre() == false) {

			System.out.println("Unesite znak karte koju igrate");
			String znak = s.next();

			if (znak.toLowerCase().equals("dalje")) {
				makao.sledeci();
			} else if (znak.toLowerCase().equals("nema")) {
				if (makao.getSpil().karte.isEmpty() && makao.getOdigraneKarte().size() > 1) {
					makao.zameniOdigraneKarte();
				}
				if (makao.getSpil().karte.isEmpty()) {
					makao.sledeci();
				} else {
					makao.izvuciKartu();
				}
			} else {

				System.out.println("Unesite broj karte koju igrate");
				int broj = s.nextInt();

				makao.odigrajKartu(broj, znak);
			}
			makao.printTrenutnoStanjeNaStolu();

		}
		System.out.println("Pobednik igre je: ");
		makao.pobednikIgre().print();
	}

}