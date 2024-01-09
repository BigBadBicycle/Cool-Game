package Inventory_System;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Inventory_System.Item.*;


public class Itemslots extends JPanel{
	boolean isFilled;
	Image image;
	addItems item;
	public Itemslots(){
		item = new addItems();
	
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		  g2D.drawImage(image, 0, 0, null);
		  
	}
	
	public void collectItem() {
		if(isFilled==true) {
		} else {
			
		}
	}
	
}
