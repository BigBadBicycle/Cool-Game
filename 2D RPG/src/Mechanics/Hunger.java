package Mechanics;

public class Hunger {
	
	 final Integer defaultHunger = Integer.valueOf(100);
	  public Integer Hunger = defaultHunger;
	  public boolean canEat;
	  public boolean isFull;
	  public boolean isStarving;
	  
	  
	  
	  public void canEat() {
	    if (this.Hunger.intValue() > 0 && this.Hunger.intValue() < 100) {
	    	
	      this.canEat = true;
	      this.isFull = false;
	      isStarving = false;
	    } else if (this.Hunger.intValue() == 0) {
	    	
	      this.canEat = true;
	      isStarving = true;
	      this.isFull = false;
	    } else {
	    	
	      this.canEat = false;
	      this.isFull = true;
	      isStarving = false;
	    }
	  }
	  
	  public void Heal(boolean canEat) {
		  if(canEat==true) {
			  
		  }
		  
	  }

	private void Starve() {
		if(isStarving == false) {
			
		}
		
	}
	  

}
