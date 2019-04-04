/* Inventory Class
	 * @author 
	 *05/08/18
	 * This class creates an inventory, keeps a running count of the value of each item you pick up, and 
	 * calculates the total value of the items in the inventory*/
	 
import java.util.Scanner;
public class Inventory 
{
	Scanner in = new Scanner(System.in);
    public Item[] inventory;
    private Player playerOne; 
    public int invSpot=0; 

    Item paper= new Item ("Final Expos Paper","You quickly flash back to the red-bull filled, all-nighter you pulled to write this", 2.0); 
    Item juice= new Item ("Jungle Juice","You try not to pass out from the obvious smell of Everclear", -1.25);
    Item ticket= new Item ("Parking Ticket","From that time you decided to park at the faculty lot", -1.25);
    Item sandwich= new Item ("Fat Cat","It's hot, your vision is blurry, you might throw up, maybe this will make you feel better", 2.0);
    Item finger= new Item ("Foam Finger","You wake up to the smell of Natty Light and random people in your living room, it's gameday", 2.0);
    Item write= new Item ("Write up","Your friends thought it would be a good idea to pre-game at your dorm", -1.25);
    Item advice= new Item ("Bad Advice","You try not to pass out from the obvious smell of Everclear", -1.25);
    Item guide= new Item ("Study Guide","The kind soul in your class decided to create a study guide on Google Docs", 2.0 );
    Item brownie= new Item ("Brownie","Your roommate shared a special brownie with you now you're stuck on the couch", -1.25);
    Item laptop= new Item ("OOP Project","You almost forget to submit your final project!", 2.0);
    
   public Inventory (Item[] inventory, Item item) //creates an inventory that holds objects of type Item
   {
	this.inventory = inventory;
   }
   
  public Inventory() {
	  inventory = new Item[10];
  }
    
    public double countItems (Item item) //keeps running count of each item's value
    {
    	for (int i=0; i < inventory.length; i++);
    	double sum=0;
    	sum= sum + item.getValue(); 
		return sum;
    }
    
    public boolean checkScore() { //returns your total score
    	double sum = 0;
    	for(int i = 0; i < inventory.length && inventory[i] !=null; i++) {
    		sum += inventory[i].getValue();
    	}
    	System.out.println("Total score is:"+sum);
    	if(sum >= 6.5) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
  public void addItem(Item item) { //adds item to the inventory 
	  inventory[invSpot] = item;
	  invSpot++;
  }
}