package Inventory_System;

import java.awt.Image;

public class addItems {
	
	public Item bread;
	public Item apple;
	public addItems(){
		
		//makes the item a new item
		apple = new Item();
		bread = new Item();
		
		//can give the properties of that item
		bread = bread.canUse().assignTexture("/betterBread.png");
		apple = apple.canUse().assignTexture("/apple.png");
		
		
		
		
	}
	
	
}
