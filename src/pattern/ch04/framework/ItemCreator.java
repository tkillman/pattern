package pattern.ch04.framework;

public abstract class ItemCreator {
	public Item create() {
		requestItemInfo();
		Item item = createItem();
		createItemInfo();
		return item;
	}
	
	// 아이템 정보 요청
	abstract protected void requestItemInfo();
	
	// 아이템 생성정보
	abstract protected void createItemInfo();
	
	//아이템 생성
	abstract protected Item createItem();
	
}
