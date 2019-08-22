import java.util.Scanner;

public class HomeWork4b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Заполните массив");
		int MyArray[] = new int[10]; 					
		for (int i = 0; i < MyArray.length; i++) {
			MyArray[i] = sc.nextInt();
		}
		System.out.println("Массив");
		for(int i = 0; i < MyArray.length; i++){
			System.out.println(maxArr(MyArray));
		}
		System.out.println();
		sc.close();
		}
	
	public static int maxArr(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++)
			if (max < array[i])
				max = array[i]; 
		return max;
	}

	

}
