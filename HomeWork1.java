import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любое шестизначное число: ");
		
		int num = sc.nextInt();
		String text = Integer.toString(num);
		int i = 0;
		int length = 6;
		
		while(i<length) {
			char result = text.charAt(i++);
			System.out.println(result);
		}
		sc.close();
	}
 
}
