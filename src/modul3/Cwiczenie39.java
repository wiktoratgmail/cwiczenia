/**
 * 
 */
package modul3;

//import java.lang.Object;
import java.util.Random; 
/**
 * @author admin
 * GRA W KOSCI
 */

 
    
 

public class Cwiczenie39 { 
	
	
	
	
	static Random r = new Random();
	
	 
	
	// losowanie dla jednej kostki
	public static int rzucKostka() {
		int wynik;
		
		wynik = r.nextInt(6)+1;
		
		return wynik; 
	}
	
	
	
	public static int podajStawke(int nrGracza, int stawka)
	{
		// sprawdz czy gracz posiada wystarczajaca kwote
		
		//tak - ustaw stawke
		
		//nie - popros gracza o ponowne podanie kwoty
		
		return stawka;
		
	}

	/**
	 * @param args
	 */
	
	 static  int[] gracz = { 
		       100,100,100
		    };
		    
		    static void portfel(int[] gracz, int nrGracza, int kwota)
		    {
		     gracz[nrGracza]= gracz[nrGracza] + kwota;
		     }
			
			 
	
	
	public static void main(String[] args) {
		
		 
		
		for (int r=0; r<3; r++)
		{
		int wynik = rzucKostka();
		System.out.println(wynik + "\n" );
		}
		
		portfel(gracz, 0,1);
		 
		System.out.println(gracz[0] + "\n" );
		
		
		portfel(gracz, 2,3);
		 
		System.out.println(gracz[2] + "\n" );
		
		
		portfel(gracz, 0,-4);
		 
		System.out.println(gracz[0] + "\n" );
		
	}

}
