package Inventory_System;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;


public class InventoryProjectorClass extends JPanel{

	 public Image image;
	 Item item;
	 
	 public InventoryProjectorClass(){
		 
		 
	  this.setPreferredSize(new Dimension(100,80 ));
	 }
	 
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	 g2D.drawImage(image, 0, 0, null);
	 }
	 
	 
	 public void setInvProjItem(Item item) {
		 this.item = item;
	 }
	 
	 protected void checkItem() {
		 if(this.item==null) {
			 System.out.println("Item is not registered");
		 } else {
			 System.out.println("Item is good in invprojector!");
		 }
	 }
	 
	 protected void setImage() {
		 this.image = this.item.image;
		 this.paint(getGraphics());
	 }
	  
}