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
	addItems item;
	public Itemslots(){
		item = new addItems();
		
		if(item == null) {
			System.out.println("Item is null");
		} else {
			System.out.println("Item is good");
		}
	
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		  g2D.drawImage(image, 0, 0, null);
		  
	}
	//checks if the item slot is filled with an item
	private void isFilled(Image image) {
		if(image == null) {
			isFilled = false;
		} else {
			isFilled = true;
		}
	}
	
}
