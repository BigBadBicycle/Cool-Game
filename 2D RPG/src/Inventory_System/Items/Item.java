package Inventory_System.Items;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	//properties of that item
	Image image;
	String name;
	boolean canUse;
	int stack;
	
	//String for what type of item it is:
		//key for string:
		//Consumable if string = "c"
		//Weapon if string = "w"
		//Gear if string = "g"
	char itemCategory;
	
	//========
	//Getters|
	//========
	
	public boolean getCanUse() { return canUse;	}
	
	public char getCategory() { return itemCategory; }
	
	public int getStack() { return stack; }
	
	public String getName() { return this.name; }
	
	public Image getImage() { return this.image;	}
	
	
	//==============================
	//other methods/ sets variables|
	//==============================
	
		//set the name in a string for the item
		public Item setName(String string) {
			this.name = string;
			return this;
		}
		
		//assigns of image to an item
		public Item assignTexture(String path) {
			image = new ImageIcon(this.getClass().getResource(path)).getImage();
			return this;
		}
		
		//if the item can be used
		public Item canUse() {
			this.canUse = true;
			return this;
		}
		
		//sets how big the stack is 
		public Item setStack(int stackAmount) {
			this.stack = stackAmount;
			return this;
		}
		
		//sets stack to default amount
			public Item setDefaultStack() {
				this.stack = 12;
				return this;
			}
	
	
}
