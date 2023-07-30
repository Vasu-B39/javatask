package xworkz.hospital.app;

public class Servicer {
	
	public void Doctor()
	{
		String name="jaan";
		String specilist="dental";
		System.out.println("doctor name is "+name);
		System.out.println("doctor is special for "+specilist);
	}
	
	public void Nurse()
	{
		String name="jaan2";
        int workingHour=8;
		System.out.println("Nurse name is "+name);
		System.out.println("Nurse working hours "+workingHour);
	}
	
	public void Patient()
	{
		String name="jaan3";
        String diseas="Kindney failure";
		System.out.println("Patient name is "+name);
		System.out.println("Patient is diseas as "+diseas);
	}
}
