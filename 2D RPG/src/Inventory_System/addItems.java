package Inventory_System;

import java.awt.Image;

import Inventory_System.Items.Consumables;
import Inventory_System.Items.Item;

public class addItems {
	
	public Item[] allItems;
	
	//============
	//Consumables|
	//============
	public Consumables apple;
	public Consumables bread;
	public addItems(){
		
		//makes the item a new item
		apple = new Consumables();
		bread = new Consumables();
		
		//Side Note: add methods of category class first then continue with parent class methods
		
	//can give the properties of that item
		
		//Consumables
		//===========
		bread =  (Consumables) bread.setFullnessValue(15) /*Start of Item Methods*/ .canUse().assignTexture("/Consumables/Food/betterBread.png").setName("Bread").setDefaultStack();
		apple = (Consumables) apple.setFullnessValue(3) /*Start of Item Methods*/ .canUse().assignTexture("/Consumables/Food/apple.png").setName("Apple").setDefaultStack();
		//===========
		
		
		// adds items into an array (subject to change)
		allItems = new Item[2];
		allItems[0] = apple;
		allItems[1] = bread;
		
		
		
		
	}
	
	
}
