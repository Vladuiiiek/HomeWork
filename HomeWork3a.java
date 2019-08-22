import java.util.Scanner;

public class HomeWork3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MaxStars; 
		System.out.println("Введите количество звезд в фигуре:");
		MaxStars = sc.nextInt();
		sc.close();
		for(int i = 0; i < MaxStars; i++)
		{
			for(int x = 0; x <=i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = MaxStars-1; i >= 0; i--)
		{
			for(int x = i-1; x >=0; x--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
		


