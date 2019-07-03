import java.util.Scanner;
import java.lang.Math;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус круга: ");
		double r = sc.nextDouble();
		System.out.println("Длина окружности равна " + 2 * Math.PI * r);
 
	}

}
