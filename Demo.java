package homeWork8;

import java.util.Iterator;
import homeWork8.DefaultMyList;
//import homeWork8.ListIterable;
import homeWork8.ListIterator;
//import homeWork8.MyList;

public class Demo {

	public static void main(String[] args) {
		DefaultMyList con = new DefaultMyList();
		con.add("Просто");
		con.add("какой-то");
		con.add("текст");
		ListIterator iter = con.listIterator();
		iter.next();
		iter.set("не знаю");
		iter.next();
		iter.set("что тут");
		iter.next();
		iter.set("написать");
		System.out.println(con);
		System.out.println(iter.previous());
		iter.remove();
		System.out.println(iter.previous());
		iter.set("хммм");
//		 iter.remove();
		System.out.println(iter.previous());
		iter.remove();
//		 iter.set("E");
		System.out.println(con);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
//		for (Object o : con) {
//			System.out.println(o);
//		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Iterator<Object> it = con.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
