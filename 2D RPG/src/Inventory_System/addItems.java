package Inventory_System;

import java.awt.Image;

public class addItems {
	
	public Item bread;
	public Item apple;
	public addItems(){
		
		apple = new Item();
		bread = new Item();
		
		bread = bread.canUse().assignTexture("/betterBread.png");
		apple = apple.canUse().assignTexture("/apple.png");
		
		
		
		
	}
	
	
}
