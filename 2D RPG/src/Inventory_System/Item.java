package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	Image image;
	int size = 10;
	boolean canUse;
	

	public Item assignTexture(String path) {
		this.image = new ImageIcon(this.getClass().getResource(path)).getImage();
		return this;
	}
	
	public Item canUse() {
		this.canUse = true;
		return this;
	}
	
	public Image getImage() { return this.image;	}

}
