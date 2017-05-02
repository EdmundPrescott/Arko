import java.util.ArrayList;

public class TypeCheck {

	//Array lists
	private static ArrayList<String> enemies = new ArrayList<String>();
	private static ArrayList<String> items = new ArrayList<String>();
	private static ArrayList<String> equipItems = new ArrayList<String>();
	private static ArrayList<String> useItems = new ArrayList<String>();
	private static ArrayList<String> places = new ArrayList<String>();
	private static ArrayList<String> weapons = new ArrayList<String>();
	private static ArrayList<String> armor = new ArrayList<String>();
  	 
	
	public TypeCheck(){
	
		 enemies.add("Stubby Goblin");
	  	 enemies.add("Salty Toad");
	  	 enemies.add("Pixy");
	  	 enemies.add("Orc");
	  	 enemies.add("Bob the Obese Orc King");
	  	 enemies.add("Boar");
	  	 enemies.add("Slimy Slime");
	  	 enemies.add("Spirit");
	  	 enemies.add("Spooky Skeleton");
	  	 enemies.add("Clattery Bones");
	  	 enemies.add("Revenant");
	  	 enemies.add("Slime");
	  	 enemies.add("Dragon");
	  	 enemies.add("Kobold");
	  	 
	   	 items.add("Map");
	   	 items.add("Rusty Dagger");
	   	 items.add("Empty Rum Bottle");
	   	 items.add("Worn Hat");
	   	 items.add("Badge of Courage");
	   	 items.add("Badge of Quickness");
	   	 items.add("Badge of Accuracy");
	   	 items.add("Warrior Sword");
	   	 items.add("Sturdy Wooden Shield");
	   	 items.add("Potion");
	   	 items.add("Super Potion");
	   	 items.add("Gauntlets of Kilmandaros");
	   	 items.add("Bowl");
	   	 items.add("Filled Rum Bottle");
	   	 items.add("GumBall");
	   	 
	   	 
	   	 equipItems.add("Rusty Dagger");//+1 Damage
	   	 equipItems.add("Worn Hat");//+1 armor
	   	 equipItems.add("Badge of Courage");//+(2,3,4 deciding would be good) health
	   	 equipItems.add("Sturdy Wooden Shield");//+
	   	 equipItems.add("Gauntlets of Kilmandaros");
	   	 equipItems.add("Warrior Sword");
	   	 equipItems.add("Badge of Quickness");
	   	 equipItems.add("Badge of Accuracy");
	   	 
	   	 useItems.add("Map");
	   	 useItems.add("Empty Rum Bottle");
	   	 useItems.add("Filled Rum Bottle");
	   	 useItems.add("Map");
	   	 useItems.add("Potion");
	   	 useItems.add("Super Potion");
	   	 useItems.add("Empty Bowl");
	   	 useItems.add("GumBall");
	   	 useItems.add("Bowl of Blood");
	   	 useItems.add("Bowl");
	   	 
	   	 places.add("Old House");
	   	 places.add("Watering Hole");
	   	 places.add("Satanic Ritual Site");
	   	 places.add("Abandoned Cart");
	   	 places.add("Shop");
	   	 places.add("Dirty Alter");
	   	 places.add("Alter");
	   	 places.add("Alter of Reward");
	   	 places.add("Dark Castle Entrance");
	   	 places.add("Abandoned Camp Site");
	   	 places.add("Courtyard of Fear");
	   	 places.add("Tree");
	   	 
	   	 weapons.add("Rusty Dagger");
	   	 weapons.add("Gauntlets of Kilmandaros");
	   	 weapons.add("Warrior Sword");
	   	 
	   	 armor.add("Sturdy Wooden Shield");
	   	 armor.add("Worn Hat");
		
	}
	
	public static boolean isUseItem(String a){
		if(useItems.contains(a)){return true;}else{
		return false;
		}
	}
	
	public static boolean isItem(String b){
		if(items.contains(b)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isEnemy(String c){
		if(enemies.contains(c)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isEquipItem(String d){
		if(equipItems.contains(d)){
			return true;
		}else{
			return false;
		}	
	}
	
	public static boolean isPlace(String e){
		if(places.contains(e)){
			return true;
		}else{
		return false;}
	}
	
	public static boolean isWeapon(String f){
		if(weapons.contains(f)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean isArmor(String g){
		if(armor.contains(g)){
			return true;
		}else{
			return false;
		}
	}
	
}
