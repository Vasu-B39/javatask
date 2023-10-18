package About;

public class AboutRunner {
	
	public static void main(String[] info)
	{
		System.out.println("invoke running main menu....");
		
		Country country=new Country();
		System.out.println("country name is "+country.name);
		System.out.println("country code is "+country.code);
		
		System.out.println("==========================================================");
		
		President president=country.a;
		System.out.println("president name is "+president.name);
		System.out.println("president age is "+president.age);
		
		System.out.println("==========================================================");
		
		PrimeMinister primeMinister=president.b;
		System.out.println("PrimeMinister name is "+primeMinister.name);
		System.out.println("PrimeMinister party as "+primeMinister.party);
		
		System.out.println("==========================================================");
		
		SecurityHead securityHead=primeMinister.c;
		System.out.println("SecurityHead name  "+securityHead.name);
		System.out.println("SecurityHead headed is  "+securityHead.headed);
		
		System.out.println("==========================================================");
		
		PersonalAssitant personalAssitant=securityHead.d;
		System.out.println("PersonalAssitant name is  "+personalAssitant.name);
		System.out.println("PersonalAssitant year at  "+personalAssitant.year);
		
		System.out.println("==========================================================");
		
		HomeMinister homeMinister=personalAssitant.e;
		System.out.println("homeMinister name is  "+homeMinister.name);
		System.out.println("homeMinister salary is  "+homeMinister.salary);
		
		
		
		
	}

}
