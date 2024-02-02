package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

import Inventory_System.InventoryPanel;
import Inventory_System.addItems;


public class InventoryProjectorClass extends JPanel{

	 public Image image;
	 addItems item;
	 
	 public InventoryProjectorClass(){
		 item = new addItems();
		 
		 
		
		 if(image != null){
		 System.out.println(image.getHeight(null));
		 System.out.println(image.getWidth(null));
		 } else { System.out.println("image is null");}
		 
	  this.setPreferredSize(new Dimension(100,80 ));
	 }
	 
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	  
	 g2D.drawImage(image, 0, 0, null);
	 }
	  public Image setImage(Image fakeImage) {
		 this.image = fakeImage;
		 this.update(getGraphics());
		return this.image;
	 }
}