package pattern.ch06;

public class Ch06 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(0, 1, 2);
		Circle circle2 = circle.clone();
		
		System.out.println(circle);
		System.out.println(circle2);
		
	}
}
