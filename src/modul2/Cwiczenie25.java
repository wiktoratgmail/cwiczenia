package modul2;

import java.util.Scanner;

public class Cwiczenie25 {
	
	/*
	 * 
	 * 
	 *  Styczeń 	31
		Luty 	 	29
		Marzec 		31
		Kwiecień 	30
		Maj 		31
		Czerwiec 	30
		Lipiec 		31
		Sierpień 	31
		Wrzesień  	30
		Październik 31
		Listopad  	30
		Grudzień   	31
	 * 
	 */
	
	 
	
	// liczba dni w miesiacu
	
	public static void main(String[] args) {
		// Miesiace 
		
		String miesiaceArr[] = { 
				"STYCZEŃ", "LUTY", "MARZEC",
				"KWIECIEŃ","MAJ","CZERWIEC",
				"LIPIEC","SIERPIEŃ","WRZESIEN",
				"PAZDZIERNIK","LISTOPAD","GRUDZIEŃ" 
				};
		
		
		int liczbaDniArr[] = {	31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

		int liczba = 1;

		Scanner klawiatura = new Scanner(System.in);
		do {

			System.out.println("Podaj nr miesiaca: ");

			liczba = klawiatura.nextInt();

 
				System.out.print(  miesiaceArr[liczba-1] + " " + liczbaDniArr[liczba-1]);
			 

			System.out.println();
			// powtarzaj petle dopoki uzytkownik nie wprowadzi liczby mniejszej od 1, np. 0
		} while ((liczba > 0) && (liczba < 13));

		klawiatura.close();

	}

}
