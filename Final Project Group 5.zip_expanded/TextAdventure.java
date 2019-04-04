/* Text Adventure Class
	 * @author KristenUsui, AlexanderArrington, JoseManotas, RashiTripathi
	 *05/08/18
	 * This class is where our game connects all of the classes together and launches the finished game*/
import java.util.Scanner;
public class TextAdventure 
{
	public static void main (String[] args) 
	{
		Scanner in= new Scanner (System.in);
		int choice= 0;
		System.out.println("Welcome to 'R U Graduating?'");
		System.out.println("");
		System.out.println("In this game you'll visit various famous Rutgers locations");
		System.out.println("There are several items in these locations that may or may not help you graduate");
		System.out.println("At the end of the game if your score is 6 or greater, you'll be able to graduate");
		System.out.println("Otherwise, you won't graduate and  you lose.");
		System.out.println("");
		Player player = new Player(); 
		System.out.println("Are you ready to play? Press 1 to continue");
		System.out.println("");
		choice= in.nextInt();
		if (choice == 1) 
		{
		player.startFromBeginning();
		}
		else 
		{
			System.out.println("That is not a valid option, try again");
		}
		boolean win = player.getRooms().getWon();
		while (win != true)  
		{
			player = new Player();
			player.startFromBeginning();
			win = player.getRooms().getWon();
			
			
			
		}

		if (win= true ) 
		{
			System.out.println("Do you want to play again");
			System.out.println("Type 1 for yes, 2 for no");
			choice=in.nextInt();
			if (choice==1) 
			{
				player.startFromBeginning();
			}
			
			else 
			{
				System.out.println("Game over");
			}
		}
		
	}

	

}
