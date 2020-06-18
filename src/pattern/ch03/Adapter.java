package pattern.ch03;

public class Adapter {

	public Float twiceOf(Float num) {
		//중간에 로직
		return num * 2;
	}
	
	public Float halfOf(Float num) {
		return num / 2;
	}
}
