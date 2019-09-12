package homeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spam implements Runnable {

	@Override
	public void run() {
		try {
			printSpam();
		} catch (InterruptedException x) {
			
		}catch (NumberFormatException x) {
		}
		
	}
public void printSpam() throws NumberFormatException, InterruptedException {
	String[] intervalTime = { "1000", "1000", "1000", "2000", "1000" };
	String[] messages = {"1st message", "2nd message", "3rd message", "4th message", "5th message" };
	int i = 0;
	
	while (!Thread.currentThread().isInterrupted() && i < intervalTime.length) {
		
		Thread.sleep(Long.parseLong(intervalTime[i]));
		System.out.println(messages[i]);
				i++;
	}
}

public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Spam sp = new Spam();
	Thread t = new Thread(sp);
				t.start();
	while (true) {
	try {
		if (reader.readLine().isEmpty()) {
			System.out.println("break");
						t.interrupt();
		break;
		}
	} catch (IOException  e) {
			e.printStackTrace();
	}
	}
}

}
