package homeWork9;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Task5_Resourse {

		private final StringBuffer buffer = new StringBuffer();
		private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		
		public void writeBuffer(String str) {
			try{
			    lock.readLock().lock();
			    buffer.append(str);
			} finally{
			    lock.readLock().unlock();
			}
		}
		public String readBuffer() {
			String str;
			try{
			    lock.readLock().lock();
			    str = buffer.toString();;
			} finally{
			    lock.readLock().unlock();
			}
			return str;
		
	}

}
