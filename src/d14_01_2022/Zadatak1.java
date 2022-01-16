package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Autor autor1 = new Autor("Macar", "Ruto");
		Autor autor2 = new Autor("Unik", "Varat");

		Knjiga knjiga1 = new Knjiga("15125-5125-352-5-332", "Voznja snegom davnog proleca", 1997, autor1);
		Knjiga knjiga2 = new Knjiga("15125-5125-352-5-333", "Voznja snegom davnog leta", 1997, autor2);

		knjiga1.print();
		System.out.println();
		knjiga2.print();
	}

}
