package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	Image image;
	int size = 10;
	boolean canUse;

	public Image assignTexture(String path) {
		return this.image = new ImageIcon(this.getClass().getResource(path)).getImage();
	}
	
	public  boolean canUse(boolean f) {
		return this.canUse = f;
		
	
	
	}
}
