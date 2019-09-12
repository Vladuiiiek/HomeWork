package homeWork9;

public class Thread1 extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			}
			catch (InterruptedException e) {
				
			}
			
		}
	}
	 
	public static void main(String[] args) {
			new Thread1().start();
	}
}