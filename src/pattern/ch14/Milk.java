package pattern.ch14;

public class Milk extends AbstAdding {

	public Milk(Ibeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}
}
