package modul3;

public class Cwiczenie32 {
	// Powiekszacz
	
	
	public static int zwiekszODwa(int a){ 
		
		return a + 2;
	};
	
	public static void main(String[] args) {
		// Powiększacz
	 
		int a = 1; 
		
		for(int i = 0; i < 5; i++)
		{
		
		System.out.println("przed powiekszeniem: " + a);	
			
		a = zwiekszODwa(a);
	 
		System.out.println("wynik funkcji: " + a);
		}
	}

}
