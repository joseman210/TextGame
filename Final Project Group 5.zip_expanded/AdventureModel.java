/* Adventure Model Class
	 * @author 
	 *05/08/18
	 */
public class AdventureModel 
{
	private static Item[] inventory;
	private static Item item;
	public static void main (String[] args) 
	{
	Player player= new Player ();
	
	Inventory storage= new Inventory (inventory,  item );

	Rooms room= new Rooms(player);
	
player.Rooms(player, room);

	

	
	}
	
	
}
