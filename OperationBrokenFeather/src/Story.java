
public class Story {

	public static void beginingOfStory(Player player1)
	{
		System.out.println("Welcome to your home town of Millhall " + player1.name +", your father left you when you were small and you've been a disapointment ever since");
	}
	
	public static void FightDragon(Player player, Travel travel)
	{
		System.out.println("Called");
		for(int i = 0; i < player.inventory.size(); i++)
		{
			if(player.inventory.get(i).contentEquals("Key") && travel.location == 4)
			{
				System.out.println("The castle stands before you, the doors swing open to greet you");
				
			}
			else if(!"Key".equals(player.inventory.get(i)) && travel.location == 4) 
			{
				System.out.println("The castle stands before you, the door is locked");
			}
		}
	}

}
