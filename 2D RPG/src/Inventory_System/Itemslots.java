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
		
		if(item != null) {
		this.image = item.getImage();
		isFilled(this.image);
		} else {
		}
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		  g2D.drawImage(image, 0, 0, null);
		  
	}
	
	private void isFilled(Image image) {
		if(image == null) {
			isFilled = false;
		} else {
			isFilled = true;
		}
	}
	
}
