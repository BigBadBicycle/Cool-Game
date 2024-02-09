package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
	public Image image;
	public int size = 10;
	public boolean canUse;
	 public boolean isFood;

	public Item assignTexture(String path) {
		 this.image = new ImageIcon(this.getClass().getResource(path)).getImage();
		 return this;
	}
	
	public Item canUse() {
		this.canUse = true;
		return this;
	}
	
	public Item isFood() {
		this.isFood = true;
		return this;
	}
	
}
