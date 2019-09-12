package homeWork9;

public class ImplRun implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			}catch (InterruptedException e) {

			}
		}
	}
	public static void main(String[] args) {
		
		new Thread(new ImplRun()).start();
		
	}

}
