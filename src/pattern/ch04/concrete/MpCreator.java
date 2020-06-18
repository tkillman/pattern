package pattern.ch04.concrete;

import java.util.Date;

import pattern.ch04.framework.Item;
import pattern.ch04.framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemInfo() {
		// TODO Auto-generated method stub
		System.out.println("마나물략 정보 가져옴");
	}

	@Override
	protected void createItemInfo() {
		// TODO Auto-generated method stub
		System.out.println("마나물략 생성" + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpItem();
	}

}
