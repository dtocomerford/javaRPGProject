import java.util.Random; 
 
public class enemy 
{ 
 
	public static String name; 
	public static int attack; 
	public static int speed;
	public static int accuracy; 
	public static int defence;
	public static int mana; 
	public static int combatPower; 
	public static int health; 
	public static int enemyChoice; 
	public static int playerLevel;
	
 
	public static void main(String[] args)  
	{ 
		generateEnemy(); 	
		
	} 
 
	public static void generateEnemy() 
	{ 
 
 
		if(true){ 
 
			enemy enemy1 = new enemy(); 
			Random random = new Random(); 
 
			enemyChoice = random.nextInt((2 - 1) + 1) +1; 
 
 
			switch(enemyChoice) 
			{ 
				case 1: 
					enemy1.name = "Hobgoblin"; 
					enemy1.defence = 20; 
					enemy1.attack = 50; 
					enemy1.mana = 1; 
					enemy1.combatPower = 40; 
					enemy1.health = 30; 
					enemy1.speed = 15;
					break; 
				case 2:  
					enemy1.name = "Frost Giant"; 
					enemy1.defence = 40; 
					enemy1.attack = 20; 
					enemy1.mana = 1; 
					enemy1.combatPower = 50; 
					enemy1.health = 40;
					enemy1.speed = 15;
					break; 
 
			} 
		}
		else if(playerLevel == 2)
		{ 
 
			enemy enemy1 = new enemy(); 
			Random random = new Random(); 
 
			enemyChoice = random.nextInt(2); 
 
			System.out.print(enemyChoice); 
 
			switch(enemyChoice) 
			{ 
				case 1: 
					enemy1.name = "Shadow Demon"; 
					enemy1.defence = 30; 
					enemy1.attack= 70; 
					enemy1.mana = 30; 
					enemy1.combatPower = 60; 
					enemy1.health = 40; 
					break; 
				case 2:  
					enemy1.name = "Ogre"; 
					enemy1.defence = 70; 
					enemy1.attack = 30; 
					enemy1.mana = 1; 
					enemy1.combatPower = 50; 
					enemy1.health = 20; 
					break; 
 
			} 
		} 
		else
		{ 
 
			enemy enemy1 = new enemy(); 
 
			enemy1.name = "Dragon"; 
			enemy1.defence = 60; 
			enemy1.attack = 40; 
			enemy1.mana = 1; 
			enemy1.combatPower = 80; 
			enemy1.health = 100; 
 
		} 
	}
}