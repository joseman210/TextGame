/* Room Class
	 * 
	 *05/08/18
	 * This class was where objects of type Room are created and manipulated, features each room in the game with descriptions and actions*/
import java.util.Scanner;

public class Rooms 
{
	private String name;
	private String description;
	private int choice;
	Player one;
	Rooms room;
	boolean won;
	public Rooms (Player player) 
	{
		one = player;
		won = false;
	}
	
	public String getRoom () 
	{
		return name;
	}
	public void Expos () //the various rooms #1
	{
		
		String name="Expos Classroom";
		System.out.println(name);
		System.out.println("");
		System.out.println("Late night on the top floor of Beck Hall in that room that smells like manure");
		System.out.println("The room is filled with desks and students working on computers, your professor gives you a confused look, that paper was actually due last week");
		System.out.println("");
		System.out.println("Do you want to turn in your paper? Type '1' for yes,'2' for no ");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			 Item paper= new Item ("Final Expos Paper","You quickly flash back to the red-bull filled, all-nighter you pulled to write this", 2.0); 
			 description= "You quickly flash back to the red-bull filled, all-nighter you pulled to write this";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(paper);
//			 one.checkIfWon();
		}
		System.out.println("Your friend texts you about a dage on Guilden.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Dage();
		}
		else 
		{
		
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
			
		}
		
	}
	
	public void Dage () //2
	{
		name="Dage on Guilden Street";
		System.out.println(name);
		System.out.println("");
		System.out.println("It's actually nice out for once, classrooms are empty becuase all the students are at Guilden Street for the Dage");
		System.out.println("You're on the LX on your way to the dage with your roomate when they throw up on your shoes, you think to yourself 'is this even worth it?'");
		System.out.println("");
		System.out.println("You show up to the dage a little too late and all the beer is gone, your friend stumbles over to you and says 'I got you some juice'");
		
		System.out.println("Do you want to take the jungle juice? Type '1' for yes,'2' for no ");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			 Item juice= new Item ("Jungle Juice","You try not to pass out from the obvious smell of Everclear", -2.5);
			 System.out.println(" ");
			 description="You try not to pass out from the obvious smell of Everclear";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(juice);
		}
		
		System.out.println("You decide you're too done and you want to leave.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			fatTruck();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void fatTruck () //3
	{
		name="Fat Sandwich Truck";
		System.out.println(name);
		System.out.println("");
		System.out.println("You've made your way back to College Ave somehow and your hit with the late night hunger, you see a familiar sight on the corner of Hamilton");
		System.out.println("After waiting on the 20 minute line, it's finally your turn to order and you're slurring what you want to the person helping you");
		System.out.println("");
		System.out.println("The person just understood fat sandwich and is handing you a Fat Cat that someone else forgot to take");
		System.out.println("Do you want to take the Fat Sandwich? Type '1' for yes,'2' for no ");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			  Item sandwich= new Item ("Fat Cat","It's hot, your vision is blurry, you might throw up, maybe this will make you feel better", 1.5);
			  System.out.println(" ");
				 description="It's hot, your vision is blurry, you might throw up, maybe this will make you feel better";
				 System.out.println(description);
				 System.out.println("");
				 one.Pickup(sandwich);
		}
		
		System.out.println("You decide you're too done and you want to leave.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Bar();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void Bar () //4
	{
		name="Huey's Knight Club";
		System.out.println(name);
		System.out.println("");
		System.out.println("You go to Knight Club thinking it's two dollar tuesday but realize it’s thursday");
		System.out.println("All of your friends want you to stay and hang out but you are trying to decide if you want to spend the extra money or not");
		System.out.println("");
		System.out.println("Do you want to stay and make the best of the night? Type '1' for yes, '2' for no ");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1)
		{
		
			Item bill= new Item ("$160 bill", "Uh oh... looks like your checking account is in the negative. Probably a good idea to pick up an extra shift at work", -1.75);
			 System.out.println();
			 description="Uh oh... looks like your checking account is in the negative. Probably a good idea to pick up an extra shift at work";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(bill);
		}
		
		System.out.println("It's time to walk back home.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Dorm();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}

	public void Dorm () //5
	{
		name="Dorm Room";
		System.out.println(name);
		System.out.println("");
		System.out.println("Your roommate is asking if it's cool with you that he has a 'small' pre-game for the football game in your room");
		System.out.println("You did hear that the RA was going to be away this weekend and a pre-game would be fun");
		System.out.println("");
		System.out.println("Are you going to let your roommate throw the pre-game at your dorm? Type 1 for yes, 2 for no");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
		    Item write= new Item ("Write up","The RA on-duty busts your party and writes you up", -2.0);
		     System.out.println();
			 description="The RA on-duty busts your party and writes you up";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(write);
		}
		
		System.out.println("You decide you want to fast-forward to the next day.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Stadium();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void Stadium () //6
	{
		name="Football Game";
		System.out.println(name);
		System.out.println("");
		System.out.println("You get to the stadium and everyone is decked out in RU gear. You have a red t-shirt on, but you feel like you're lacking in the school spirit department");
		System.out.println("A vendor is walking around selling huge Rutgers foam fingers. When he comes over by you, you ask him how much they are. He tells you each foam finger costs a whopping $40");
		System.out.println("");
		System.out.println("Do you want to splurge and buy the foam finger? Type '1' for yes, '2' for no");		
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Item finger= new Item ("Foam Finger","You wake up from a nap with a mean hangover to the smell of Natty Light and you spot the foam finger on your floor, successful game day!", 2.5);
			System.out.println();
			 description="You wake up from a nap with a mean hangover to the smell of Natty Light and you spot the foam finger on your floor, successful game day!";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(finger);
		}
		
		System.out.println("What a suprise..... we're losing.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			BandN();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void BandN () //7
	{
		name="Barnes and Nobles";
		System.out.println(name);
		System.out.println("");
		System.out.println("You go to Barnes and Nobles to buy a new book and get some homework done. You see that a lot of people are purchasing their cap and gowns and you haven't gotten yours yet");
		System.out.println("Since you're here anyway, you figure you might as well grab your gown. You are in awe when you find out the cap and gown costs $100!");
		System.out.println("You could use your credit card to buy it, but then it will be completely maxed out. Your mom will probably buy it for you if you ask, but there are a ton of people purchasing them and it looks like they are running low on the length you need");
		System.out.println("");
		System.out.println("You could come back another day but graduation is quickly approaching. "); 
		System.out.println("Do you want to buy your cap & gown? Type '1' for yes, '2' for no");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Item gown= new Item ("Cap and Gown","Good thing you bought it now! You got the last gown they had in stock for the length you needed", 3.0);
			System.out.println();
			 description="Good thing you bought it now! You got the last gown they had in stock for the length you needed";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(gown);
			 
		}
		
		System.out.println("It's getting pretty late and the buses will stop running soon.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			AcademSer();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void AcademSer () //8
	{
		name="Academic Services";
		System.out.println("You go to Academic Services to speak to an Advisor about your classes and graduation track");
		System.out.println("The walk-in wait is going to be at least thirty minutes to an hour and you forgot to make an appointment."); 
		System.out.println("You realize you parked in a lot that requires a hangtag that you don't have and the Parking Authority usually swarms that lot");
		System.out.println("");
		System.out.println("You could come back another day but graduation is quickly approaching. Do you want to stay and wait to see the Academic Advisor? "); 
		System.out.println("Type 1 for yes, 2 for no");
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Item ticket= new Item ("Parking Ticket","You confirmed that you are all set to graduate, but you come out to your car to see a $50 parking ticket on your windshield", -1.75);
			System.out.println();
			 description="You confirmed that you are all set to graduate, but you come out to your car to see a $50 parking ticket on your windshield";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(ticket);
		}
		
		System.out.println("You disappointedly go back to the yellow lot on Livingston to park your car.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Library();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void Library () //9
	{
		name="Library";
		System.out.println(name);
		System.out.println("");
		System.out.println("You go to the library to study for a final in a class you've barely been to all semester");
		System.out.println("The guy you are sitting next to in the computer lab looks like he happens to be studying for the same class, but you see he has a different professor");
		System.out.println("At this point, you could either ask the kid for his study guide and hope the professors give similar tests or just tough it out on your own");
		System.out.println("");
		System.out.println("Do you want to ask him for a copy of his study guide? Type '1' for yes, '2' for no"); 
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
			  Item guide= new Item ("Study Guide","The kid gives you his study guide and it ends up helping you pass the final", 2.75 );
			System.out.println();
			 description="The kid gives you his study guide and it ends up helping you pass the final";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(guide);
		}
		
		System.out.println("You haven't slept during exam week, time for a power nap.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			Classroom();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
	}
	
	public void Classroom () //10
	{
		name="OOP Classroom";
		System.out.println(name);
		System.out.println("");
		System.out.println("You pulled an all nighter studying for your other final and didn't get to complete your final project for your Object Oriented Programming Class");
		System.out.println("You can either try and come up with some bs excuse or just submit what you have done and hope for the best");
		System.out.println(" ");
		System.out.println("Do you want to submit your incomplete final project? Type '1' for yes, '2' for no"); 
		Scanner sc= new Scanner (System.in);
		choice = sc.nextInt();
		if (choice == 1) 
		{
		 	Item project= new Item ("OOP Project","You submit what you have done and your professor ends up giving you extra credit for creativity, so you get a B. Nice!", 5.0);
			System.out.println();
			 description="You submit what you have done and your professor ends up giving you extra credit for creativity, so you get a B. Nice!";
			 System.out.println(description);
			 System.out.println("");
			 one.Pickup(project);
		}
		
		System.out.println("It's finally time to see if you can graduate.. Are you ready to move on");
		System.out.println("Type 1 to continue");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			End();
		}
		else 
		{
			
			System.out.println("That is not a valid option, try again");
			choice = sc.nextInt();
		}
		
		
	}
	
	public boolean End() //runs check method and prints whether you won or lost
	{
		if(one.checkIfWon()) {
			System.out.println("You're graduating!");
			won = true;
			
		}else {
			System.out.println("You didn't graduate. Better luck next time");
			won = false;
		}
		return won;
	}
	
	public boolean getWon() {
		return won;
	}

}
