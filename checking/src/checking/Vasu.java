package checking;

public class Vasu {
	
	public int a ;
	public int b ;
	
	
	public void math(int a, int b) {
		
		
			System.out.println("addition "+ (a + b));
		
		
			System.out.println("subtraction"+(a - b));
			
			System.out.println("multification"+ (a * b));
		
			System.out.println("divison "+ (a / b));
		
			System.out.println("default");
	

		
	}

	public static void main(String[] args) {
		
		Vasu vasu=new Vasu();
		vasu.math(5, 4);
		
		

	
	}

}
