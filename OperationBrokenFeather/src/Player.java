import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player 
{
	public static String name;
	public static String characterType;
	public static int health = 100;
	public static int maxHP;
	public static int defence;
	public static int attack;
	public static int accuracy;
	public static int xp;
	public static int mana;
	public static int maxMana;
	public static int level;
	public static int combatPower;
	public static int speed;
	public static boolean fighting;
	
	public static String userInput;
	
	static ArrayList<String> classes = new ArrayList<String>();
	static ArrayList<String> inventory = new ArrayList<String>();
	
	public static Scanner input = new Scanner(System.in);
	
	
	//Creating object of each class type
	public static playerClass mage = new playerClass();
	public static playerClass warrior = new playerClass();
	public static playerClass archer = new playerClass();
	public static playerClass peasant = new playerClass();
	
	public static Player player1 = new Player();
	

	
	
	public static void createPlayer()
	{	
		
		inventory.add("Potion");
		
		
		System.out.println("Enter name of your character: ");
		name = input.next().toUpperCase();
		System.out.println();
		
		classes.add("Mage  (M)");
		classes.add("Warrior  (W)");
		classes.add("Archer  (A)");
		classes.add("Peasant  (P)");
		
		
		for(int i =0; i < classes.size(); i++)
		{
			System.out.println(classes.get(i));
		}
		
		System.out.println("Enter first letter to select class: ");
		userInput = input.next().toUpperCase();
		
		//need to print classes from the cplayerClass class
		switch(userInput)
		{
		case "M":
			System.out.println("You have selected Mage Stats are:");
			mage.giveMageStats(mage, player1);
			mage.printClassStats(mage);
			break;
		case "W":
			System.out.println("You have selected Warrior");
			warrior.giveWarriorStats(warrior, player1);
			warrior.printClassStats(warrior);
			break;
		case "A":
			System.out.println("You have selected Archer");
			archer.giveArcherStats(archer, player1);
			archer.printClassStats(archer);
			break;
		case "P":
			System.out.println("You have selected Peasant");
			peasant.givePeasantStats(peasant, player1);
			peasant.printClassStats(peasant);
			break;
		}
		
	}

}
