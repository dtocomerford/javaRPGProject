
public class Home {

	public static void main(String[] args) 
	{	
		Battle battle = new Battle();
		enemy _enemy = new enemy();
		_enemy.generateEnemy();
		
		Player _player = new Player();
		_player.createPlayer();
		
		
		
		battle.fight(_player, _enemy);
		
		System.out.print("End!!!!!!!!!!!!");
	}

}
