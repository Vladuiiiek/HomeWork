package homeWork9;

public class Сounters {
	private static int i1 = 0;
	private static int i2 = 0;
	static Сounters c = new Сounters();
	private static final Object synch = new Object();

	public static void main(String[] args) {
		c.Thread1();
		c.Thread2();
		
	}
		
public void Thread1() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <=500; i++) {
					System.out.println(getCount1() + "==" + getCount2() + ":" + (getCount1() == getCount2()));
					incrementCount1();
					incrementCount2();
				}
		}
		});
		t1.start();
}

public void Thread2() {
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 500; i++) {
					System.out.println(getCount1() + " == " + getCount2() + ":" + (getCount1() == getCount2()));
					incrementCount1();
					incrementCount2();
					}
			}

		});
		t2.start();
}
	private int getCount1() {
				synchronized (synch) {
				return i1;
			}
	}
	private static int getCount2() {
					synchronized (synch) {
					return i2;
					}
	}
	private static void incrementCount1() {
				synchronized (synch) {
				i1++;
			}
	}
	private static void incrementCount2() {
					synchronized (synch) {
					i2++;
			}
	}
}

	