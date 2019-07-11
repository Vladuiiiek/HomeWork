
public class HomeWork3d {

	public static void main(String[] args) {
		int[] array = new int[10]; 
		int[] array2 = new int[20]; 
		System.out.println("Набор случайных чисел:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = ((int)(Math.random() * 10));
		}
			for (int i = 0; i < 10; i++) 
			{
				array2[i]=array[i];	
			System.out.print(array[i]);	
			System.out.print("\t");
			}
			System.out.println("\n");
				for(int i = 10; i < array2.length; i++) {
					array2[i] = array[i-10] * 2;	
				}
				System.out.println("Набор случайных чисел, где элементы после 9-го увеличены на 2:");
				for(int i = 0; i < array2.length; i++)
				{
					System.out.print(array2[i]);	
					System.out.print("\t");
				}
	}


}
