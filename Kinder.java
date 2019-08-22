package homeWork6;

public class Kinder extends Candy {

	private static double proteins = 9.80;
	private static double fats = 45.80;
	private static double carbohydrates = 47.40;
	private static double weight = 11;

	public Kinder() {
		super(proteins, fats, carbohydrates, weight);
	}

	@Override
	public String toString() {
		return "Kinder";
	}
}
