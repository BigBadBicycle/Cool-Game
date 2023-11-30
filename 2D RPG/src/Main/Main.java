package Main;

import Inventory_System.InventoryPanel;
import Scenes.Menu;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(3);
    Menu background = new Menu();
    frame.add(background);
    frame.pack();
    frame.setTitle("RPG Thing");
    frame.setLocationRelativeTo((Component)null);
    frame.setLayout((LayoutManager)null);
    frame.setResizable(false);
    frame.setVisible(true);
    InventoryPanel invPanel = new InventoryPanel();
    
     
  }
}
