package Inventory_System;

import java.awt.Image;

public class addItems {
	
	public Item bread;
	public addItems(){
		bread = new Item();
		
		bread.canUse().assignTexture("/betterBread.png").isFood();
		
		
		
	}
	
	
}
