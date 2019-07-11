import java.util.Scanner;

public class HomeWork3c {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Введите количество линий:");		
		int Lines = sc.nextInt();
		System.out.print("Введите ширину полос:");		
		int width = sc.nextInt(); 
		System.out.print("Введите высоту обоев - ");		
		int height = sc.nextInt();
		sc.close();

		for (int i = 0; i < height; i++) 
		{				
			for (int j = 0; j < Lines; j++) 
			{			
				if ((j % 2) == 0) 
				{						
					for (int k = 0; k < width; k++) 
					{	
						System.out.print("*");			
					}
				} 
				else	for (int k = 0; k < width; k++) 
						{	
						System.out.print("+");
						}
			}
			System.out.println();	 			
		}
	}
}