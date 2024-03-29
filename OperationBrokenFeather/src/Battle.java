
import java.util.Scanner;
import java.util.Random;
public class Battle 
{
    
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    
    public static int userInput;
    public static boolean isGameOver = false;
    public static int damage;
    
    
    
    public static void fight(Player player1, enemy _enemy)
    {
        
    	while(isGameOver == false)
        {
            System.out.println("----- FIGHT MENU -----");
            System.out.println("1. \t Attack");
            System.out.println("2. \t Run Away");
            System.out.println("3. \t Insult");    
            
            userInput = input.nextInt();
            
            switch(userInput)
            {
            case 1:
                attack(player1, _enemy);
                isGameOver = checkIfGameOver(player1, _enemy);
                if(isGameOver == true)
                {
                	return;
                }
                break;
            case 2:
                runAway(player1, _enemy);
                break;
            case 3:
                System.out.println(insult(player1));
                break;
            }
            
            System.out.println();
            if(isGameOver != true)
            {
            	enemyAttack(_enemy, player1);
            }
            
            System.out.println("----- FIGHT MENU -----");
            System.out.println("1. \t Attack");
            System.out.println("2. \t Run Away");
            System.out.println("3. \t Insult");    
            
            userInput = input.nextInt();
            
            switch(userInput)
            {
            case 1:
                attack(player1, _enemy);
                isGameOver = checkIfGameOver(player1, _enemy);
                if(isGameOver == true)
                {
                	return;
                }
                break;
            case 2:
                runAway(player1, _enemy);
                break;
            case 3:
                System.out.println(insult(player1));
                break;
            }
            
            System.out.println();
            if(isGameOver != true)
            {
            	enemyAttack(_enemy, player1);
            }
            System.out.println();
        }   
    }
        
    
        
        
    
    public static String insult(Player player1)
    {
        String harmfulWords = player1.name + " yells -  You're a clown!";
        return harmfulWords;
    }
    
    
    public static void runAway(Player player1, enemy _enemy)
    {
        if(player1.speed > _enemy.speed)
        {
            System.out.println();
            System.out.println(player1.name + " flees the fight like a coward");
            System.out.println(_enemy.name + " turns and walks away");
            
            isGameOver = true;
        }
        else
        {
            System.out.println(player1.name + " can't escape!");
            
        }
        
    }
    
    
    public static void attack(Player player1, enemy _enemy)
    {
        System.out.println(player1.name + " attacks " + _enemy.name);
        
        int randomDamage = random.nextInt((4 - 3) + 1) + 3;
        damage = player1.attack - _enemy.defence;
        damage += randomDamage;
        System.out.println(randomDamage);
        if(damage < 0)
        {
            damage = 0;
        }
        _enemy.health -= damage;
        System.out.println(player1.name + " deals " + damage + " damage to " + _enemy.name);
        System.out.println(_enemy.name + "'s health is now at " + _enemy.health);
    }
    
    
    public static boolean checkIfGameOver(Player player1, enemy _enemy)
    {
        if(player1.health <= 0)
        {
            System.out.println();
            System.out.println(player1.name + " is dead!");
            System.out.println(_enemy.name + " wins!");
            
            isGameOver = true;
            return true;
        }
        else if(_enemy.health <= 0)
        {
            System.out.println();
            System.out.println(_enemy.name + " is dead!");
            System.out.println(player1.name + " wins!");
            
            isGameOver = true;
            return true;
        }
        else
        {
        	return false;
        }
        
    }
    
    public static void enemyAttack(enemy _enemy, Player player1)
    {
    	int damage;
    	damage = _enemy.attack - player1.defence;
    	if(damage <= 0)
    	{
    		damage = 0;
    	}
    	damage += random.nextInt((4 - 3) + 1) + 3;
    	System.out.println(damage);
    	player1.health -= damage;
    	System.out.println(_enemy.name + " attacks " + player1.name + " dealing " + damage + " damage");
    	System.out.println(player1.name + "'s health is now " + player1.health);
    }
    
}
 
 
 
 
 


