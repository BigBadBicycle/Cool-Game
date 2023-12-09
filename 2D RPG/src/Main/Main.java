package Main;

import Inventory_System.InventoryPanel;
import Scenes.Menu;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame mainFrame = new JFrame();
    mainFrame.setDefaultCloseOperation(3);
    Menu background = new Menu();
    mainFrame.add(background);
    mainFrame.pack();
    mainFrame.setTitle("RPG Thing");
    mainFrame.setLocationRelativeTo((Component)null);
    mainFrame.setLayout((LayoutManager)null);
    mainFrame.setResizable(false);
    mainFrame.setVisible(true);
    
     
  }
}
