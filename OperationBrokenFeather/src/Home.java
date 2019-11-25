import java.util.Random;

public class Home 
{

	public static boolean gameOver = false;
	public static Random random = new Random();
	
	public static void main(String[] args) 
	{	
		//Set up stuff
		Travel travel = new Travel();
		Battle battle = new Battle();
		Story story = new Story();
		enemy _enemy = new enemy();
		Player player1 = new Player();
		player1.createPlayer();
		
		
		//Game begins
		story.beginingOfStory(player1);
		
		
		while(gameOver == false)
		{
			int randomEncounter = random.nextInt((2 - 1) + 1) +1;
			
			travel.travel();
			story.FightDragon(player1, travel);
			
			if(randomEncounter == 1)
			{
				_enemy.generateEnemy();
				battle.fight(player1, _enemy);
			}
			
		}
		
	}

}
