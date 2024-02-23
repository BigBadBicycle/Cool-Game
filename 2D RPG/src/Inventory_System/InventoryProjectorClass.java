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
		
		 //sets size
	  this.setPreferredSize(new Dimension(80,100 ));
	 
	 }
	 
	 //draws the image in the main panel
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	 g2D.drawImage(image, 0, 0, null);
	 	
	 }
	 
	 //sets the item of the InvProjector
	 public void setInvProjItem(Item item) {
		 this.item = item;
	 }
	 
	 //Checks if Item is null 
	 protected void checkItem() {
		 if(this.item==null) {
			 System.out.println("Item is not registered");
		 } else {
			 System.out.println("Item is good in invprojector!");
		 }
	 }
	 
	 //sets the item's image as the InvProjector Image
	 public void setImage() {
		 image = item.image;
		
		 System.out.println("Image is set");
		 
		
	 }
	  
}