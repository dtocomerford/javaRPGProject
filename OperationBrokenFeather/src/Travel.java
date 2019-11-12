import java.util.Scanner;

public class Travel 
{
	public static Scanner input = new Scanner(System.in);
	
	public static boolean pass = false;
	public static int userChoice;
	public static int location;

	
	public static void travel()
	{
		System.out.println("Would you like to travel \n"
				+ "1 North\n"
				+ "2 East\n"
				+ "3 South\n"
				+ "4 West");
		
		
		while(pass == false)
		{

			userChoice = input.nextInt();
			if(location == userChoice)
			{
				System.out.print("You are already in this location\n"
						+ "Select another destination");
			}
			else
			{
				pass = true;
			}
		}
		
		pass =false;
		
		switch(userChoice)
		{
		case 1:
			System.out.println("You have decided to head North");
			location = 1;
			break;
		case 2:
			System.out.println("You have decided to head East");
			location = 2;
			break;
		case 3:
			System.out.println("You have decided to head South");
			location = 3;
			break;
		case 4:
			System.out.println("You have decided to head West");
			location = 4;
			break;
		}
	}
}
