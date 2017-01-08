package modul3;

import java.util.Scanner;

public class Cwiczenie33 {
// Uniwersalny kalendarz
	 
	
	 
		
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
		
		
		public static void main(String[] args) {
			Scanner klawiatura = new Scanner(System.in);
			// Miesiace 
			int numer = 1; 
			do { 
				
				
				
				System.out.println("Podaj nr miesiaca: ");
				
				numer = klawiatura.nextInt(); 
			 
				if  ((numer <= 0) || (numer >= 13))
				{
					System.out.println("Koniec" );
					break;
				}
				else 
				{
				String miesiac = podajNazweMiesiaca(numer); 

				System.out.println("Miesiąc " + numer + " to " + miesiac);
				}
				
				 
			} while ((numer > 0) || (numer < 13));
			klawiatura.close();
		

		}

	 
	}

 
