package modul2;

import java.util.Random;
import java.util.Scanner;

public class Cwiczenie28 {

	// losowanie

	// losowanie liczb z zadanego przedzialu
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static void main(String[] args) {
		// papier nozyce kamien

		String strPNK[] = { "PAPIER", "NOŻYCE", "KAMIEŃ" };

		// wybierz rzecz

		System.out.println("Zagrajmy w papier, nożyce i kamień. ");

		System.out.println("Wybierz:  ");

		System.out.println("1. Papier  ");

		System.out.println("2. Nożyce ");

		System.out.println("3. Kamień ");

		System.out.println("0. Koniec  ");

		// pobierz wybor uzytkownika
		Scanner klawiatura = new Scanner(System.in);

		int wybor;
		do {

			System.out.println("Podaj wybór: ");
			wybor = klawiatura.nextInt();

			if (wybor == 0) {
				System.out.print("KONIEC");
				break;
			}
			if (wybor > 3) {
				System.out.print("Nie rozumiem!");

			} else

			{
				System.out.println("Wybrales: " + strPNK[wybor-1]);
				
				int wyborKomputera =  randInt(1,3);
				
				System.out.println("A ja wybralem: " + strPNK[wyborKomputera-1]);
				
				if (wyborKomputera == wybor){
					
					System.out.println("REMIS");	
				}
				
				// NOZYCE - PAPIER
				if ((wyborKomputera == 1) && (wybor == 2)){
					
					System.out.println("Twoje nożyce tną mój papier. Przegrałem. ");	
				}
				
				if ((wyborKomputera == 2) && (wybor == 1)){
					
					System.out.println("Moje nożyce tną Twój papier. Wygrałem! ");	
				}
				// NOZYCE - KAMIEN
				
				if ((wyborKomputera == 2) && (wybor == 3)){
					
					System.out.println("Twój kamień tępi nożyce. Przegrałem. ");	
				}
				
				if ((wyborKomputera == 3) && (wybor == 2)){
					
					System.out.println("Twoje nożyce trafiły na kamień. Wygrałem! ");	
				}
				// PAPIER - KAMIEN
				if ((wyborKomputera == 1) && (wybor == 3)){
					
					System.out.println("Mój papier owija Twój kamień. Wygrałem! ");	
				}
				
				if ((wyborKomputera == 3) && (wybor == 1)){
					
					System.out.println("Twoje papier owija mój kamień. Przegrałem! ");	
				}
				
				
				
			}
			System.out.println();
			// powtarzaj petle dopoki uzytkownik nie wprowadzi liczby roznej
			// od 0
		} while (wybor != 0);

		klawiatura.close();
		
		

		// wylosuj rzecz

		// porownaj rzeczy

		// jesli to samo - remis

		// jesli papier i nozyczki - nozyczki
		// jesli papier i kamien - papier
		// jesli kamien i nozyczki - kamien

	}

}
