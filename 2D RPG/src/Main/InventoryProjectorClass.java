package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

import Inventory_System.addItems;


public class InventoryProjectorClass extends JPanel{

	 Image image;
	 addItems item;
	 
	 InventoryProjectorClass(){
		 item = new addItems();
		 image = item.bread.image;
		 
	  this.setPreferredSize(new Dimension(100,80 ));
	 }
	 
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	  
	  g2D.drawImage(image, 0, 0, null);
	 }
}