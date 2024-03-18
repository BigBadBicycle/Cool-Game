package Main;

import java.awt.Dimension;
import Inventory_System.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.*;

import Main.InventoryProjectorClass;


public class InventoryProjectorClass extends JPanel{

	 public Image image;
	 public Item item;
	 Image nullImage;
	
	 
	 public InventoryProjectorClass(){
		 //sets size
	  this.setPreferredSize(new Dimension(80,100 ));
	  nullImage = new ImageIcon(this.getClass().getResource("/Empty.png")).getImage();
	  image = nullImage;
	 
	 }
	 
	 //draws the image in the main panel
	 public void paint(Graphics g) {
			Graphics2D g2D = (Graphics2D) g;
			
			  g2D.drawImage(image, 0, 0, null);
			  
		}
	 
	 //sets the item of the InvProjector
	 public void setItem(Item item) {
		 this.item = item;
	 }
	 
	 //sets the item's image as the InvProjector Image
	 public void setImage() {
		 
		 if(this.item==null) {
			 System.out.println("inv projector image null");
			 image = nullImage;
		 } else {
			 System.out.println("Image is set");
			 image = item.getImage();
			 this.update(getGraphics());
		 }
		
		 
		
	 }
	  
}