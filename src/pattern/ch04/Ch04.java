package pattern.ch04;

import pattern.ch04.concrete.HpCreator;
import pattern.ch04.concrete.MpCreator;
import pattern.ch04.framework.Item;
import pattern.ch04.framework.ItemCreator;

public class Ch04 {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
				
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
