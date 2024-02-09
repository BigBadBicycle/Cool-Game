package Inventory_System;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Item {
<<<<<<< HEAD
	public Image image;
	public int size = 10;
	public boolean canUse;
	 public boolean isFood;
=======
	Image image;
	int size = 10;
	boolean canUse;
	
>>>>>>> branch 'master' of https://github.com/BigBadBicycle/Cool-Game.git

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
