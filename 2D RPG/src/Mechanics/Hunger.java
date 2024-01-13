package Mechanics;

public class Hunger {
	
	 final Integer defaultHunger = Integer.valueOf(100);
	  public Integer Hunger = defaultHunger;
	  boolean isStarving;
	 
	  Hunger(){
		  
	  }
	  
	  
	  public void checkIfStarving() {
		  if(Hunger == 0) {
			  isStarving = true;
		  } else {
			  isStarving = false;
		  }
		  
	  }
	  
	  public void starve() {
		  
	  }
}

