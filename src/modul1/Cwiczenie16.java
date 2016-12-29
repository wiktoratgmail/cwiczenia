package modul1;

import java.util.Scanner;

public class Cwiczenie16 {

	public static void main(String[] args) {
		// BARMAN - ile potrzeba beczek, aby kazda osoba otrzymala szklanke napouju
		// dane - wymiary beczki - promien i wysokosc
		// pojemnosc szklanki
		// liczba osob 
		
		
		
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj promien podstawy beczki w cm:");
		double rBeczki = klawiatura.nextDouble();
		System.out.println("podaj wysokosc beczki w cm:");
		double hBeczki = klawiatura.nextDouble();
		System.out.println("podaj pojemnosc szklanki w ml:");
		double pojemnoscSzklanki = klawiatura.nextDouble();		
		System.out.println("podaj ilosc osob:");
		double iloscOsob = klawiatura.nextDouble();		
		
 		// Beczka 200l promien 58,5 × 82 c
		
		double objetoscBeczki = Math.PI * rBeczki * rBeczki * hBeczki;
		
		System.out.println("Objetosc beczki to "); System.out.printf("%.2f",(objetoscBeczki/1000));
		System.out.println();
		// przelicz mililitry na mm3  - 1 milliliters = 1000 cubic millimeters
		
		double pojemnoscSzklankimm3 = pojemnoscSzklanki * 100;
		
		double iloscBeczek = objetoscBeczki / (pojemnoscSzklankimm3 * iloscOsob);
		
		//System.out.println("Objetosc beczki to "); System.out.printf("%.2f",objetosc);
		//System.out.println();
		System.out.println("Ilosc beczek to " + Math.ceil(iloscBeczek) );
		
		//System.out.printf("%.2f",iloscBeczek);
		
		klawiatura.close();
		
	}

}
