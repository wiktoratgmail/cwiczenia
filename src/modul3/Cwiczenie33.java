package modul3;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class Cwiczenie33 {
// Uniwersalny kalendarz
  
		public static int wczytajInt()
		{
			Scanner klawiatura = new Scanner(System.in);
			
			String numer = klawiatura.next(); 
			
			int numberInt = Integer.parseInt(numer);
			
			klawiatura.close();
			
			return numberInt;
			 
		} 
	
		
		public static String podajNazweMiesiaca(int numer)
		{
			String miesiaceArr[] = { 
					"STYCZEŃ", "LUTY", "MARZEC",
					"KWIECIEŃ","MAJ","CZERWIEC",
					"LIPIEC","SIERPIEŃ","WRZESIEN",
					"PAZDZIERNIK","LISTOPAD","GRUDZIEŃ" 
					}; 	
			 
			 String miesiac =  miesiaceArr[numer-1];
			 return miesiac; 
		} 
		
		public static int wczytajNumerMiesiaca()
		{
			 
			System.out.println("Podaj numer miesiaca");
			 
			 int numer  = wczytajInt();
			 
			 return numer; 
		} 
		 
		
		public static void main(String[] args) {
			
		int numer = wczytajNumerMiesiaca();
		
		String miesiac = podajNazweMiesiaca(numer);
		
		System.out.print("Miesiąc " + numer + " to " + miesiac);
		
			

		}

 	 
	}


 
