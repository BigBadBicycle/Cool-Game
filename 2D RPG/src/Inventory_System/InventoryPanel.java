package Inventory_System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InventoryPanel extends JFrame implements ActionListener{
	
	JButton[] invButtons;
	JButton next;
	JButton back;
	
	int page = 0;
	addItems item;
	
	JLabel slotNumber;
	
	Itemslots[] invSlots;
	
	Itemslots slot1;
	Itemslots slot2;
	Itemslots slot3;
	Itemslots slot4;
	Itemslots slot5;
	Itemslots slot6;
	Itemslots slot7;
	Itemslots slot8;
	Itemslots slot9;
	Itemslots slot10;
	Itemslots slot11;
	Itemslots slot12;
	Itemslots slot13;
	Itemslots slot14;
	Itemslots slot15;
	Itemslots slot16;
	Itemslots slot17;
	Itemslots slot18;
	Itemslots slot19;
	Itemslots slot20;
	Itemslots slot21;
	Itemslots slot22;
	Itemslots slot23;
	Itemslots slot24;
	
	@SuppressWarnings("deprecation")
	public InventoryPanel(){
		
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.getContentPane().setBackground(Color.BLACK);
		
	//slots
		invSlots = new Itemslots[24];
		invSlots[0] = slot1;
		invSlots[1] = slot2;
		invSlots[2] = slot3;
		invSlots[3] = slot4;
		invSlots[4] = slot5;
		invSlots[5] = slot6;
		invSlots[6] = slot7;
		invSlots[7] = slot8;
		invSlots[8] = slot9;
		invSlots[9] = slot10;
		invSlots[10] = slot11;
		invSlots[11] = slot12;
		invSlots[12] = slot13;
		invSlots[13] = slot14;
		invSlots[14] = slot15;
		invSlots[15] = slot16;
		invSlots[16] = slot17;
		invSlots[17] = slot18;
		invSlots[18] = slot19;
		invSlots[19] = slot20;
		invSlots[20] = slot21;
		invSlots[21] = slot22;
		invSlots[22] = slot23;
		invSlots[23] = slot24;
		
	//Buttons
		
		invButtons = new JButton[2];
		
		next = new JButton("Next");
		back = new JButton("Back");
	
		invButtons[0] = next;
		invButtons[1] = back;
		
	//for loops
		
	//item slots
		
		for(int i = 0; i<24; i++) {
			invSlots[i] = new Itemslots();
			invSlots[i].setBounds(200-55,200-60,100,80);
			invSlots[i].setBackground(Color.WHITE);
			this.add(invSlots[page]);
		}
		
		item = new addItems();
		
		
	//buttons
		for(int j = 0; j<2; j++) {
			invButtons[j].setFocusable(false);
			invButtons[j].setSize(50,50);
			invButtons[j].setFont(new Font("Roboto", Font.PLAIN, 7));
			this.add(invButtons[j]);
		}
		
		invButtons[0].setBounds(250,152,invButtons[0].getWidth(), invButtons[0].getHeight());
		invButtons[1].setBounds(90,152,invButtons[1].getWidth(), invButtons[1].getHeight());
		
	//Button Functions that make them work or whatever
		invButtons[0].addActionListener(e ->{
			
		if(page>=23) {
			invButtons[0].disable();
		} else {
			this.remove(invSlots[page]);
			page = page+1;
			this.add(invSlots[page]);
			System.out.println("next, Page: "+page);
			this.update(getGraphics());
			}
		});
		
		invButtons[1].addActionListener(e ->{
			if(page==0) {
				invButtons[1].disable();
			} else {
				this.remove(invSlots[page]);
				page = page-1;
				this.add(invSlots[page]);
				System.out.println("Back, Page: "+page);
				this.update(getGraphics());
				}
		});
		
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void addItem(Item item, Itemslots slots) {
		
	}

	 public void actionPerformed(ActionEvent arg0){// TODO Auto-generated method stub
	}
	
}
