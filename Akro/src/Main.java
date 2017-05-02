import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	//Array lists/lists
    	String[][] board=new String[16][16];
    	ArrayList<String> inventory = new ArrayList<String>();
    	ArrayList<String> equipped = new ArrayList<String>();
    	ArrayList<String> badges = new ArrayList<String>();
    	
    	//Array list/list initializations
    	//inventory.add("");
    	inventory.add("GumBall");
    	
    	board[0][14]="Old House";
    	board[0][12]="Stubby Goblin";
    	board[0][10]="Wall";
    	board[0][9]="Pixy";
    	board[0][7]="Potion";
    	board[0][6]="Wall";
    	board[0][5]="Orc";
    	board[0][3]="Wall";
    	board[0][1]="Wall";
    	board[0][0]="Badge of Quickness";
    	board[1][15]="Wall";
    	board[1][14]="Wall";
    	board[1][13]="Wall";
    	board[1][10]="Wall";
    	board[1][8]="Wall";
    	board[1][4]="Wall";
    	board[1][2]="Orc";
    	board[1][1]="Wall";
    	board[1][0]="Bob the Obese Orc King";
    	board[2][15]="Potion";
    	board[2][14]="Salty Toad";
    	board[2][12]="Tree";
    	board[2][11]="Stubby Goblin";
    	board[2][10]="Wall";
    	board[2][8]="Wall";
    	board[2][7]="Pixy";
    	board[2][6]="Wall";
    	board[2][3]="Orc";
    	board[2][2]="Wall";
    	board[3][0]="Wall";
    	board[3][1]="Orc";
    	board[3][4]="Wall";
    	board[3][5]="Orc";
    	board[3][6]="Wall";
    	board[3][8]="Wall";
    	board[3][9]="Pixy";
    	board[3][10]="Wall";
    	board[3][12]="Potion";
    	board[3][13]="Wall";
    	board[3][14]="Watering Hole";
    	board[3][15]="Salty Toad";
    	board[4][0]="Wall";
    	board[4][1]="Wall";
    	board[4][2]="Wall";
    	board[4][3]="Wall";
    	board[4][4]="Wall";
    	board[4][5]="Wall";
    	board[4][6]="Wall";
    	board[4][7]="Pixy";
    	board[4][8]="Wall";
    	board[4][9]="Potion";
    	board[4][11]="Wall";
    	board[4][12]="Wall";
    	board[4][13]="Satanic Ritual Site";
    	board[4][14]="Wall";
    	board[5][0]="Boar";
    	board[5][5]="Boar";
    	board[5][9]="Wall";
    	board[5][10]="Salty Toad";
    	board[5][11]="Shrub";
    	board[5][13]="Potion";
    	board[5][14]="Salty Toad";
    	board[6][3]="Boar";
    	board[6][7]="Wall";
    	board[6][10]="Wall";
    	board[6][11]="Wall";
    	board[6][12]="Wall";
    	board[6][13]="Wall";
    	board[6][14]="Wall";
    	board[6][15]="Wall";
    	board[7][3]="Abandoned Cart";
    	board[7][6]="Boar";
    	board[7][7]="Wall";
    	board[7][8]="Wall";
    	board[7][12]="Wall";
    	board[8][2]="Boar";
    	board[8][7]="Wall";
    	board[8][8]="Shop";
    	board[8][9]="Wall";
    	board[8][10]="Wall";
    	board[8][12]="Wall";
    	board[8][13]="Spirit";
    	board[8][14]="Wall";
    	board[9][6]="Boar";
    	board[9][7]="Wall";
    	board[9][9]="Dirty Altar";
    	board[9][10]="Wall";
    	board[9][14]="Wall";
    	board[10][0]="Wall";
    	board[10][1]="Wall";
    	board[10][2]="Wall";
    	board[10][3]="Wall";
    	board[10][4]="Wall";
    	board[10][5]="Wall";
    	board[10][7]="Slimy Slime";
    	board[10][10]="Slimy Slime";
    	board[10][11]="Wall";
    	board[10][12]="Wall";
    	board[10][13]="Wall";
    	board[10][14]="Wall";
    	board[10][15]="Dark Castle";
    	board[11][1]="Rock";
    	board[11][3]="Kobold";
    	board[11][5]="Shrub";
    	board[11][6]="Wall";
    	board[11][7]="Wall";
    	board[11][8]="Wall";
    	board[11][9]="Wall";
    	board[11][12]="Wall";
    	board[11][13]="Spooky Skeleton";
    	board[11][14]="Spooky Skeleton";
    	board[12][0]="Rock";
    	board[12][2]="Wall";
    	board[12][6]="Slime";
    	board[12][9]="Wall";
    	board[12][10]="Slimy Slime";
    	board[12][11]="Shrub";
    	board[12][12]="Wall";
    	board[12][13]="Spooky Skeleton";
    	board[12][14]="Clattery Bones";
    	board[12][15]="Spooky Skeleton";
    	board[13][0]="Rock";
    	board[13][2]="Wall";
    	board[13][4]="Abandoned Camp Site";
    	board[13][5]="Wall";
    	board[13][8]="Slime";
    	board[13][9]="Wall";
    	board[13][12]="Wall";
    	board[13][13]="Spirit";
    	board[13][14]="Spirit";
    	board[13][15]="Spirit";
    	board[14][0]="Wall";
    	board[14][1]="Rock";
    	board[14][2]="Wall";
    	board[14][3]="Shrub";
    	board[14][5]="Wall";
    	board[14][7]="Shrub";
    	board[14][9]="Wall";
    	board[14][11]="Slimy Slime";
    	board[14][12]="Wall";
    	board[14][13]="Wall";
    	board[14][14]="Wall";
    	board[11][15]="Courtyard of Fear";
    	board[15][1]="Dragon";
    	board[15][2]="Wall";
    	board[15][4]="Shrub";
    	board[15][5]="Wall";
    	board[15][7]="Slime";
    	board[15][9]="Slime";
    	board[15][12]="Wall";
    	board[15][0]="Badge of Courage";
    	board[15][13]="way out of the maze! You win!";
    	board[15][15]="Revenant";   	
    	
    	//Booleans
    	boolean gameEnd=false;
    	boolean combat=false;
    	boolean stopMovement=false;
    	boolean badValue=true;
    	boolean stopCombat=false;
    	boolean courage=false;
    	boolean accuracy=false;
    	boolean quickness=false;
    	boolean cheats=false;
    	
    	//Strings(and Scanner)
    	Scanner console=new Scanner(System.in);
    	String userInput="";userInput=console.next();
    	String looted="Looted ";
    	
    	//Integers
    	int playerX=0;
    	int playerY=15;
    	int health=6;
    	int dealtDamage;
    	int attackDamage=1;
    	int damageBlock=0;
    	int random;
    	
    	//Classes
    	TypeCheck BoardCheck=new TypeCheck();
    	Event Event=new Event();
    	Combat Combat =new Combat();
    	
    	//Pre-game stuff
		System.out.println("You're trapped in a maze, escape!\n Pro tip: Type help");
    	
    	//Game loop
    	while(gameEnd==false&&!userInput.equals("quit")){
    		
    		/////Start of Movement System/////
    		if(userInput.equals("w")||userInput.equals("a")||userInput.equals("s")||userInput.equals("d")){
    			if(combat==true){stopMovement=true;}
    			if(stopMovement==false){
    	
    			if(playerY-1!=-1){
    			if(board[playerX][playerY-1]!=null){
    			if(userInput.equals("w")&&board[playerX][playerY-1].equals("Wall")){
    				System.out.println("There is a wall blocking your path");stopMovement=true;}
    			}
    			}
    			
    			if(playerX-1!=-1){
    			if(board[playerX-1][playerY]!=null){
    			if(userInput.equals("a")&&board[playerX-1][playerY].equals("Wall")){
    				System.out.println("There is a wall blocking your path");stopMovement=true;}
    			}
    			}
    			
    			if(playerX+1!=16){
    			if(board[playerX+1][playerY]!=null){
    			if(userInput.equals("d")&&board[playerX+1][playerY].equals("Wall")){
    				System.out.println("There is a wall blocking your path");stopMovement=true;}
    			}
    			}
    			
    			if(playerY+1!=16){
    			if(board[playerX][playerY+1]!=null){	
    			if(userInput.equals("s")&&board[playerX][playerY+1].equals("Wall")){
    				System.out.println("There is a wall blocking your path");stopMovement=true;}
    			}
    			}
    			
    			if(stopMovement==false){
    			
    			if(userInput.equals("a")&&playerX-1>-1){playerX=playerX-1;System.out.println("You went west");}else
		   		 
    		    if(userInput.equals("a")){System.out.println("There is a wall blocking your path");stopMovement=true;}
    		   	 
    		   	if(userInput.equals("d")&&playerX+1<16){playerX=playerX+1;System.out.println("You went east");}else
    		   		 
    		   	if(userInput.equals("d")){System.out.println("There is a wall blocking your path");stopMovement=true;}
    		   	 
    		   	if(userInput.equals("w")&&playerY-1>-1){playerY=playerY-1;System.out.println("You went north");}else
    		   		 
    		   	if(userInput.equals("w")){System.out.println("There is a wall blocking your path");stopMovement=true;}
    		   	 
    		   	if(userInput.equals("s")&&playerY+1<16){playerY=playerY+1;System.out.println("You went south");}else
    		   		 
    		   	if(userInput.equals("s")){System.out.println("There is a wall blocking your path");stopMovement=true;}	
    			
    			}
    			
    			if(stopMovement==false){
    			if(board[playerX][playerY]!=null){
    	    		System.out.println("You found a "+board[playerX][playerY]);
    	    	}
    			}
    			
    			}
    			
    			stopMovement=false;
    		}
    		
    		if(board[playerX][playerY]!=null){
    		if(board[playerX][playerY].equals("Courtyard of Fear")&&courage==false){
    			System.out.println("You shudden and go back");
    			playerX--;
    		}
    		}
    		/////End of Movement System/////
    		
    		/////Start Gear Modifier Phase/////
    		if(equipped.size()>0){
    			attackDamage=1;
    			damageBlock=0;
    			if(equipped.contains("Rusty Dagger")){
    				attackDamage+=1;
    			}
    			
    			if(equipped.contains("Worn Hat")){
    				damageBlock+=1;
    			}
    			
    			if(equipped.contains("Sturdy Wooden Sheild")){
    				damageBlock+=2;
    			}
    			
    			if(equipped.contains("Gauntlets of Kilmandaros")){
    				attackDamage+=10;health-=3;
    			}
    			
    			if(equipped.contains("Warrior Sword")){
    				attackDamage+=3;
    			}
    			
    		}
    		
    		
    		if(equipped.contains("Badge of Courage")){
				courage=true;
				damageBlock+=2;
			}
    		
    		if(equipped.contains("Badge of Quickness")){
				quickness=true;
			}
    		
    		if(equipped.contains("Badge of Accuracy")){
				accuracy=true;
			}
    		/////End Gear Modifier Phase/////
    		
    		//////Needs to be here for timing/////
    		if(userInput.equals("examine")){
				Event.setEvent(board[playerX][playerY]);
				if(board[playerX][playerY]!=null){
				System.out.println("Examined "+board[playerX][playerY]+",\n  "+Event.printEvent());
				}else{
				System.out.println("Examined nothing\n  "+Event.printEvent());
				}
				stopCombat=true;
			}
    		
    	    /////Start of Combat System/////
    		if(quickness==false){
    		if(stopCombat==false){
    		if(combat==true){
    			dealtDamage=Combat.Attack()-damageBlock;
    			System.out.print(Combat.enemyName()+" attacks and ");
    			if(dealtDamage>0){
    				System.out.println("deals "+dealtDamage);
    				health-=dealtDamage;
    				System.out.println("Your health is now "+health);
    			}else{
    				System.out.println("misses");
    			}
    			
    		}
    		}
    		stopCombat=false;
    		
    		/////Starts Combat/////
    		if(board[playerX][playerY]!=null&&combat!=true){
    		if(TypeCheck.isEnemy(board[playerX][playerY])==true){
    			combat=true;
    			Combat.setEnemy(board[playerX][playerY]);
    		}
    		}
    		}
    		/////End of Combat System/////
    		
    		
    		
    		/////Dev Tools/////
    		if(cheats==true){
    		if(userInput.equals("giveself")){
    			userInput=console.next();
    			inventory.add(userInput);
    			System.out.println("Added "+userInput);
    		}
    		
    		if(userInput.equals("hax0rz")){
    			String spacer="";
    			for(int i=0;i<=15;i++){
    				System.out.println();
    				for(int j=0;j<=15;j++){
    					if(board[j][i]!=null){
    						spacer="";
    						if(j<10){
    							spacer=spacer+" ";
    						}
    						if(i<10){
    							spacer=spacer+" ";
    						}
    					System.out.print(board[j][i].substring(0,3)+"("+j+","+i+spacer+")");
    					}else{
    						spacer="";
    						if(j<10){
    							spacer=spacer+" ";
    						}
    						if(i<10){
    							spacer=spacer+" ";
    						}
    						System.out.print("   "+"("+j+","+i+spacer+")");
    					}
    				}
    			}
		System.out.println();
		for(int i=0;i<=15;i++){
			System.out.println();
			for(int j=0;j<=15;j++){
				if(board[j][i]!=null){
				System.out.print(board[j][i].substring(0,3));
				}else{
					System.out.print("   ");
					}
				}
			}
		System.out.println();
		for(int i=0;i<=15;i++){
			System.out.println();
			for(int j=0;j<=15;j++){
				if(board[j][i]!=null){
				System.out.print(board[j][i]+"("+j+","+i+spacer+")");
				}else{
					
					}
				}
			}
        		
        	}//End of hax0rz
    		
    		if(userInput.equals("teley")){//4,13    9,9
    			playerX=9;
    			playerY=9;
    			System.out.println("You're now at "+board[playerX][playerY]+" i.e ("+playerX+","+playerY+")");
    		}
    		
    		if(userInput.equals("badges")){
    			if(badges.size()>0){
    			for(int i=0;i<badges.size();i++){
    				System.out.println(i+1+". "+badges.get(i));
    			}
    			}else{
    				System.out.println("You have no badges");
    			}
    		}
    		
    		if(userInput.equals("death")){
    			board[playerX][playerY]=null;
    			combat=false;
    		}
    		
    		if(userInput.equals("buffy")){
    			System.out.println("Courage: "+courage);
    			System.out.println("Quickness: "+quickness);
    			System.out.println("Accuracy: "+accuracy);
    		}
    			
    		if(userInput.equals("buffets")){
    			courage=true;
    			quickness=true;
    			accuracy=true;
    		}
    		
    		if(userInput.equals("hurt")){
    			health-=2;
    		}
    		}
    		/////End of Dev tools/////
    		
			/////Start of Command List/////
    			
    			if(userInput.equals("armor")){
    				System.out.println("You have "+damageBlock+" armor");
    			}
    			
    			if(userInput.equals("inventory")){
    				if(inventory.size()>0){
    				for(int i=0;i<inventory.size();i++){
    					System.out.println(1+i+". "+inventory.get(i));
    				}
    				}else{
    					System.out.println("You have nothing in your inventory");
    				}
    			}
    			
    			if(userInput.equals("health")){
    				System.out.println("Your health is "+health);
    			}
    			
    			if(userInput.equals("help")){
    				System.out.println("Press enter to enter your actions\n"
    						+ "To move around use w,a,s,d\n"
    						+ "The commands are...\n"
    						+ "-----------------------------------\n"
    						+ "help     : Brings up command list\n"
    						+ "examine  : you look at what's aroud\n"
    						+ "inventory: you look at your inventory\n"
    						+ "use      : use a item from you inventory by typing it's number, cancel by typing cancel\n"
    						+ "wait     : you wait a little bit and heal to half health\n"
    						+ "health   : shows how much health you have\n"
    						+ "attack   : attacks the enemy\n"
    						+ "equip    : equips a item from your inventory, type the items number to equip it. Cancel by typing cancel\n"
    						+ "equipped : shows what item you have equipped\n"
    						+ "dequip   : dequips a equipped item by typing its number, cancel by typing cancel\n"
    						+ "take     : lets you take items (also works on some locations)\n"
    						+ "Remember you have 6 health AND commands are caps sensitive\n"
    						+ "Have fun :)");
    			}
    			
    			
    			
    			if(userInput.equals("use")){
    				badValue=true;
    				if(inventory.size()>0){
    				for(int i=0;i<inventory.size();i++){
    					System.out.println(1+i+". "+inventory.get(i));
    				}
    				userInput=console.next();
    				}else{
    					System.out.println("You have nothing to use");
    					badValue=false;
    				}
    				while(badValue==true){
    				
    				try{
    					if(userInput.equals("cancel")){System.out.println("Nothing was used");badValue=false;}
    					if(TypeCheck.isUseItem((inventory.get(Integer.parseInt(userInput)-1)))==true){
    				Event.setplayerAction(inventory.get(Integer.parseInt(userInput)-1));
    				Event.setEvent(board[playerX][playerY]);
    				System.out.println(Event.printEvent());
    				if(Event.printEvent().equals("Swish Glug Mmm")){
    					if(health<6){
    					health+=3;
    					if(health>6){health=6;}
    					}
    					System.out.println("Your health is now "+health);
    				}
    				
    				if(Event.printEvent().equals("Swish Glug Glug YUM")){
    					health+=3;
    					System.out.println("Your health is now "+health);
    				}
    				
    				if(Event.printEvent().equals("It would be a waste to pour this on the ground")){
    					inventory.add("Bowl of Blood");
    				}
    				
    				if(Event.printEvent().equals("You fill the bottle to the brim")){
    					inventory.add("Filled Rum Bottle");
    				}
    				
    				if(Event.printEvent().equals("You fill it with nothing")){
    					inventory.add("Empty Rum Bottle");
    				}
    				
    				if(Event.printEvent().equals("You feel like now is not the time use this")){
    					inventory.add("Filled Rum Bottle");
    				}
    				
    				if(Event.printEvent().equals("You wash off the alter, inscribed on the alter it says add blood")){
    					board[playerX][playerY]="Altar";
    				}
    				
    				if(Event.printEvent().equals("You fill the bowl with your own blood")){
    					inventory.add("Bowl of Blood");
    					health-=3;
    					System.out.println("Your health is now "+health);
    				}
    				
    				if(Event.equals("You pour out the blood and discard the bowl, the blood bubbles and something floats to the surface")){
    					board[playerX][playerY]="Altar of Reward";
    					Event.setEvent(board[playerX][playerY]);
    				}
    				
    				
    				
    				inventory.remove(Integer.parseInt(userInput)-1);
    				badValue=false;
    					}else{
    						System.out.println("You can't use that");
    						userInput=console.next();
    					}
    					
    				} catch (NumberFormatException nfe) {
    					if(badValue==true){
    					userInput=console.next();  
    					}
    		  		    }catch(IndexOutOfBoundsException e){
    		  		    	if(badValue==true){
    		  		    	userInput=console.next();
    		  		    	}
    		  		    } 
    				
    				}//End of while loop
    				Event.setplayerAction(null);
    			}///End of use command///
    			
    			if(userInput.equals("wait")){
    				System.out.println("You wait awhile");
    				if(health<3){health=3;System.out.println("You were restored to 3 health");}
    			}
    			
    			if(userInput.equals("take")){
    				if(TypeCheck.isItem(board[playerX][playerY])==true){
    					System.out.println("You took "+board[playerX][playerY]);
    					inventory.add(board[playerX][playerY]);
    					board[playerX][playerY]=null;
    				}else if(TypeCheck.isPlace(board[playerX][playerY])==true){
    					
    					if(board[playerX][playerY].equals("Old House")){
    					inventory.add("Worn Hat");System.out.println("You took a worn hat");
    					inventory.add("Empty Rum Bottle");System.out.println("You took a empty rum bottle");
    					board[playerX][playerY]=looted+board[playerX][playerY];}
    					
    					if(board[playerX][playerY].equals("Tree")){
    						inventory.add("Rusty Dagger");System.out.println("You remove the dagger from the tree");
    						board[playerX][playerY]="Daggerless "+board[playerX][playerY];
    					}
    					
    					if(board[playerX][playerY].equals("Satanic Ritual Site")&&courage==true){
    						inventory.add("Gauntlets of Kilmandaros");System.out.println("You take the gauntlets");
    						board[playerX][playerY]=looted+board[playerX][playerY];
    					}
    					
    					if(board[playerX][playerY].equals("Satanic Ritual Site")&&courage==false){
    						System.out.println("You're too scared to go any further");
    					}
    					
    					if(board[playerX][playerY].equals("Abandoned Cart")){
    						inventory.add("Warrior Sword");inventory.add("Super Potion");inventory.add("Super Potion");
    						System.out.println("You take the warrior sword and two super potions");
    						board[playerX][playerY]=looted+board[playerX][playerY];
    					}
    					
    					if(board[playerX][playerY].equals("Abandoned Camp Site")){
    						inventory.add("Super Potion");
    						inventory.add("Potion");
    						inventory.add("Bowl");
    						board[playerX][playerY]=looted+board[playerX][playerY];
    					}
    					
    					if(board[playerX][playerY].equals("Shop")){
    						inventory.add("Sturdy Wooden Shield");
    						inventory.add("Potion");
    						board[playerX][playerY]=looted+board[playerX][playerY];
    					}
    					
    					if(board[playerX][playerY].equals("Rewarding Alter")){
    						inventory.add("Badge of Courage");
    						board[playerX][playerY]=looted+board[playerX][playerY];
    					}
    					
    					
    				}else{
    				System.out.println("You find nothing of interest");
    				}
    			}
    			
    			if(userInput.equals("equipped")){
    				if(equipped.size()>0){
    				for(int i=0;i<equipped.size();i++){
    					System.out.println(1+i+". "+equipped.get(i));
    				}
    				}else{
    					System.out.println("You have nothing equipped");
    				}
    			}
    			
    			if(userInput.equals("attack")){
    				if(combat==true){
    					random=(int) (Math.random()*2);
    					//System.out.println(random);
    					if(random==1||accuracy==true){
    					System.out.println("You dealt "+Combat.enemyName()+" "+attackDamage+" damage");
    					Combat.takeDamage(attackDamage);
    					if(Combat.GetHp()<=0){
    						System.out.println("You killed "+Combat.enemyName());
    						board[playerX][playerY]=null;
    						combat=false;
    						
    					}
    				}else{
    					System.out.println("You miss");}
    				
    				
    				}else{
    					System.out.println("There's nothing to attack");}
    			
    				}
    				
    			
    			
    			if(userInput.equals("equip")){
    				badValue=true;
    				if(inventory.size()>0){
    				for(int i=0;i<inventory.size();i++){
    					System.out.println(1+i+". "+inventory.get(i));
    				}
    				}else{System.out.println("You have nothing to equip");badValue=false;}
    				userInput=console.next();
    				while(badValue==true){
    				try{
    					if(userInput.equals("cancel")){System.out.println("Nothing was equipped");badValue=false;}
    					if(TypeCheck.isEquipItem((inventory.get(Integer.parseInt(userInput)-1)))==true){
    					for(int j=0;j<equipped.size();j++){
    					if(TypeCheck.isWeapon(equipped.get(j))==true){
    					System.out.println("You can't equip "+inventory.get(Integer.parseInt(userInput)-1)+" you have "+equipped.get(j)+" equipped\n try something else?");
    					badValue=true;
    					break;
    					}else{
    					badValue=false;}
    					}//End of for loop
    					if(equipped.size()<=0){badValue=false;}
    					if(badValue==false){
    					if((inventory.get(Integer.parseInt(userInput)-1).substring(0,5).equals("Badge"))){
    						badges.add((inventory.get(Integer.parseInt(userInput)-1)));
    					}else{
    					equipped.add((inventory.get(Integer.parseInt(userInput)-1)));
    					}
    			    	System.out.println("You equipped "+inventory.get(Integer.parseInt(userInput)-1));
    			    	inventory.remove(Integer.parseInt(userInput)-1);
    			    	}
    						
    						}

    				}catch (NumberFormatException nfe) {
    					if(badValue==true){userInput=console.next();}
		  		    }
					catch(IndexOutOfBoundsException e){
		  		    	if(badValue==true){userInput=console.next();}
		  		    }
    						
    				if(badValue==true){userInput=console.next();}
    				}//End of while
    				
    				
    				}///End of command
    			
    			    
    			
    				if(userInput.equals("dequip")){
    				badValue=true;
    				if(equipped.size()>0){
    				for(int i=0;i<equipped.size();i++){
    					System.out.println(1+i+". "+equipped.get(i));
    				}
    				userInput=console.next();
    				while(badValue==true){
    					try{
        					if(userInput.equals("cancel")){System.out.println("Nothing was dequipped");badValue=false;}
        					System.out.println("You dequipped "+equipped.get(Integer.parseInt(userInput)-1));
        					//if(TypeCheck.isWeapon(equipped.get(Integer.parseInt(userInput)-1))){}
        					inventory.add((equipped.get(Integer.parseInt(userInput)-1)));
        					equipped.remove(Integer.parseInt(userInput)-1);
        					badValue=false;
        				} catch (NumberFormatException nfe) {
        					if(badValue==true){
        					userInput=console.next();  
        					}
        		  		    }catch(IndexOutOfBoundsException e){
        		  		    	if(badValue==true){
        		  		    	userInput=console.next();
        		  		    	}
        		  		    }
    				}
    				
    				}else{
    					System.out.println("You have nothing to dequip");
    				}
    			}
    		/////End of Command List/////
    		
    		
    		/////Start of Combat System/////
    		if(quickness==true){	
    		if(stopCombat==false){
    		if(combat==true){
    			dealtDamage=Combat.Attack()-damageBlock;
    			System.out.print(Combat.enemyName()+" attacks and ");
    			if(dealtDamage>0){
    				System.out.println("deals "+dealtDamage);
    				health-=dealtDamage;
    				System.out.println("Your health is now "+health);
    			}else{
    				System.out.println("misses");
    			}
    			
    		}
    		}
    		stopCombat=false;
    		
    		/////Start Combat System/////
    		if(board[playerX][playerY]!=null&&combat!=true){
    		if(TypeCheck.isEnemy(board[playerX][playerY])==true){
    			combat=true;
    			Combat.setEnemy(board[playerX][playerY]);
    		}
    		}
    		}
    		/////End of Start Combat System/////
    		
    		/////End of Combat System/////
    		
    		
    		/////End of game System/////
    		if(health<=0){
    			System.out.println("Game Over");
    			gameEnd=true;
    		}else{
    			if(console.hasNext()){
    		userInput=console.next();
    			}
    		}
    		
       	    }//End of Game Loop
    	    if(userInput.equals("quit")){
    		System.out.println("Game Over");
    	    }
    	    /////End of End Game system/////
    	    
    }//End of Main
       
}//End of Program