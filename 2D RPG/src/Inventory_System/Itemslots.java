package Inventory_System;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Inventory_System.Item.*;
import Main.InventoryProjectorClass;


public class Itemslots extends JPanel{
	boolean isFilled;
	Image image;
	InventoryProjectorClass imager;
	Item item;
	public Itemslots(){
		imager = new InventoryProjectorClass();
		
		try {
		System.out.println(image);
		} catch(Exception e) {
			System.out.println("This didn't work"+e);
		}
		isFilled();
		imager.setImage(this.image);
		
	
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		 // g2D.drawImage(image, 0, 0, null);
		  
	}
	
	private void isFilled() {
		if(image == null) {
			isFilled = false;
		} else {
			isFilled = true;
		}
	}
	
}
