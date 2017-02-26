package modul3;

import java.util.Scanner;

public class Cwiczenie37 {
// LOGIKA LICZB
	
	static Scanner klawiatura = new Scanner(System.in);

	public static int wczytajInt()
	{
		String numer = klawiatura.next(); 
		
		int numberInt = Integer.parseInt(numer);
		return numberInt;	 
	} 
	
	public static boolean logikaLiczb(int wartosc, int poczatek, int koniec)
	{
		if (wartosc >= poczatek && wartosc <= koniec)
		return true;
		else
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("podaj liczbe");	
		//podaj liczbe
		int wartosc = wczytajInt();
		
		System.out.println("podaj poczatek przedzialu");	
		//podaj poczatek przedzialu
		int poczatek = wczytajInt();
		
		System.out.println("podaj koniec przedzialu");	
		//podaj koniec przedzialu
		int koniec = wczytajInt();

		//wyswietl informacje czy sie miesci
		
		String nie;
		
		if (logikaLiczb(wartosc, poczatek, koniec))
		{
		nie = "miesci";
		}
		else
		{
		nie = "nie miesci";
		
		}
		
		System.out.println("liczba " + wartosc + " " + nie + " sie w przedziale [" + poczatek + ", " + koniec + "]");	
	    klawiatura.close();

	}


}
