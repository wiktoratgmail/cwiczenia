package modul3;

import java.util.Scanner;

public class Cwiczenie36 {

	static Scanner klawiatura = new Scanner(System.in);

	public static int wczytajInt()
	{
		String numer = klawiatura.next(); 
		
		int numberInt = Integer.parseInt(numer);
		return numberInt;	 
	} 
	
	public static int porownaj(int a, int b)
	{
	 if (a > b)
		return 1;
		else if (a < b)
		return -1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// odczytaj liczby z klawiatury
		System.out.println("Podaj liczbę a:");	
		
		int a = wczytajInt();
		
		System.out.println("Podaj liczbę b:");	
		
		int b = wczytajInt();
		
		//pobierz wynik (1, -1 lub 0)
		int wynik = porownaj(a,b);
		
		int wynik2 = porownaj(a-1,b+1);

		// wyswietl komunikat 
		
		 String wynikString = null;
		
		 switch (wynik) {
         case 1:  wynikString = "a jest większe od b";
                  break;
         case -1:  wynikString = "b jest większe od a";
                  break;
         case 0:  wynikString = "liczby są równe";
                  break;
       
		 }
	     System.out.println(wynikString);
	     
	     String wynikString2 = null;
			
		 switch (wynik2) {
         case 1:  wynikString2 = "a-1 jest większe od b+1";
                  break;
         case -1:  wynikString2 = "b+1 jest większe od a-1";
                  break;
         case 0:  wynikString2 = "liczby a-1 i b+1 są równe";
                  break;
       
		 }
	     System.out.println(wynikString2);

	     klawiatura.close();
	}

}
