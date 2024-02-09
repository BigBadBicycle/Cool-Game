package Inventory_System;

import java.awt.Image;

public class addItems {
	
	public Item bread;
<<<<<<< HEAD
	public addItems(){
=======
	public Item apple;
	public addItems(){
		
		apple = new Item();
>>>>>>> branch 'master' of https://github.com/BigBadBicycle/Cool-Game.git
		bread = new Item();
		
		bread = bread.canUse().assignTexture("/betterBread.png");
		apple = apple.canUse().assignTexture("/apple.png");
		
		
		
		
	}
	
	
}
