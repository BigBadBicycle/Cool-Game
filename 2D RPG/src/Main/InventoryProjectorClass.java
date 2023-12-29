package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;


public class InventoryProjectorClass extends JPanel{

	 Image image;
	 
	 InventoryProjectorClass(){
	  
		 image = new ImageIcon(this.getClass().getResource("/betterBread.png")).getImage();
		 System.out.println(image.getHeight(null));
		 System.out.println(image.getWidth(null));
		 
	  this.setPreferredSize(new Dimension(100,80 ));
	 }
	 
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	  
	  g2D.drawImage(image, 0, 0, null);
	 }
}