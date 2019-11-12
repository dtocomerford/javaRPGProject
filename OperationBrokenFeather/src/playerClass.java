
public class playerClass 
{

	public static String className;
	public static int attack;
	public static int defence;
	public static int accuracy;
	public static int mana;
	public static int combatPower;
	public static int health;
	
	public static void main(String[] args) 
	{
		
	}
	
	public static void buildClasses(Player player)
	{
		playerClass Mage = new playerClass();
		playerClass Warrior = new playerClass();
		playerClass Archer = new playerClass();
		playerClass Peasant = new playerClass();		
	}
	
	public static void printClassStats(playerClass playerclass)
	{
		System.out.println("Class "+playerclass.className);
		System.out.println("Attack " + playerclass.attack);
		System.out.println("Defence " + playerclass.defence);
		System.out.println("Accuracy " + playerclass.accuracy);
		System.out.println("Mana " + playerclass.mana);
		System.out.println("Health "+ playerclass.health);
		System.out.println("Combat Power " + playerclass.combatPower);
		System.out.println();
	}
	
	public static void giveMageStats(playerClass mage, Player player)
	{
		//Give the mage class set stats 
		mage.className = "Mage";
		mage.attack = 40;
		mage.defence = 35;
		mage.accuracy = 35;
		mage.health = 40;
		mage.mana = 80;
		mage.combatPower = 65;
		
		//Set our players stats to that of a mage
		player.attack = mage.attack;
		player.defence = mage.defence;
		player.accuracy = mage.accuracy;
		player.health += mage.health;
		player.mana = mage.mana;
		player.combatPower = mage.combatPower;
		
		player.characterType = "Mage";
		
		
	}
	
	public static void giveWarriorStats(playerClass warrior, Player player) 
	{ 
		warrior.className = "Warrior"; 
		warrior.attack = 55; 
		warrior.defence = 45;
		warrior.accuracy = 40; 
		warrior.health = 50; 
		warrior.mana = 30; 
		warrior.combatPower = 75; 
		
		//Set our players stats to that of a mage
		player.attack = warrior.attack;
		player.defence = warrior.defence;
		player.accuracy = warrior.accuracy;
		player.health += warrior.health;
		player.mana = warrior.mana;
		player.combatPower = warrior.combatPower;
				
		player.characterType = "Warrior";
	} 
	 
	public static void giveArcherStats(playerClass archer, Player player) 
	{ 
		archer.className = "Archer"; 
		archer.attack = 40; 
		archer.defence = 15;
		archer.accuracy = 80; 
		archer.health = 40; 
		archer.mana = 30; 
		archer.combatPower = 70; 
		
		//Set our players stats to that of a mage
		player.attack = archer.attack;
		player.defence = archer.defence;
		player.accuracy = archer.accuracy;
		player.health += archer.health;
		player.mana = archer.mana;
		player.combatPower = archer.combatPower;
						
		player.characterType = "Archer";
	} 
	 
	public static void givePeasantStats(playerClass peasant, Player player) 
	{ 
		peasant.className = "Peasant"; 
		peasant.attack = 15; 
		peasant.defence = 10;
		peasant.accuracy = 20; 
		peasant.health = 20; 
		peasant.mana = 1; 
		peasant.combatPower = 10; 
		
		//Set our players stats to that of a mage
		player.attack = peasant.attack;
		player.defence = peasant.defence;
		player.accuracy = peasant.accuracy;
		player.health += peasant.health;
		player.mana = peasant.mana;
		player.combatPower = peasant.combatPower;
								
		player.characterType = "Peasant";
	} 
}
