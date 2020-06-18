package pattern.ch10;

public class Ch10 {
	
	public static void main(String[] args) {
		
		BikeFactory bikeFactory = new SamFacotry();
		
		Body body = bikeFactory.createBody();
		Wheel wheel = bikeFactory.createWheel();
		
		System.out.println(body);
		System.out.println(wheel);
	}
}
