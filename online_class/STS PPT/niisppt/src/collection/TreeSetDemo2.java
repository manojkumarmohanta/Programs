package collection;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet <Circle> t1 = new TreeSet<Circle>();
		t1.add(new Circle(4));
		t1.add(new Circle(5));
		System.out.println(t1);
		TreeSet<Circle> t2 = new TreeSet<Circle>(new MyComparator2());
		t2.add(new Circle(4));
		t2.add(new Circle(5));
		System.out.println(t2);
	}
}
