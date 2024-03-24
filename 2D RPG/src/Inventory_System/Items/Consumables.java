package Inventory_System.Items;

public class Consumables extends Item{
	
	int healthValue = 0;
	int fullnessValue = 0;
	int rotChance;
	
	boolean isRotted = false;
	
	
	
	
	public Consumables(){
		super.itemCategory = 'c';
		
	}

//METHODS:
	
	//sets health value; how much is healed
	public Consumables setHealthValue(int healthy) {
		healthValue = healthy;
		return this;
	}
	
	//sets hunger value; how much hunger is restored
	public Consumables setFullnessValue(int hunger) {
		fullnessValue = hunger;
		return this;
	}
	
	//Get information Methods
	
	public int getHealthValue() { return healthValue;  }
	
	public int getHungerValue() { return fullnessValue;  }
	
	
	
	// Actions
	
	//uses that item to gain health or hunger or other effects
	public void Consume() {
		
	}
	
	
}
