/* Player Class
	 * @author 
	 *05/08/18
	 * This class was where objects of type player are created and manipulated
	 * Also contains our method that checks if the player has enough points to win*/
public class Player 
{
	
	public static Item[] inventory = new Item[10];
	public static int invSpot=0; 
	
	private Inventory invent;
	private Rooms rooms;
	
	public Player() { //creates a new player & inventory
		invent = new Inventory();
		rooms = new Rooms(this);
	}
	
	public void Pickup(Item item) {
		invent.addItem(item);
		invent.checkScore();
	}

	
	public void Rooms (Player player, Rooms room) 
	{

	}
	
	public Rooms getRooms() { //gets current room player is in
		return rooms;
	}
	
	public void startFromBeginning() {
		rooms.Expos();
	}
	
	public boolean checkIfWon() { //returns your final score
		return invent.checkScore();
	}
	public String Look (Item item) //to interact w/ objects or characters
	{
		return item.getDescription();
		
		
	}
	
	public String getLocation (Rooms room) //gets player's current location 
	{
		return room.getRoom();
	}

}
