package homeWork6;

public class Charm extends Candy {

	private static double proteins = 5.2;
	private static double fats = 39.25;
	private static double carbohydrates = 28.72;
	private static double weight = 10;

	public Charm() {
		super(proteins, fats, carbohydrates, weight);
	}

	@Override
	public String toString() {
		return "Charm";

	}

}
