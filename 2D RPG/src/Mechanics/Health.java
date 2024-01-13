package Mechanics;

import Inventory_System.Item;

public class Health {
	
	
  final Integer defaultHP = Integer.valueOf(100);
  public Integer HP = this.defaultHP;
  public boolean canHealUp;
  public boolean isDead;
  
  
  
  public void canHeal() {
    if (this.HP.intValue() > 0 && this.HP.intValue() < 100) {
    	
      this.canHealUp = true;
      this.isDead = false;
      
    } else if (this.HP.intValue() == 0) {
    	
      this.canHealUp = false;
      this.isDead = true;
      
    } else {
    	
      this.canHealUp = false;
      this.isDead = false;
      
    }
  }
  
  public void Heal(boolean canHeal, Item item) {
	  if(canHeal==true) {
		  
	  }
  }
  
}