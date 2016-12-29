package modul1;

import java.util.Scanner;

public class Cwiczenie14 {
	
	public static void main(String[] args) {
		// Kelner - oblicza ilosc kieliszkow jaka mozna napelnic z beczki o zadanej pojemnosci
		
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj promien podstawy beczki w cm:");
		double rBeczki = klawiatura.nextDouble();
		System.out.println("podaj wysokosc beczki w cm:");
		double hBeczki = klawiatura.nextDouble();
		System.out.println("podaj pojemnosc kieliszka w ml:");
		double pojemnoscKieliszka = klawiatura.nextDouble();		
		
		// wzor na objetosc walca = Pi * R^2 * h
		
		double objetosc = Math.PI * rBeczki * rBeczki * hBeczki;
		
		// przelicz mililitry na mm3  - 1 milliliters = 1000 cubic millimeters
		
		double pojemnoscKieliszkamm3 = pojemnoscKieliszka * 100;
		
		double iloscKieliszkow = objetosc / pojemnoscKieliszkamm3;
		
		//System.out.println("Objetosc beczki to "); System.out.printf("%.2f",objetosc);
		//System.out.println();
		System.out.println("Ilosc kieliszkow to "); System.out.printf("%.2f",iloscKieliszkow);
		
		klawiatura.close();
	 	 
	}

}
