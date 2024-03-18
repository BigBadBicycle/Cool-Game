package Inventory_System;

import java.awt.Image;

public class addItems {
	
	public Item bread;
	public Item[] allItems;
	public Item apple;
	public addItems(){
		
		//makes the item a new item
		apple = new Item();
		bread = new Item();
		
		//can give the properties of that item
		bread = bread.canUse().assignTexture("/betterBread.png").setName("Bread");
		apple = apple.canUse().assignTexture("/apple.png").setName("Apple");
		
		// adds items into an array (subject to change)
		allItems = new Item[2];
		allItems[0] = apple;
		allItems[1] = bread;
		
		
		
		
	}
	
	
}
