package pattern.ch14;

public class AbstAdding implements Ibeverage {
	
	private Ibeverage base;
	
	public AbstAdding(Ibeverage base) {
		super();
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return base.getTotalPrice();
	}

	protected Ibeverage getBase() {
		return base;
	}
}
