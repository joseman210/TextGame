/* Item Class
	 * 
	 *05/08/18
	 * This class was where objects of type Item are created and manipulated*/
public class Item 
{
	private String name; 
    private String description;
    private double value;
    
    public Item (String name, String description, double value)  //creates object of type item that takes in name, description, & numerical value
    {
    	this.name= name;
    	this.description= description;
    	this.value=value; 
    	
    }
    
    public Item (String name, String description) 
    {
    	
    }

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getValue () 
	{
		return value;
	}
	
	public void setValue (double value) 
	{
		this.value=value; 
	}
    
    
}

//Scale 
//Needed to graduate= 5.5
