package xworkz.browser.app;

public class Browser {
	
	public String name="Netflix";
	public long user=000;
	
	public Internet internet=new Internet();
	
	public void chrome()
	{
		if(internet!=null)
		{
			System.out.println("Connect for browsing");
					this.internet.Vedios();
		}
		else
		{
			System.out.println("not Connect for browsing");
		}
	}

}
