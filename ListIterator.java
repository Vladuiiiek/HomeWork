package homeWork8;

import java.util.Iterator;

public interface ListIterator extends Iterator<Object>{
	boolean hasPrevious();

	Object previous();

	void set(Object var1);

	void remove();
}
