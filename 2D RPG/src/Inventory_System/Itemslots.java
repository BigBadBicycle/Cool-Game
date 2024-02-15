package Inventory_System;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.EOFException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Inventory_System.Item.*;


public class Itemslots extends JPanel{
	boolean isFilled;
	Image image;
	Item item;
	
	public Itemslots(){
		

	}
	
	//draws the item
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		  g2D.drawImage(image, 0, 0, null);
		  
	}
	
	//checks if Item is null
	public void checkItem() {
		if(this.item == null) {
			System.out.println("Item is null");
		} else {
			System.out.println("Item is not null");
		}
	}
	
	//adds item to slot
	public void setItem(Item item) {
		this.item = item;
	}
	
	//updates the item slot with the image
	public void updateSlot() {
		image = item.image;
		if(image ==null) {System.out.println("slot image is null"); }
		
	}
	
	
	
	
}
