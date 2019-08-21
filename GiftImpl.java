package homeWork6;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GiftImpl implements Gift {
	ArrayList<Candy> arrayList;

	public GiftImpl() {
		arrayList = new ArrayList<Candy>();
	}

	@Override
	public void addCandy(Candy candy) {
		arrayList.add(candy);
	}

	@Override
	public void removeCandy(String candyname) {
		int index = -1;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).toString().equals(candyname)) {
				index = i;
			}
		}
		if (index == -1) {
			throw new NoSuchElementException();
		}
		arrayList.remove(index);
	}

	@Override
	public int getCandyAmount() {
		return arrayList.size();
	}

	@Override
	public double getWeight() {
		double result = 0;
		for (Candy candy : arrayList) {
			result += candy.getWeight();
		}
		return result;
	}

	@Override
	public void showCandyList() {
		System.out.println("Candies: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i + "." + arrayList.get(i).toString());
		}
	}

	@Override
	public void showCandyByCarbAmount(double min, double max) {
		boolean exist = false;
		for (Candy candy : arrayList) {
			if (candy.getCarbohydrates() < max & candy.getCarbohydrates() > min) {
				exist = true;
				System.out.println(candy.toString());
			}
		}
		if (!exist) {
			System.out.println("No such candy");
		}
	}
}
