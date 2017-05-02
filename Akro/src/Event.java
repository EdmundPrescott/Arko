public class Event {
    //Current thing player is interacting with
    private String event;
    //Player's action
    private String playerAction;
    
    public Event(){
    
    }
    
    public void setEvent(String x){
   	 this.event=x;
   	 
    }
    
    public void setplayerAction(String y){
   	 this.playerAction=y;
    
    }
    
    public String printEvent(){
    	
    	if(this.event==null){this.event="null";}
   	 
   	 	if(this.playerAction!=null){
    	
   	 	if(this.playerAction.equals("Empty Rum Bottle")&&this.event.equals("Watering Hole")){return "You fill the bottle to the brim";}	
   	 	
   	    if(this.playerAction.equals("Empty Rum Bottle")){return"You fill it with nothing";}
   	 		
    	if(this.playerAction.equals("GumBall")){return "Chew chew chew pop!";}

    	if(this.playerAction.equals("Potion")){return"Swish Glug Mmm";}

    	if(this.playerAction.equals("Super Potion")){return"Swish Glug Glug YUM";}
    	
    	if(this.playerAction.equals("Bowl of Blood")&&this.event.equals("Altar")){return"You pour out the blood and discard the bowl, the blood bubbles and something floats to the surface";}
    	
    	if(this.playerAction.equals("Bowl of Blood")){return"It would be a waste to pour this on the ground";}
    	
    	if(this.playerAction.equals("Bowl")){return"You fill the bowl with your own blood";}
    	
    	if(this.playerAction.equals("Filled Rum Bottle")&&this.event.equals("Dirty Altar")){return"You wash off the alter, inscribed on the alter it says add blood";}
   	 
    	if(this.playerAction.equals("Filled Rum Bottle")){return"You feel like now is not the time use this";}
    	
   	 	}
   	 
   	 	if(this.event.equals("null")){this.event=null;}
   	 	
   	 	if(this.event!=null){
   
   	    if(this.event.equals("Tree")){return "Seems sturdy, there's a dagger firmly planted in its side";}

   	    if(this.event.equals("Stubby Goblin")){return "RAAWRGGAAHH!";}

    	if(this.event.equals("Satanic Ritual Site")){return "A chill goes down your spine as the goosebumps form on your arm, you spot a pair of gauntlets";}
   	 
    	if(this.event.equals("Watering Hole")){return "If only it was soda";}

   	 	if(this.event.equals("Dark Castle")){return "You look on to looming dark walls, do you feel prepared?";}

    	if(this.event.equals("Altar")){return "A blood stained alter";}
    	
    	if(this.event.equals("Dirty Altar")){return "A dirty alter";}
    	
    	if(this.event.equals("Rewarding Altar")){return "A rewarding alter";}

   	 	if(this.event.equals("Rock")){return "It is just a rock ";}

   	 	if(this.event.equals("Shrub")){return "It's actually a bush";}

   	 	if(this.event.equals("Abandoned Camp Site")){return "Not a soul in sight";}

   	 	if(this.event.equals("Revenant")){return "The badge of courage warms against you, you fear no evil";}

   	 	if(this.event.equals("Shop")){return "It seems abandoned but unlooted";}

   	 	if(this.event.equals("Super Potion")){return "Looks tasty";}
   	 
    	if(this.event.equals("Old House")){return "The door is chained shut but you find a entrance around the back inside you find a worn hat on a table and a empty rum bottle next to it";}
   	 
   	 	if(this.event.equals("Abandoned Cart")){return "No signs of life here but there seems to be something in the cart";}

   	 	if(this.event.equals("Potion")){return "Looks good enough to drink";}

    	if(this.event.equals("Courtyard of Fear")){return "You fearlessly stand in the courtyard of fear";}

   	 	if(this.event.equals("Salty Toad")){return "It looks toadlly angry";}

   	 	if(this.event.equals("Spooky Skeleton")){return "Spooky but not too spooky";}

   	 	if(this.event.equals("Pixy")){return "A laughing pixy taunts you";}

   	 	if(this.event.equals("Spirit")){return "It looks at you and you look back through it";}

   	 	if(this.event.equals("Dragon")){return "WOOOOOARQUAAAARRRRAAAAAA!";}

   	 	if(this.event.equals("Clattery bones")){return "Klack clackty klack clack clack";}

   	 	if(this.event.equals("Bob the Obese Orc King")){return "He's just big boned";}

   	 	if(this.event.equals("Boar")){return "WHREEEEE!";}

   	 	if(this.event.equals("Slime")){return "BloOop blop";}

   	 	if(this.event.equals("Slimy Slime")){return "SploOosh BloOop splop blop";}
    	
   	 	if(this.event.equals("Kobold")){return "Looks like a goblin and a dragon had a even uglier child";}
   	 
   	 	}

   	 	return "You find nothing of interest";
    }
    
}