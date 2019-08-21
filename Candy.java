package homeWork6;

public class Candy {

	private double proteins;
	private double fats;
	private double carbohydrates;
	private double weight;
	
	public Candy() {

	}
	public Candy(double proteins, double fats, double carbohydrates, double weight) {
		this.proteins = proteins;
		this.fats = fats;
		this.carbohydrates = carbohydrates;
		this.weight = weight;
	}
	public double getProteins() {
		return proteins;
	}
	public void setProteins(double proteins) {
		this.proteins = proteins;
	}
	public double getFats() {
		return fats;
	}
	public void setFats(double fats) {
		this.fats = fats;
	}
	public double getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
			this.weight = weight;
	}
}