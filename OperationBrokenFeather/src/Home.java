
public class Home {

	public static void main(String[] args) 
	{	
		enemy _enemy = new enemy();
		_enemy.generateEnemy();
		
		Player _player = new Player();
		_player.createPlayer();
		
		Battle battle = new Battle();
		
		battle.fight(_player, _enemy);
	}

}
