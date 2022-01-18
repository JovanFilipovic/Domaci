package d17_01_2022;

public class ZeleniKarton {

	private String imeIPrezimeStudenta;
	private String index;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;

	public String getImeIPrezime() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezimeStudenta = imeIPrezime;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	

	public ZeleniKarton(String imeIPrezime, String index, String nazivPredmeta, String imeIPrezimeProfesora,
			int ocena) {
		this.imeIPrezimeStudenta = imeIPrezime;
		this.index = index;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public boolean polozenIspit() {
		return this.ocena > 5 ? true : false;
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena + "\nStudent: " + this.imeIPrezimeStudenta + ", "
				+ this.index + "\nProfesor: " + this.imeIPrezimeProfesora);
	}

}
