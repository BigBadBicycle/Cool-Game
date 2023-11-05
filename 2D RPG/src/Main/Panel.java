package Main;

import Mechanics.Health;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Panel extends JPanel implements Runnable, ActionListener {
  final int P_WIDTH = 700;
  
  final int P_HEIGHT = 600;
  
  int hp;
  
  JButton[] panelButtons = new JButton[5];
  
  JButton doAction;
  
  JButton option1;
  
  JButton option2;
  
  JButton option3;
  
  JButton option4;
  
  JProgressBar[] bars = new JProgressBar[2];
  
  JProgressBar health;
  
  JProgressBar hunger;
  
  JLabel[] labels = new JLabel[3];
  
  JLabel healthLabel;
  
  JLabel hungerLabel;
  
  JLabel title;
  
  JPanel title_panel = new JPanel();
  
  Thread gameLoop;
  
  public Panel() {
    Health HClass = new Health();
    
    
    setPreferredSize(new Dimension(700, 600));
    setBackground(Color.black);
    this.health = new JProgressBar();
    this.hunger = new JProgressBar();
    this.bars[0] = this.health;
    this.bars[1] = this.hunger;
    this.bars[0].setValue(HClass.HP.intValue());
    this.bars[0].setBounds(200, 540, 300, 25);
    this.bars[0].setForeground(new Color(49, 232, 110));
    this.bars[0].setBackground(new Color(201, 32, 6));
    this.bars[1].setValue(100);
    this.bars[1].setBounds(200, 570, 300, 25);
    this.bars[1].setForeground(new Color(189, 134, 32));
    this.bars[1].setBackground(new Color(209, 209, 13));
    this.healthLabel = new JLabel("Health");
    this.hungerLabel = new JLabel("Hunger");
    this.title = new JLabel("Story");
    this.labels[0] = this.healthLabel;
    this.labels[1] = this.hungerLabel;
    this.labels[2] = this.title;
    this.doAction = new JButton("Action Button");
    this.option1 = new JButton("Option 1");
    this.option2 = new JButton("Option 2");
    this.option3 = new JButton("Option 3");
    this.option4 = new JButton("Option 4");
    this.doAction = this.panelButtons[0];
    this.option1 = this.panelButtons[1];
    this.option2 = this.panelButtons[2];
    this.option3 = this.panelButtons[3];
    this.option4 = this.panelButtons[4];
    
    for (int j = 0; j < 3; j++) {
      this.labels[j].setSize(100, 100);
      this.labels[j].setForeground(Color.white);
      this.labels[j].setBackground(Color.LIGHT_GRAY);
      this.labels[j].setFont(new Font("Roboto", 1, 15));
      add(this.labels[j]);
    } 
    this.labels[0].setBounds(this.bars[0].getX() - 80, this.bars[0].getY() - 38, this.labels[2].getWidth(), this.labels[2].getHeight());
    this.labels[1].setBounds(this.bars[1].getX() - 80, this.bars[1].getY() - 38, this.labels[2].getWidth(), this.labels[2].getHeight());
    this.labels[2].setBounds(300, 300, this.labels[2].getWidth(), this.labels[2].getHeight());
    for (int i = 0; i < 2; i++) {
      this.bars[i].setStringPainted(true);
      add(this.bars[i]);
    } 
    for (int k = 0; k < 5; k++) {
      this.panelButtons[k].setFocusable(false);
      this.panelButtons[k].setSize(300, 300);
      this.panelButtons[k].setFont(new Font("Roboto", 1, 15));
      add(this.panelButtons[k]);
    } 
    setLayout((LayoutManager)null);
  }
  
  public void startGameLoop() {
    this.gameLoop = new Thread(this);
  }
  
  public void run() {
    while (this.gameLoop != null) {
    	
      update();
      repaint();
      
    } 
  }
  
  private void update() {
	  
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
  }
  
  public void actionPerformed(ActionEvent e) {}
}
