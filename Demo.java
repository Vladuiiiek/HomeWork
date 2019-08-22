package homeWork6;

public class Demo {

	public static void main(String[] args) {
		Gift present = new GiftImpl();

		present.addCandy(new Charm());
		present.addCandy(new Charm());
		present.addCandy(new MilkyWay());
		present.addCandy(new MilkyWay());
		present.addCandy(new MilkyWay());
		present.addCandy(new Kinder());
		present.addCandy(new Kinder());
		present.addCandy(new Kinder());
		present.addCandy(new Kinder());
		System.out.println("Candy amount = " + present.getCandyAmount());
		System.out.println("Weight = " + present.getWeight());
		present.showCandyList();
		present.removeCandy("MilkyWay");
		present.removeCandy("MilkyWay");
		System.out.println("===after remove===");
		System.out.println("Candy amount = " + present.getCandyAmount());
		System.out.println("Weight = " + present.getWeight());
		present.showCandyList();
		System.out.println("Candies, which contain more than 40 but less than 60 carbs");
		present.showCandyByCarbAmount(40, 60);
	}
}
