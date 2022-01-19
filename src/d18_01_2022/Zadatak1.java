package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Ispit ispit1 = new Ispit("Programiranje1", 10 , "Marko Markovic");
		Ispit ispit2 = new Ispit("Programiranje2", 9 , "Marko Markovic");
		Ispit ispit3 = new Ispit("Programiranje3", 9 , "Marko Markovic");
		Ispit ispit4 = new Ispit("Programiranje4", 7 , "Marko Markovic");
		Ispit ispit5 = new Ispit("Programiranje5", 8 , "Marko Markovic");
		Ispit ispit6 = new Ispit("Programiranje6", 7 , "Marko Markovic");
		Ispit ispit7 = new Ispit("Programiranje7", 9 , "Marko Markovic");
		Ispit ispit8 = new Ispit("Programiranje8", 5 , "Marko Markovic");
		Ispit ispit9 = new Ispit("Programiranje9", 10 , "Marko Markovic");
		Ispit ispit10 = new Ispit("Programiranje10", 5 , "Marko Markovic");
		
		Student student1 = new Student(235, "Mitra Aleksandrovic", "Master");
		student1.dodajIspit(ispit1);
		student1.dodajIspit(ispit2);
		student1.dodajIspit(ispit3);
		student1.dodajIspit(ispit4);
		student1.dodajIspit(ispit5);
		student1.dodajIspit(ispit6);
		student1.dodajIspit(ispit7);
		student1.dodajIspit(ispit8);
		student1.dodajIspit(ispit9);
		student1.dodajIspit(ispit10);
		
		
		student1.stampaj();
		
	}

}
