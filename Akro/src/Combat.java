public class Combat {

	private String enemy;
	private int enemyTier;
	private int Health;

	public Combat(){

	}
    
	public String enemyName(){
		return this.enemy;
	}
	
	public void getEnemyDetails(){
	//System.out.println();
	System.out.println("The enemy is "+this.enemy);
	System.out.println("The enemy's tier is "+this.enemyTier);
	System.out.println("The enemy's health is "+this.Health);
	}
    
	public boolean enemyExists(){
		if(this.enemy==null){
			return false;
		}else{
			return true;
		}
		
	}
	
	public void setEnemy(String a){
		
		this.enemy=a;

    	if(this.enemy.equals("Stubby Goblin")){this.enemyTier=2;}

    	if(this.enemy.equals("Salty Toad")){this.enemyTier=2;}

    	if(this.enemy.equals("Pixy")){this.enemyTier=2;}

    	if(this.enemy.equals("Orc")){this.enemyTier=3;}

    	if(this.enemy.equals("Bob The Obese Orc King")){this.enemyTier=6;}

    	if(this.enemy.equals("Boar")){this.enemyTier=4;}

    	if(this.enemy.equals("Kobold")){this.enemyTier=5;}

    	if(this.enemy.equals("Slimy Slime")){this.enemyTier=5;}

    	if(this.enemy.equals("Spirit")){this.enemyTier=6;}

    	if(this.enemy.equals("Spooky Skeleton")){this.enemyTier=6;}

    	if(this.enemy.equals("Slime")){this.enemyTier=6;}

    	if(this.enemy.equals("Clattery Bones")){this.enemyTier=7;}

    	if(this.enemy.equals("Revenant")){this.enemyTier=7;}

    	if(this.enemy.equals("Dragon")){this.enemyTier=7;}
    	
    	this.Health = this.enemyTier;
    	
	}
	
	public void takeDamage(int z){
   	 this.Health-=z;
	}

	public int Attack(){
    for(int i=0;i<1;i++){
    int RNG=(int) (Math.random()*7);
    int Rolled=(int) (Math.random()*this.enemyTier);
    
    if(RNG<=Rolled){
    return this.enemyTier;
    }
    }
   	return 0;    
	}

    public int GetHp(){
    return this.Health;
    }
    	
    public void resetEnemy(){
    	
   	this.enemy=null;
   	this.enemyTier=(Integer) null;
   	this.Health=(Integer) null;
    	
    }
    
}
