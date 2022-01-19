package d18_01_2022;

import java.util.ArrayList;

public class Student {

	private int brojIntexa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int brojIntexa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIntexa = brojIntexa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public Student(int brojIntexa, String imeIPrezime, String tipStudija, ArrayList<Ispit> ispiti) {
		super();
		this.brojIntexa = brojIntexa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
		this.ispiti = ispiti;
	}

	public int getBrojIntexa() {
		return brojIntexa;
	}

	public void setBrojIntexa(int brojIntexa) {
		this.brojIntexa = brojIntexa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return this.ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		ispiti.add(ispit);
	}

	public double racunajProsek() {
		double suma = 0;
		int brojac = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (ispiti.get(i).jePolozen() == true) {
				suma = suma + ispiti.get(i).getOcena();
				brojac++;
			}
		}
		return suma / brojac;
	}

	public void stampaj() {
		System.out.println(this.brojIntexa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			System.out.println(ispiti.get(i).getNazivPredmeta() + " - " + ispiti.get(i).getImeIPrezimeProfesora() + " - " + ispiti.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.racunajProsek());
	}
}
