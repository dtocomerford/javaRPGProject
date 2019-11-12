
public class Home 
{

	public static boolean gameOver = false;
	
	public static void main(String[] args) 
	{	
		Travel travel = new Travel();
		Battle battle = new Battle();
		Story story = new Story();
		enemy _enemy = new enemy();
		
		
		Player player1 = new Player();
		player1.createPlayer();
		
		story.beginingOfStory(player1);
		
		
		while(gameOver == false)
		{
			travel.travel();
			_enemy.generateEnemy();
			battle.fight(player1, _enemy);
		}
		
	}

}
