package pattern.ch14;

public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;
	
	public Espresso(Ibeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}
	
	private static int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;
		
		return addPrice;
	}
}
