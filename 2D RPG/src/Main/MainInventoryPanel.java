package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;


public class MainInventoryPanel extends JPanel{

	 Image image;
	 
	 MainInventoryPanel(){
	  
	  image = new ImageIcon("C:/Users/Santiago/eclipse-workspace/testt/src/assets/apple.png").getImage();
	  this.setPreferredSize(new Dimension(500,500));
	 }
	 
	 public void paint(Graphics g) {
	  
	  Graphics2D g2D = (Graphics2D) g;
	  
	  g2D.drawImage(image, 0, 0, null);
	 }
}