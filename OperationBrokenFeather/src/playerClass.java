
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
	}
	
	public static void giveMageStats(playerClass mage)
	{
		mage.className = "Mage";
		mage.attack = 40;
		mage.defence = 25;
		mage.accuracy = 35;
		mage.health = 40;
		mage.mana = 80;
		mage.combatPower = 65;
	}
	
	public static void giveWarriorStats(playerClass warrior) 
	{ 
		warrior.className = "Warrior"; 
		warrior.attack = 80; 
		warrior.defence = 45;
		warrior.accuracy = 40; 
		warrior.health = 50; 
		warrior.mana = 30; 
		warrior.combatPower = 75; 
	} 
	 
	public static void giveArcherStats(playerClass archer) 
	{ 
		archer.className = "Archer"; 
		archer.attack = 40; 
		archer.defence = 15;
		archer.accuracy = 80; 
		archer.health = 40; 
		archer.mana = 30; 
		archer.combatPower = 70; 
	} 
	 
	public static void givePeasantStats(playerClass peasant) 
	{ 
		peasant.className = "Peasant"; 
		peasant.attack = 15; 
		peasant.defence = 10;
		peasant.accuracy = 20; 
		peasant.health = 20; 
		peasant.mana = 1; 
		peasant.combatPower = 10; 
	} 
	 

}
