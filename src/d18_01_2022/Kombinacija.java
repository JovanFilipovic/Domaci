package d18_01_2022;

import java.util.ArrayList;

public class Kombinacija {

	private String id;
	private int jedan;
	private int dva;
	private int tri;
	private int cetiri;
	private int pet;
	private int sest;
	private int sedam;
	private ArrayList<Integer> kombinacija = new ArrayList<Integer>();

	public Kombinacija(String id, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
		this.id = id;
		this.jedan = jedan;
		this.dva = dva;
		this.tri = tri;
		this.cetiri = cetiri;
		this.pet = pet;
		this.sest = sest;
		this.sedam = sedam;

		this.kombinacija.add(jedan);
		this.kombinacija.add(dva);
		this.kombinacija.add(tri);
		this.kombinacija.add(cetiri);
		this.kombinacija.add(pet);
		this.kombinacija.add(sest);
		this.kombinacija.add(sedam);
	}

	public String getId() {
		return this.id;
	}

	public int getJedan() {
		return jedan;
	}

	public int getDva() {
		return dva;
	}

	public int getTri() {
		return tri;
	}

	public int getCetiri() {
		return cetiri;
	}

	public int getPet() {
		return pet;
	}

	public int getSest() {
		return sest;
	}

	public int getSedam() {
		return sedam;
	}

	public ArrayList<Integer> getKombinacija() {
		return kombinacija;
	}

	public boolean daLiJeIstaKombinacija(Kombinacija kombinacija) {
		for (int i = 0; i < this.kombinacija.size(); i++) {
			if (this.kombinacija.get(i) != kombinacija.getKombinacija().get(i)) {
				return false;
			}
		}
		return true;
	}

	public void stampa() {
		System.out.println("ID: " + this.id);
		System.out.print("brojevi:");
		for (int i = 0; i < this.kombinacija.size(); i++) {
			System.out.print(" " + this.kombinacija.get(i));
		}
		System.out.println();
	}
}
