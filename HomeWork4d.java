
public class HomeWork4d {

	public static void main(String[] args) {
			String str = new String ("реализовать метод, который вернет количество слов в строке текста");
			int countOfWords = 0;			// переменная-счетчик слов
			for(String s: str.split(" "))
			{
				countOfWords++;
			}
			System.out.println("Количество слов в тексте - " + countOfWords);
		}

}

