package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	//properties of that item
	Image image;
	int size = 10;
	boolean canUse;
	
	//assigns of image to an item
	public Item assignTexture(String path) {
		this.image = new ImageIcon(this.getClass().getResource(path)).getImage();
		return this;
	}
	
	//if the item can be used
	public Item canUse() {
		this.canUse = true;
		return this;
	}
	
	//returns the image of the given item
	public Image getImage() { return this.image;	}

}
