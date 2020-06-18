package pattern.ch10;

public class SamFacotry implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
