package homeWork6;

public interface Gift {
	public void addCandy(Candy candy);

	public void removeCandy(String candyname);

	public int getCandyAmount();

	public double getWeight();

	public void showCandyList();

	public void showCandyByCarbAmount(double min, double max);

}
