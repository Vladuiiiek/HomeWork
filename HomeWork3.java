import java.util.Scanner;

import java.lang.Math;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону a : ");
		double a = sc.nextDouble();
		System.out.println("Введите сторону b : ");
		double b = sc.nextDouble();
		System.out.println("Введите сторону c : ");
		double c = sc.nextDouble();
		double p = ((a + b + c) / 2);
		
		System.out.println("Площадь треугольника равна " +  Math.sqrt(p * (p - a) * (p - b) * (p - c)) + " кв.см.");

		sc.close();
	}

}
