
public class Home {

	public static void main(String[] args) 
	{	
		enemy _enemy = new enemy();
		_enemy.generateEnemy();
		
		
		
		Battle battle = new Battle();
		
		battle.fight(_enemy, _enemy);
	}

}
