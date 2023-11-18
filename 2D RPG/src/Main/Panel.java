package Main;

import Mechanics.Health;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel extends JPanel implements Runnable, ActionListener {
	
  final int P_WIDTH = 700;
  final int P_HEIGHT = 600;
  int hp;
  
  String opt1Text = "Option 1";
  String opt2Text = "Option 2";
  String opt3Text = "Option 3";
  String opt4Text = "Option 4";
  String sText = "Hello, this is the chimney of food ";
  
  JButton[] panelButtons;
  JButton doAction;
  JButton option1;
  JButton option2;
  JButton option3;
  JButton option4;
  JButton inventoryB;
  
  JProgressBar[] bars = new JProgressBar[2];
  JProgressBar health;
  JProgressBar hunger;
  
  JLabel[] labels = new JLabel[4];
  JLabel healthLabel;
  JLabel hungerLabel;
  JLabel title;
  JLabel itemShow;
  JTextArea storyText = new JTextArea();
  
  ImageIcon image;
  
  JScrollPane scrollPane = new JScrollPane(storyText);
  
  JPanel title_panel;
  JPanel optionButtons;
  JPanel story;
  JPanel itemDisplay;
  
  Thread gameLoop;
  
  public Panel() {
    Health HClass = new Health();
    
    //images
    try {
    	image = new ImageIcon("apple.png");
    	System.out.println(image);
    } catch(Exception e) {
    	System.out.println("Error finding the image");
    }
    
    
    setPreferredSize(new Dimension(700, 600));
    setBackground(Color.black);
    
    //panels
    title_panel = new JPanel();
    title_panel.setBackground(new Color(87, 85, 85));
    title_panel.setBounds(P_WIDTH*1/2-150,15,300,50);
    
    itemDisplay = new JPanel();
    itemDisplay.setBackground(new Color(241, 245, 132));
    itemDisplay.setBounds(P_WIDTH-125,P_HEIGHT-90,80,80);
    
    optionButtons = new JPanel();
    optionButtons.setBackground(new Color(87, 85, 85));
    optionButtons.setBounds(title_panel.getX()-150,title_panel.getY()+title_panel.getHeight()+175,600,250);
    optionButtons.setLayout(new GridLayout(4,1,5,5));
    
    story = new JPanel();
    story.setBackground(new Color(138, 90, 73));
    story.setLayout(new FlowLayout());
    story.setBounds(title_panel.getX()-150,title_panel.getY()+title_panel.getHeight()+25,600,125 );
    //adds text to story panel
    storyText.setLineWrap(true);
    storyText.setBackground(new Color(138, 90, 73));
    storyText.setForeground(Color.white);
    storyText.setText(sText);
    storyText.setEditable(false);
    storyText.setBounds(title_panel.getX()-150,title_panel.getY()+title_panel.getHeight()+25,600,125);
    storyText.setFont(new Font("Roboto", Font.BOLD, 15));
    storyText.setWrapStyleWord(true);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    story.add(storyText);
    
    
    //bars
    health = new JProgressBar();
    hunger = new JProgressBar();
    bars[0] = this.health;
    bars[1] = this.hunger;
    bars[0].setValue(HClass.HP.intValue());
    bars[0].setBounds(200, 540, 300, 25);
    bars[0].setForeground(new Color(49, 232, 110));
    bars[0].setBackground(new Color(201, 32, 6));
    bars[1].setValue(100);
    bars[1].setBounds(200, 570, 300, 25);
    bars[1].setForeground(new Color(189, 134, 32));
    bars[1].setBackground(new Color(209, 209, 13));
    
    //labels
    healthLabel = new JLabel("Health");
    hungerLabel = new JLabel("Hunger");
    title = new JLabel("Story");
    itemShow = new JLabel();
    
    labels[0] = this.healthLabel;
    labels[1] = this.hungerLabel;
    labels[2] = this.title;
    labels[3] = this.itemShow;
    
    //button
    panelButtons = new JButton[5];
    
    doAction = new JButton();
    option1 = new JButton(opt1Text);
    option2 = new JButton(opt2Text);
    option3 = new JButton(opt3Text);
    option4 = new JButton(opt4Text);
    
    panelButtons[0] = doAction;
    panelButtons[1] = option1;
    panelButtons[2] = option2;
    panelButtons[3] = option3;
    panelButtons[4] = option4;
    
    //add panels
    this.add(title_panel);
    this.add(optionButtons);
    this.add(story);
    this.add(itemDisplay);
    
    //for Labels
    for (int j = 0; j < 4; j++) {
      this.labels[j].setSize(100, 100);
      this.labels[j].setForeground(Color.white);
      this.labels[j].setBackground(Color.LIGHT_GRAY);
      this.labels[j].setFont(new Font("Roboto", Font.PLAIN, 15));
      if(j==3) {
    	  labels[3].setIcon(image);
    	  labels[3].setBounds(itemDisplay.getX(), itemDisplay.getY(), 80,80);
    	  itemDisplay.add(labels[3]);
      }	else {
      this.add(this.labels[j]);
      } 
    }
   
    this.labels[0].setBounds(this.bars[0].getX() - 80, this.bars[0].getY() - 38, this.labels[2].getWidth(), this.labels[2].getHeight());
    this.labels[1].setBounds(this.bars[1].getX() - 80, this.bars[1].getY() - 38, this.labels[2].getWidth(), this.labels[2].getHeight());
    this.labels[2].setBounds(300, 300, this.labels[2].getWidth(), this.labels[2].getHeight());
    labels[2].setFont(new Font("Roboto", Font.BOLD,30));
    this.remove(labels[2]);
    this.remove(labels[3]);
    title_panel.add(labels[2]);
    
    //for bars
    for (int i = 0; i < 2; i++) {
      this.bars[i].setStringPainted(true);
      add(this.bars[i]);
    } 
    
    //for Buttons
    for (int k = 0; k < 5; k++) {
      this.panelButtons[k].setFocusable(false);
      this.panelButtons[k].setSize(50, 100);
      this.panelButtons[k].setBackground(new Color(102, 85, 77));
      this.panelButtons[k].setForeground(Color.white);
      this.panelButtons[k].setFont(new Font("Roboto", Font.PLAIN, 15));
      if(k==0) {
      } else {
    	  optionButtons.add(panelButtons[k]);
      }
      
    } 
     startGameLoop();
    setLayout((LayoutManager)null);
  }
  
  public void startGameLoop() {
    this.gameLoop = new Thread(this);
  }
  
  public void run() {
    while (this.gameLoop != null) {
    	System.out.println("Gameloop is running");
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
	
