package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning daevu = new SmartAirConditioning();

		daevu.brand = "Daevu";
		daevu.consumptionCold = 2;
		daevu.consumptionHeat = 1;
		daevu.mod = true;
		daevu.tempChosen = 23;

		daevu.print();
		daevu.consumptionMonthKWH();
		daevu.consumpitonMonthMoney();
	}

}
