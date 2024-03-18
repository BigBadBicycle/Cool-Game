package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	//properties of that item
	int size = 10;
	Image image;
	String name;
	boolean canUse;
	
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
	
	//returns the image of the given item
	public Image getImage() { return this.image;	}
	
	//set the name in a string for the item
	public Item setName(String string) {
		this.name = string;
		return this;
}
	//Returns the name of the item
	public String getName() { return this.name; }

}
