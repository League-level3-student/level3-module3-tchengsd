package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = population / 2;
		taxes += bonus;
		return taxes;
	}

}
