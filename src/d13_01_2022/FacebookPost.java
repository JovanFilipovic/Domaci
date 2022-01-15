package d13_01_2022;

public class FacebookPost {

	private String korisnikObjava;
	private String korisnikZid;
	private String text;
	private int lajkovi;
	private int deljenja;
	
	
	
	
	public void print() {
		System.out.println(this.korisnikObjava + " >>> " + this.korisnikZid);
		System.out.println(this.text);
		System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenja);
	}
	
	public void share() {
		this.deljenja++;
	}
	
	public void dislike() {
		if(this.lajkovi < 0)
			this.lajkovi --;
	}
	
	public void like() {
		this.lajkovi++;
	}
	
	public FacebookPost(String korisnikObjava, String korisniZid, String text) {
		this.korisnikObjava = korisnikObjava;
		this.korisnikZid = korisniZid;
		this.text = text;
	}
	
	public int getDeljenja() {
		return deljenja;
	}
	public String getKorisnikObjava() {
		return korisnikObjava;
	}
	public String getKorisnikZid() {
		return korisnikZid;
	}
	public int getLajkovi() {
		return lajkovi;
	}
	public String getText() {
		return text;
	}
	public void setKorisnikObjava(String korisnikObjava) {
		this.korisnikObjava = korisnikObjava;
	}
	public void setKorisnikZid(String korisnikZid) {
		this.korisnikZid = korisnikZid;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
