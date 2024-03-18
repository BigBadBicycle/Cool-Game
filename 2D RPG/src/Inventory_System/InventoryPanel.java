package Inventory_System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Main.InventoryProjectorClass;
import Main.Panel;

public class InventoryPanel extends JFrame implements ActionListener{
	
	JButton[] invButtons;
	JButton next;
	JButton back;
	JButton equip;
	
	int page = 0;
	addItems item;
	
	InventoryProjectorClass invProj;
	
	JLabel slotNumber;
	JLabel itemName;
	JLabel itemAmount;
	
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
	
	public boolean ifEquiped = false;
	
	public InventoryPanel(){
		
	//Jframe stuff
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
		
		invButtons = new JButton[3];
		
		next = new JButton("Next");
		back = new JButton("Back");
		equip = new JButton("Equip");
	
		invButtons[0] = next;
		invButtons[1] = back;
		invButtons[2] = equip;
		
	//JLabel Stuff
		slotNumber = new JLabel("PAGE NUMBER: "+page+"");
		slotNumber.setBounds(147,135,200,200);
		slotNumber.setForeground(Color.WHITE);
		
		itemName = new JLabel("ITEM: ");
		itemName.setBounds(147,155,200,200);
		itemName.setForeground(Color.WHITE);
		
//For Loops
	//item slots
		
		for(int i = 0; i<24; i++) {
			invSlots[i] = new Itemslots();
			invSlots[i].setBounds(200-55,200-60,100,80);
			invSlots[i].setBackground(Color.WHITE);
			this.add(invSlots[page]);
			
		}
		
	//Break in For Loops
		
		
		//Adds Items to Slots
		System.out.println("Putting Items in Slots");
		item = new addItems();
		
		this.addItem(invSlots[0], item.apple);
		this.addItem(invSlots[1], item.bread);
		
		
		//for Loops Resume
		
		//JLabels
		this.add(slotNumber);
		this.add(itemName);
		
		
	//buttons
		for(int j = 0; j<3; j++) {
			invButtons[j].setFocusable(false);
			invButtons[j].setSize(75,50);
			invButtons[j].setFont(new Font("Roboto", Font.PLAIN, 8));
			this.add(invButtons[j]);
		}
		
		invButtons[0].setBounds(250,152,invButtons[0].getWidth(), invButtons[0].getHeight());
		invButtons[1].setBounds(65,152,invButtons[1].getWidth(), invButtons[1].getHeight());
		invButtons[2].setBounds(invSlots[0].getX()+12,70,invButtons[1].getWidth(), invButtons[1].getHeight());
		
	//Button Functions that make them work or whatever
		invButtons[0].addActionListener(e ->{
			
		//Next
		//goes to the next page in the inventory
		if(page>=23) {
			invButtons[0].disable();
		} else {
			this.remove(invSlots[page]);
			page = page+1;
			this.add(invSlots[page]);
			slotNumber.setText("PAGE NUMBER: "+page+"");
			
			if(invSlots[page].item!=null) { 
				itemName.setText("ITEM: "+invSlots[page].item.getName());
				} else {
					itemName.setText("ITEM: ");
				}
			
			this.update(getGraphics());
			}
		});
		
		//Back
		//goes to the previous page in the inventory
		invButtons[1].addActionListener(e ->{
			if(page==0) {
				invButtons[1].disable();
			} else {
				this.remove(invSlots[page]);
				page = page-1;
				this.add(invSlots[page]);
				slotNumber.setText("PAGE NUMBER: "+page+"");
				
				if(invSlots[page].item!=null) { 
				itemName.setText("ITEM: "+invSlots[page].item.getName());
				} else {
					itemName.setText("ITEM: ");
				}
				
				this.update(getGraphics());
				}
		});
		
		//EQUIP
		//equips the Item into the Inventory Projector		
		invButtons[2].addActionListener(e -> {
			if(invSlots[page].item==null) {
				System.out.println("there is nothing there Silly!");
			} else {
				invProj.setItem(invSlots[page].item);
				invProj.setImage();
			}
		});
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
	//==================
	//		METHODS 
	//==================

	//adds readable actions by the user
	 public void actionPerformed(ActionEvent arg0){// TODO Auto-generated method stub
	}
	 
	 //simpler way of adding an item to a item slot
	 private void addItem(Itemslots slots, Item item){
		 slots.setItem(item);
		 slots.updateSlot();
		 
	 }
	 //sets up a universal InventoryProjector
	 public void setInvProj(InventoryProjectorClass projector) {
		this.invProj = projector;
	 }
	 
	
}
