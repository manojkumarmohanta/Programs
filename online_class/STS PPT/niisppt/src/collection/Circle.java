package collection;

public record Circle(int radius) implements Comparable<Circle>{

	@Override
	public int compareTo(Circle o) {
		return radius-o.radius;
	}

}
