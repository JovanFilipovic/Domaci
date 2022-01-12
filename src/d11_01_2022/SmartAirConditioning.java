package d11_01_2022;

public class SmartAirConditioning {

	String brand;
	int consumptionHeat;
	int consumptionCold;
	int tempChosen;
	boolean mod;

	public void print() {
		System.out.println(this.brand + " - " + this.mod + " - " + this.tempChosen);
	}

	public double consumptionMonthKWH() {
		if (this.mod == true) {
			return 30 * 15 * this.consumptionHeat;
		}
		return 30 * 15 * this.consumptionCold;
	}

	public double consumpitonMonthMoney() {
		if (this.consumptionMonthKWH() > 350) {
			return 350 * 6 + (consumptionMonthKWH() - 350) * 9;
		}
		return this.consumptionMonthKWH() * 6;
	}
}
