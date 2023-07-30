package xworkz.shop.app;

public class Shop {
	
	public String name="chacolates";
	SalesMan salesMan=new SalesMan();
	
	public void salesMan()
	{
	if(salesMan!=null)
	{
		salesMan.saler();
		salesMan.buyer();
	}
	}
}
