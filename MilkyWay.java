package homeWork6;

public class MilkyWay extends Candy {

	private static double proteins = 7.54;
	private static double fats = 11;
	private static double carbohydrates = 54.6;
	private static double weight = 39;

	public MilkyWay() {
		super(proteins, fats, carbohydrates, weight);
	}

	@Override
	public String toString() {
		return "MilkyWay";

	}

}
