import java.util.Scanner;

public class HomeWork4c {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ввведите кол-во столбцов:");
//		int l = sc.nextInt();
//		System.out.println("Введите кол-во строк:");
//		int h = sc.nextInt();
//		for(int n=0; n<l;n++) {
//			for(int m=0; m<h;m++) {
//			System.out.print("+");
//			}
//			System.out.println();
		int width;
		int height;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ширину прямоугольника: ");
		width = sc.nextInt();
		System.out.print("Введите высоту прямоугольника: ");
		height = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == height - 1) {
					System.out.print('+');
				} else {
					if (j == 0 || j == width - 1) {
						System.out.print('+');
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.println("");
		}
		sc.close();
	}
		
}
